/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstapplication;


import java.sql.*;
import javax.swing.*;
/**
 *
 * @author mtariqm
 */
public class conClass {
     static Connection con=null;
    
 public static Connection conDB(){
    
    try
        {
            //Load and register SQL Server driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    
    
        String url = "jdbc:sqlserver://MTARIQM-PC\\MSSQLSERVER:1433;databaseName=CSE_DEPT;";
       
        //Establish a connection
        try {
            
        con = DriverManager.getConnection(url,"sa","bat3011");
        //con = DriverManager.getConnection(url);
            JOptionPane.showMessageDialog(null,"Connected");
                 return con;    
            }
            catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
            return null;
        }
    
    }
    
}
