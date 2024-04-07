/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

import com.bean.Event;
import com.connection.DBConnect;
import com.connection.QueryDBEvent;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class eventDAO extends QueryDBEvent{
    DBConnect db= new DBConnect();
    public eventDAO(){}

    public String listAllEvent() {
        return "select * from event e join score s on e.scoreID = s.scoreID JOIN gymnast g on e.gymnastID = g.gymnastID join user u on e.userID = u.userID";
    }

    public String listEventByID() {
        return "select * from event e join score s on e.scoreID = s.scoreID JOIN gymnast g on e.gymnastID = g.gymnastID join user u on e.userID = u.userID where userID = ?";
    }

    public String insertEvent() {
        return "insert into event(eventName,eventYear,scoreID,gymnastID,userID) values (?,?,?,?,?)";
    }

    public String updateEvent() {
        return "update event set eventName = ? , eventYear = ? , scoreID = ?,gymnastID = ? , userID = ? where eventID = ?";
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
       
       public void insertDataEvent(Event event){
            try(Connection con = db.getConnection(); PreparedStatement pst = con.prepareStatement(insertEvent())){
                
                pst.setString(1,event.getEventName());
                pst.setString(2,event.getEventYear());
                //score gymnast user
                pst.setInt(3,event.getScoreID());
                pst.setInt(4,event.getGymnastID());
                pst.setInt(5, event.getUserID());
                
                pst.executeUpdate();
            }catch(SQLException e){
                printSQLException(e);
            }
       }
       
       public void updateDataEvent(Event event){
           try(Connection con = db.getConnection(); PreparedStatement pst = con.prepareStatement(updateEvent())){
              pst.setString(1,event.getEventName());
                pst.setString(2,event.getEventYear());
                //score gymnast user
                pst.setInt(3,event.getScoreID());
                pst.setInt(4,event.getGymnastID());
                pst.setInt(5, event.getUserID());
                
                pst.setInt(6, event.getEventID());
                pst.executeUpdate();
           }catch(SQLException e){
           printSQLException(e);
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
