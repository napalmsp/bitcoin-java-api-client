package br.com.astarlabs.util;

import java.io.IOException;
import java.io.StringWriter;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Hex;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemObjectGenerator;
import org.bouncycastle.util.io.pem.PemWriter;

public class KeyPairUtil {

	public static KeyPairUtil.Keys generateKeys() throws IOException, GeneralSecurityException {

		Security.addProvider(new BouncyCastleProvider());

		KeyPair keyPair = generateRSAKeyPair();
		RSAPrivateKey priv = (RSAPrivateKey) keyPair.getPrivate();
		RSAPublicKey pub = (RSAPublicKey) keyPair.getPublic();
		
		String privateString = getStringEncodedKey("RSA PRIVATE KEY", priv.getEncoded());
		String publicString = getStringEncodedKey("RSA PUBLIC KEY", pub.getEncoded());
		
		KeyPairUtil.Keys myKeys = new KeyPairUtil().new Keys();
		
		myKeys.privateKey = privateString;
		myKeys.publicKey = publicString;
		
		return myKeys;
		
		
	}
	
	public class Keys{
		String privateKey;
		String publicKey;
		public String getPrivateKey() {
			return privateKey;
		}
		public void setPrivateKey(String privateKey) {
			this.privateKey = privateKey;
		}
		public String getPublicKey() {
			return publicKey;
		}
		public void setPublicKey(String publicKey) {
			this.publicKey = publicKey;
		}
	}
	
	private static String getStringEncodedKey(String header, byte[] key) throws IOException{
		
		StringWriter stringWriter = new StringWriter();
		
		PemWriter writer = new PemWriter(stringWriter);
		PemObjectGenerator pemObject = new PemObject(header, key);
		writer.writeObject(pemObject);
		writer.close();
		
		String newKey = Hex.toHexString(stringWriter.toString().getBytes());
		stringWriter.close();
		
		return newKey;
		
	}
	
	private static KeyPair generateRSAKeyPair() throws NoSuchAlgorithmException, NoSuchProviderException {
		KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA", "BC");
		generator.initialize(2048);

		KeyPair keyPair = generator.generateKeyPair();
		return keyPair;
	}

	public static void main(String[] args)
			throws IOException, GeneralSecurityException {
		generateKeys();
	}

}