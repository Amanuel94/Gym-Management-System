/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gymgui;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class sqltry {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        // TODO code application logic here
        DBConnection conn = new DBConnection();
        Connection db = conn.getDB();
        Statement st = db.createStatement();
        ResultSet rs = st.executeQuery("SELECT * from client;");
        while(rs.next()){
            System.out.print(rs.getString("cfame"));
        
        }

    }
    
}
