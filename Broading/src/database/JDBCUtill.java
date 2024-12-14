/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Haitaiba
 */
public class JDBCUtill {

    public static Connection getConnection() {
        Connection c = null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/phongtro";
            String username = "root";
            String password = "";
            DriverManager.getConnection(url, url, password);
        } catch (SQLException ex) {
            Logger.getLogger(JDBCUtill.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) { 
            Logger.getLogger(JDBCUtill.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    public static void closeConnection(Connection c) {
        if (c != null) {
            try {
                c.close();
            } catch (SQLException ex) {
                Logger.getLogger(JDBCUtill.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
        }
    }
}
