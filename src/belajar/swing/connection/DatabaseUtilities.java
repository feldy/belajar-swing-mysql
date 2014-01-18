/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajar.swing.connection;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author feldy
 */
public class DatabaseUtilities {
    private static Connection conn;
    
    public static Connection getConnection() {
        if (conn == null) {
            try {
                DriverManager.registerDriver(new Driver());
                conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/belajar_swing","root","admin");
            } catch (SQLException e) {
                Logger.getLogger(DatabaseUtilities.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        
        return conn;
    }
}   
