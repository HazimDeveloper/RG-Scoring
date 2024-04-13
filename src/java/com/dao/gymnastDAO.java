/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

import com.bean.Gymnast;
import com.connection.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.connection.QueryDBGymnast;

/**
 *
 * @author USER
 */
public class gymnastDAO extends QueryDBGymnast{
    
    
    
    public gymnastDAO(){}
    
       DBConnect db = new DBConnect();
    
       public String insertGymnast(){
           return "INSERT INTO gymnast(gymnastName,gymnastState,profilePicture,category,program) VALUES (?,?,?,?,?)";
       }
       
       public String updateGymnast(){
           return "UPDATE gymnast SET gymnastName = ?, gymnastState = ?,profilePicture=?,category=?,program=? ";
       }
       
       public String deleteGymnast(){
           return "DELETE gymnast WHERE gymnastID = ?";
       }
       
       public String listGymnast(){
        return "SELECT * FROM gymnast";   
       }
       
       public String listGymnastByID(){
           return "SELECT * FROM gymnast WHERE gymnastID = ?";
       }
       
      public void addGymnast(Gymnast gym){
            try(Connection con = db.getConnection(); PreparedStatement pst = con.prepareStatement(insertGymnast())){
                
                pst.setString(1,gym.getGymnastName());
                pst.setString(2, gym.getGymnastState());
                 pst.setString(3, gym.getProfilePicture());
                 pst.setString(4,gym.getCategory());
                 pst.setString(5,gym.getProgram());
            
            pst.executeUpdate();
            }catch(SQLException e){
                printSQLException(e);
            }
        }
      
      public boolean updateGymnast(Gymnast gym){
          boolean rowUpdated = false;
          
          try(Connection con = db.getConnection();
                  PreparedStatement pst = con.prepareStatement(updateGymnast())){
              
              pst.setString(1, gym.getGymnastName());
              pst.setString(2, gym.getGymnastState());
              pst.setString(3, gym.getProfilePicture());
              pst.setString(4, gym.getCategory());
              pst.setString(5,gym.getProgram());
              
              rowUpdated = pst.executeUpdate() > 0;
          }catch(SQLException e){
              printSQLException(e);
          }
          return rowUpdated;
      }
      
      public boolean deleteGymnast(int gymnastID){
          boolean rowDeleted = false;
          
          try(Connection con = db.getConnection();
                  PreparedStatement pst = con.prepareStatement(deleteGymnast())){
              
              pst.setInt(1, gymnastID);
              rowDeleted = pst.executeUpdate() > 0;
          }catch(SQLException e){
              printSQLException(e);
          }
          return rowDeleted;
      }
      
      public List <Gymnast> allGymnast(){
          List <Gymnast> gyms = new ArrayList<>();
          
          try(Connection con = db.getConnection();
                  PreparedStatement pst = con.prepareStatement("listGymnast")){
              ResultSet rs =pst.executeQuery();
              
              while(rs.next()){
                  int id = rs.getInt("gymnastID");
                  String name = rs.getString("gymnastName");
                  String state = rs.getString("gymnastState");
                  String profilePicture =rs.getString("profilePicture");
                  String category = rs.getString("category");
                  String program = rs.getString("program");
                  
                  gyms.add( new Gymnast(id,name,state,profilePicture,category,program));
              }
          }catch(SQLException e){
              printSQLException(e);
          }
          return gyms;
      }
      
      public List <Gymnast> GymnastByID(int gymnastID){
          List <Gymnast> gyms = new ArrayList<>();
          
          try(Connection con = db.getConnection();
                  PreparedStatement pst = con.prepareStatement(listGymnastByID())){
              pst.setInt(1, gymnastID);
              ResultSet rs = pst.executeQuery();
              
              while(rs.next()){
                          int id = rs.getInt("gymnastID");
                  String name = rs.getString("gymnastName");
                  String state = rs.getString("gymnastState");
                  String profilePicture =rs.getString("profilePicture");
                  String category = rs.getString("category");
                  String program = rs.getString("program");
                  
                  gyms.add( new Gymnast(id,name,state,profilePicture,category,program));
            
              }
          }catch(SQLException e){
          printSQLException(e);
          }
          return gyms;
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
