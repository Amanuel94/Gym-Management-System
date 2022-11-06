/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gymgui;


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private Connection dbcon = null;
    public DBConnection() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/gym_managment_sys";
            String user = "root";
            String pass = "";//Your SQL password here
            this.dbcon = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection!!!!!");
        } catch (SQLException e) {
            System.out.println(e.getErrorCode());
        }
    
    }
    public Connection getDB(){
    return dbcon;
    }


}
