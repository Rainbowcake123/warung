/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warung;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Nur F Aditya
 */
public class koneksi {
      private static Connection koneksi;
    public static Connection connect(){

        try {
            String url="jdbc:mysql://localhost:3306/warung"; //url database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi=DriverManager.getConnection(url, user, pass);            
        } catch (Exception e) {
            System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
        }
        return koneksi;
    }    
}
