/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilities;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author catchlrnovo
 */
public class passwordHash {
    public static String getHash(String password){
            String salt = "V0^vB9ndbSV^S!kgVGnb0ML5Hx8cNd1JG*grIZy*fqMM7A1PzH3PX7SQ*x)^s-Zu";

            String securePassword = getSecurePassword(password, salt);
            
            return securePassword;
    }
    
    private static String getSecurePassword(String passwordToHash, String salt)
    {
            String generatedPassword = null;
            try {
                    // Create MessageDigest instance for MD5
                    MessageDigest md = MessageDigest.getInstance("MD5");
                    //Add password bytes to digest
                    md.update(salt.getBytes());
                    //Get the hash's bytes 
                    byte[] bytes = md.digest(passwordToHash.getBytes());
                    //This bytes[] has bytes in decimal format;
                    //Convert it to hexadecimal format
                    StringBuilder sb = new StringBuilder();
                    for(int i=0; i< bytes.length ;i++)
                    {
                            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
                    }
                    //Get complete hashed password in hex format
                    generatedPassword = sb.toString();
            } 
            catch (NoSuchAlgorithmException e) {
            }
            return generatedPassword;
    }   
}
