/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

import com.bean.Event;
import com.bean.Gymnast;
import com.bean.Perfomance;
import com.bean.Score;
import com.bean.User;
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
      public String listGymnastByID() {
        return "select * from perfomance p join event e on p.eventID = e.eventID join score s on p.scoreID = s.scoreID JOIN gymnast g on p.gymnastID = g.gymnastID join user u on p.userID = u.userID where p.gymnastID = ?;";
    }
      public String specificEventByID(){
          return "select * from perfomance p join event e on p.eventID = e.eventID join score s on p.scoreID = s.scoreID join gymnast g on p.gymnastID = g.gymnastID join user u on p.userID = u.userID where p.eventID = ?";
    
      }
      
      public String listDataJudgeWithEventHandled(){
          return "select * from perfomance p join user u on p.userID = u.userID join event e on p.eventID = e.eventID where u.userID = 'judge' ";
      }
      public String listDataManagerWithEventHandled(){
          return "select * from perfomance p join user u on p.userID = u.userID join event e on p.eventID = e.eventID where u.userID = 'manager' ";
      }
      
      public List <Perfomance> ListJudgeWithEventHandled(){
          
      List <Perfomance> perfomance = new ArrayList <>();
      List <Event> event = new ArrayList <>();
      List <User> user = new ArrayList <>();
      
      try(Connection con = db.getConnection();PreparedStatement pst = con.prepareStatement(listDataJudgeWithEventHandled())){
          ResultSet rs = pst.executeQuery();
          
          while(rs.next()){
                  int eventID = rs.getInt("eventID");
             
               String eventName = rs.getString("eventName");
                       String eventYear = rs.getString("eventYear");
                String category = rs.getString("category");
                  String program = rs.getString("program");
                     String username = rs.getString("username");
            String userType = rs.getString("userType");
                  
           event.add(new Event(eventID,eventName,eventYear,category,program));
                  user.add(new User (username,userType));
                  
                    perfomance.add(new Perfomance(event,user));
          }
      }catch(SQLException e){
          printSQLException(e);
      }
      return perfomance;
      }
      
      public List <Perfomance> ListManagerWithEventHandled(){
          
      List <Perfomance> perfomance = new ArrayList <>();
      List <Event> event = new ArrayList <>();
      List <User> user = new ArrayList <>();
      
      try(Connection con = db.getConnection();PreparedStatement pst = con.prepareStatement(listDataManagerWithEventHandled())){
          ResultSet rs = pst.executeQuery();
          
          while(rs.next()){
                  int eventID = rs.getInt("eventID");
             
               String eventName = rs.getString("eventName");
                       String eventYear = rs.getString("eventYear");
                String category = rs.getString("category");
                  String program = rs.getString("program");
                     String username = rs.getString("username");
            String userType = rs.getString("userType");
                  
           event.add(new Event(eventID,eventName,eventYear,category,program));
                  user.add(new User (username,userType));
                  
                    perfomance.add(new Perfomance(event,user));
          }
      }catch(SQLException e){
          printSQLException(e);
      }
      return perfomance;
      }
      
     public List < Perfomance > listAllDataEvent(){
         
      List <Perfomance> perfomance = new ArrayList <>();
      List <Event> event = new ArrayList <>();
      List <User> user = new ArrayList <>();
      List <Score> score = new ArrayList <>();
      List <Gymnast> gymnast = new ArrayList <>();
      
      
        try(Connection con = db.getConnection();
                PreparedStatement pst= con.prepareStatement(listAllEvent())){
           ResultSet rs = pst.executeQuery();
           while(rs.next()){
               
               
               int eventID = rs.getInt("eventID");
             
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
                                                                                                               
                  event.add(new Event(eventID,eventName,eventYear,category,program));
                  user.add(new User (username,userType));
                  score.add(new Score(scoreD,scoreA,scoreE,technicalDeduction));
                  gymnast.add(new Gymnast(gymnastID,gymnastName,gymnastState,profilePicture));
                  
                  perfomance.add(new Perfomance(event,user,score,gymnast));
           }
        }catch(SQLException e){
            printSQLException(e);
        }
        return perfomance;
    }
     
            public List < Perfomance > listAllDataEventByID(int id){
       
      List <Perfomance> perfomance = new ArrayList <>();
      List <Event> event = new ArrayList <>();
      List <User> user = new ArrayList <>();
      List <Score> score = new ArrayList <>();
      List <Gymnast> gymnast = new ArrayList <>();
      
      
        try(Connection con = db.getConnection();
                PreparedStatement pst= con.prepareStatement(specificEventByID())){
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
                                                                                                               
                  event.add(new Event(eventID,eventName,eventYear,category,program));
                  user.add(new User (username,userType));
                  score.add(new Score(scoreD,scoreA,scoreE,technicalDeduction));
                  gymnast.add(new Gymnast(gymnastID,gymnastName,gymnastState,profilePicture));
                  
                  perfomance.add(new Perfomance(event,user,score,gymnast));
           }
        }catch(SQLException e){
            printSQLException(e);
        }
        return perfomance;
    }
            
                 public List < Perfomance > listAllDataGymnastByID(int id){
       
      List <Perfomance> perfomance = new ArrayList <>();
      List <Event> event = new ArrayList <>();
      List <User> user = new ArrayList <>();
      List <Score> score = new ArrayList <>();
      List <Gymnast> gymnast = new ArrayList <>();
      
      
        try(Connection con = db.getConnection();
                PreparedStatement pst= con.prepareStatement(listGymnastByID())){
           pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
           while(rs.next()){
               
               
               int eventID = rs.getInt("eventID");
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
                                                                                                               
                  event.add(new Event(eventID,eventName,eventYear,category,program));
                  user.add(new User (username,userType));
                  score.add(new Score(scoreD,scoreA,scoreE,technicalDeduction));
                  gymnast.add(new Gymnast(gymnastID,gymnastName,gymnastState,profilePicture));
                  
                  perfomance.add(new Perfomance(event,user,score,gymnast));
           }
        }catch(SQLException e){
            printSQLException(e);
        }
        return perfomance;
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
