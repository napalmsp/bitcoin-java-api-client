package br.com.astarlabs.client;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Security;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

import org.bouncycastle.util.encoders.Hex;
import org.jose4j.jwk.RsaJsonWebKey;
import org.jose4j.jws.AlgorithmIdentifiers;
import org.jose4j.jws.JsonWebSignature;
import org.jose4j.jwt.JwtClaims;

public class Token {

	public static String sign(String key) throws Exception{
		
		Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
		
		String decoded = new String(Hex.decode(key));
		String replaced = decoded.replaceAll("-----BEGIN RSA PRIVATE KEY-----", "")
        .replaceAll("-----END RSA PRIVATE KEY-----", "")
        .replaceAll("\\s", "");
		
		byte[] encodedPrivateKey = Base64.getDecoder().decode(replaced);
		
		PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(encodedPrivateKey);
		KeyFactory kf = KeyFactory.getInstance("RSA", "BC");
		PrivateKey privKey = kf.generatePrivate(keySpec);
		
		JwtClaims claims = new JwtClaims();
	    claims.setExpirationTimeMinutesInTheFuture(10);
	    claims.setGeneratedJwtId();
	    claims.setIssuedAtToNow();
	    claims.setNotBeforeMinutesInThePast(2);
	    
	    JsonWebSignature jws = new JsonWebSignature();

	    jws.setPayload(claims.toJson());
	    jws.setKey(privKey);
	    jws.setAlgorithmHeaderValue(AlgorithmIdentifiers.RSA_USING_SHA256);

	    String innerJwt = jws.getCompactSerialization();
	    
	    return innerJwt;
		
	}

}
