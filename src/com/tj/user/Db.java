/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tj.user;

import java.sql.*;

/**
 *
 * @author rajthanga
 */
public class Db {
     
    static Connection conn;
    static Statement stt;
    final static String URL="jdbc:mysql://localhost/false_data";
    final static String user="root";
    final static String pass="admin";
        
     public static Connection con() {
         try{
    Class.forName("com.mysql.jdbc.Driver");
    conn=DriverManager.getConnection(URL, user, pass);
    
    }catch(ClassNotFoundException | SQLException e){}
        return conn;
       
}
     public static Statement st() { 
         try{
       stt=con().createStatement();
       
     }catch(SQLException e){}
        return stt;
     }
}
