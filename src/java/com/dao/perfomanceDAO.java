/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

import com.bean.Event;
import com.connection.DBConnect;
import com.connection.QueryDBPerfomance;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class perfomanceDAO extends QueryDBPerfomance {
 DBConnect db = new DBConnect();
    public perfomanceDAO(){}
    
    public String listAllEvent(){
        return "select * from  event e join gymnast g on e.gymnastID = g.gymnastID join score s on s.scoreID = e.scoreID join user u on u.userID = e.userID";
    }
      public String listEventByID() {
        return "select * from event e join score s on e.scoreID = s.scoreID JOIN gymnast g on e.gymnastID = g.gymnastID join user u on e.userID = u.userID where userID = ?";
    }
    
     public List < Event > listAllDataEvent(){
      List <Event> event = new ArrayList <>();
        try(Connection con = db.getConnection();
                PreparedStatement pst= con.prepareStatement(listAllEvent())){
           ResultSet rs = pst.executeQuery();
           while(rs.next()){
               
               
               int eventID = rs.getInt("eventID");
               int scoreID = rs.getInt("scoreID");
               int userID = rs.getInt("userID");
               String eventName = rs.getString("eventName");
                       String eventYear = rs.getString("eventYear");
                               double scoreD = rs.getDouble("scoreD");
                                       double scoreA = rs.getDouble("scoreA");
                                               double scoreE = rs.getDouble("scoreE");
                                                       double technicalDeduction = rs.getDouble("technicalDeduction");
                                                       
                                                               int gymnastID = rs.getInt("gymnastID");
                                                               String gymnastName = rs.getString("gymnastName");
                                                                       String gymnastState = rs.getString("gymnastState");
                                                                               String profilePicture = rs.getString("profilePicture");
                                                                                       String category = rs.getString("category");
                                                                                               String program = rs.getString("program");
                                                                                                       String username = rs.getString("username");
                                                                                                               String userType = rs.getString("userType");
                                                                                                               
                  event.add(new Event(eventID,scoreID,userID,gymnastID,eventName,eventYear));
           }
        }catch(SQLException e){
            printSQLException(e);
        }
        return event;
    }
     
            public List < Event > listAllDataEventByID(int id){
      List <Event> event = new ArrayList <>();
        try(Connection con = db.getConnection();
                PreparedStatement pst= con.prepareStatement(listEventByID())){
            pst.setInt(1, id);
           ResultSet rs = pst.executeQuery();
           while(rs.next()){
               
               int eventID = rs.getInt("eventID");
               int scoreID = rs.getInt("scoreID");
               int userID = rs.getInt("userID");
               String eventName = rs.getString("eventName");
                       String eventYear = rs.getString("eventYear");
                               double scoreD = rs.getDouble("scoreD");
                                       double scoreA = rs.getDouble("scoreA");
                                               double scoreE = rs.getDouble("scoreE");
                                                       double technicalDeduction = rs.getDouble("technicalDeduction");
                                                               int gymnastID = rs.getInt("gymnastID");
                                                               String gymnastName = rs.getString("gymnastName");
                                                                       String gymnastState = rs.getString("gymnastState");
                                                                               String profilePicture = rs.getString("profilePicture");
                                                                                       String category = rs.getString("category");
                                                                                               String program = rs.getString("program");
                                                                                                       String username = rs.getString("username");
                                                                                                               String userType = rs.getString("userType");
                                                                                                               
             event.add(new Event(eventID,scoreID,userID,gymnastID,eventName,eventYear));
           }
        }catch(SQLException e){
            printSQLException(e);
        }
        return event;
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
