/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

import com.bean.User;
import com.connection.DBConnect;
import com.connection.QueryDBUser;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
import java.sql.PreparedStatement;

import jakarta.xml.bind.DatatypeConverter;
/**
 *
 * @author USER
 */
public class userDAO extends QueryDBUser {
    
  
       DBConnect db = new DBConnect();
       
    public userDAO(){}
    
    public String loginUser(){
        return "Select * from user where username = ? and password = ?";
    }
    
    
//    public boolean loginPanel(User user){
//        
//        boolean status = false;
//        try(Connection con = db.getConnection();PreparedStatement pst = con.prepareStatement(loginUser())){
//
//            pst.setString(1,user.getUsername());
//            pst.setString(2,user.getPassword());
//
//            ResultSet rs = pst.executeQuery();
//        status = rs.next();
//        }catch(SQLException e){
//            printSQLException(e);
//        }
//        
//        return status;
//        }
    
    public User getUserDetailByUsername(User user){
        try(Connection con = db.getConnection();PreparedStatement pst = con.prepareStatement(loginUser())){
            pst.setString(1, user.getUsername());
            pst.setString(2, hashPassword(user.getPassword()));
            
            ResultSet rs = pst.executeQuery();
             if(rs.next()){
               int userID = rs.getInt("userID");
               String username = rs.getString("username");
               String password = rs.getString("password");
               String userType = rs.getString("userType");
               
               return new User(userID,username,password,userType);
             }
        }catch(SQLException e){
            printSQLException(e);
        }
        return null;
    }
    
    public String hashPassword(String password){
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(password.getBytes());
            byte[] bytes = md.digest();
             String hashedPassword = DatatypeConverter.printHexBinary(bytes).toLowerCase();
             return hashedPassword;
            
        }catch(NoSuchAlgorithmException e){
            e.printStackTrace();
            return null;
        }
    }
    
    

    
    
      private void printSQLException(SQLException ex){
            for(Throwable e: ex){
                if(e instanceof SQLException){
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                
                Throwable t = ex.getCause();
                while (t != null){
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
            }
        }
}
