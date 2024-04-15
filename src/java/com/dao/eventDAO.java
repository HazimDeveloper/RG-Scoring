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
        return "select * from event";
    }

    public String listEventByID() {
        return "select * from event where eventID = ?";
    }

    public String insertEvent() {
        return "insert into event(eventName,eventYear,program,category) values (?,?,?,?,?)";
    }

    public String updateEvent() {
        return "update event set eventName = ? , eventYear = ? , category = ?,program = ? where eventID = ?";
    }
    
    public String deleteEvent(){
          return "delete from event where eventID = ?";
    }
    
    public List < Event > listAllDataEvent(){
      List <Event> event = new ArrayList <>();
        try(Connection con = db.getConnection();
                PreparedStatement pst= con.prepareStatement(listAllEvent())){
           ResultSet rs = pst.executeQuery();
           while(rs.next()){
               
               
               int eventID = rs.getInt("eventID");
               String eventName = rs.getString("eventName");
                       String eventYear = rs.getString("eventYear");
                        String category = rs.getString("category");
                        String program = rs.getString("program");
                                                                                                               
                  event.add(new Event(eventID,eventName,eventYear,category,program));
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
               String eventName = rs.getString("eventName");
                       String eventYear = rs.getString("eventYear");
                        String category = rs.getString("category");
                        String program = rs.getString("program");
                                                                                                               
                  event.add(new Event(eventID,eventName,eventYear,category,program));
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
                pst.setString(3,event.getCategory());
                
                pst.setString(4,event.getProgram());
                
                pst.executeUpdate();
            }catch(SQLException e){
                printSQLException(e);
            }
       }
       
       public void updateDataEvent(Event event){
           try(Connection con = db.getConnection(); PreparedStatement pst = con.prepareStatement(updateEvent())){
              pst.setString(1,event.getEventName());
                pst.setString(2,event.getEventYear());
                 pst.setString(3,event.getCategory());
                  pst.setString(4,event.getProgram());
                pst.setInt(5, event.getEventID());
                pst.executeUpdate();
           }catch(SQLException e){
           printSQLException(e);
           }
       }
       
       public boolean deleteDataEvent(int eventID){
             boolean rowDeleted = false;
          
          try(Connection con = db.getConnection();
                  PreparedStatement pst = con.prepareStatement(deleteEvent())){
              
              pst.setInt(1, eventID);
              rowDeleted = pst.executeUpdate() > 0;
          }catch(SQLException e){
              printSQLException(e);
          }
          return rowDeleted;
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
