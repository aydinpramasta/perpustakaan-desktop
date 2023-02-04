/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan.utils;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author aydin
 */
public class Database {
    public java.sql.Connection connection;
    
    public Database() {
        try {
            // jdbc:mariadb://localhost:3306/db_perpus?user=root&password="
            String URL = "jdbc:mariadb://" + Config.DB_HOST + ":" + Config.DB_PORT + "/" + Config.DB_NAME + "?" + "user=" + Config.DB_USER + "&" + "password=" + Config.DB_PASSWORD;
            
            this.connection = DriverManager.getConnection(URL);
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, "Error koneksi ke database: " + exception.getMessage());
        }
    }
    
    public void close() {
        try {
            this.connection.close();
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, "Error penutupan koneksi ke database: " + exception.getMessage());
        }
    }
}
