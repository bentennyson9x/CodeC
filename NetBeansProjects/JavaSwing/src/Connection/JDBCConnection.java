/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ForWhat
 */
public class JDBCConnection {
    public static Connection getJDBCConnection(){
        final String url = "jdbc:mysql://localhost:3306/temp";
        final String user="root";
        final String password="";
        try {
            return DriverManager.getConnection(url, user, password);      
        }  catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static void main(String[] args) {
        Connection connection = getJDBCConnection();
        if (connection!= null){
            System.out.println("Thanh cong");
        }else{
            System.out.println("Loi");
        }
    }
    
}
