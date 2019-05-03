/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Receiver;

import com.tj.user.Db;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Admin
 */
public class logdetails {

    String nodename, action, time;
    String rname, rpassword;
    ResultSet rs;


    public logdetails(String NodeName, String Action) {
        nodename = NodeName;
        action = Action;
     try {

            java.util.Date now = new java.util.Date();
                              String DATE_FORMAT = "yyyy-MM-dd hh:mm:ss";
                              SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
                              String strDateNew = sdf.format(now) ;
            try {

                String table = "INSERT INTO  logdetails (nodename, action, time) values('" + nodename + "','" + action + "','" + strDateNew + "')";
                Db.st().execute(table);
                System.out.println("Table creation process successfully!");

            } catch (SQLException s) {
                s.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) { 
    
    }

}