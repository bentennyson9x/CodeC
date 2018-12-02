/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ForWhat
 */
public class JDBCStatement {
    public static void main(String[] args) {
        try {
            Connection con = JDBCConnection.getJDBCConnection();
            Statement statement = con.createStatement();
            String query = "Select * From ete";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {                
                System.out.println(resultSet.getInt("ID")+" "+resultSet.getString("Name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(JDBCStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
