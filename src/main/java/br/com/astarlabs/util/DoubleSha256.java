package br.com.astarlabs.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DoubleSha256 {
    
	public static String hashFile(byte[] fileToHash) {

		MessageDigest sha256 = null;
		try {
			sha256 = MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}
	    byte[] digest = sha256.digest(fileToHash);
	    byte[] byteData = sha256.digest(digest);

        StringBuffer hexString = new StringBuffer();
    	for (int i=0;i<byteData.length;i++) {
    		String hex=Integer.toHexString(0xff & byteData[i]);
   	     	if(hex.length()==1) hexString.append('0');
   	     	hexString.append(hex);
    	}
    	
    	return hexString.toString();
    	
    }
}