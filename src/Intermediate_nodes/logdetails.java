/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intermediate_nodes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

/**
 *
 * @author Admin
 */
public class logdetails {

    String nodename, action, time;
    String rname, rpassword;
    ResultSet rs;
    Statement st;
    Connection dbConnection;

    public logdetails(String NodeName, String Action) {
        nodename = NodeName;
        action = Action;
     try {

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            dbConnection = DriverManager.getConnection("jdbc:odbc:server;databaseName=eeack;user=sa;password=saadmin;");
            st = dbConnection.createStatement();
            java.util.Date now = new java.util.Date();
                              String DATE_FORMAT = "yyyy-MM-dd hh:mm:ss";
                              SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
                              String strDateNew = sdf.format(now) ;
            try {

                String table = "INSERT INTO  logdetails values('" + nodename + "','" + action + "','" + strDateNew + "')";
                st.execute(table);
                System.out.println("Table creation process successfully!");

            } catch (SQLException s) {
                s.printStackTrace();
            }
            dbConnection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {

    }

}
