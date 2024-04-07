/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class DBConnect {
    
    public DBConnect(){}
    
       private String jdbcURL = "jdbc:mysql://localhost:3306/rgscoring?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "";

    public String getJdbcURL() {
        return jdbcURL;
    }

    public String getJdbcUsername() {
        return jdbcUsername;
    }

    public String getJdbcPassword() {
        return jdbcPassword;
    }
    
     public Connection getConnection(){
            
            
            Connection con = null;
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        }catch(SQLException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        return con;
    }
    
}
