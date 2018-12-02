/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bcrypt;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author ForWhat
 */
public class BcryptPassword {
    public static void main(String[] args) {
        String password = "Nguyendeptrai";
        String hash = BCrypt.hashpw(password, BCrypt.gensalt(12));
        System.out.println(hash);
        System.out.println(BCrypt.checkpw(password, hash));
    }
    
}
