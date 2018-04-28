/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nome
 */
public class BDManager {
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdb", "root", "root");
        return conn;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BDManager.class.getName()).log(Level.SEVERE, null, ex);return null;
        } catch (SQLException ex) {
            Logger.getLogger(BDManager.class.getName()).log(Level.SEVERE, null, ex);return null;
        }
        
    }
}
