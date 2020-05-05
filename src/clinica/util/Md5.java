/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author celso
 */
public class Md5 {    
   
    public String crypt(String senha)
    {
        String sen;
        MessageDigest md = null;
    
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Md5.class.getName()).log(Level.SEVERE, null, ex);
        }
        BigInteger hash = new BigInteger(1, md.digest(senha.getBytes()));
        sen = hash.toString(16);
        return sen;
    }

}
