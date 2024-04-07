/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bean;

/**
 *
 * @author USER
 */
public class Event {
    
    private int eventID,scoreID,userID,gymnastID;
    private String eventName,eventYear;

    public Event(int eventID, int scoreID, int userID,int gymnastID, String eventName, String eventYear) {
        this.eventID = eventID;
        this.scoreID = scoreID;
        this.userID = userID;
        this.gymnastID = gymnastID;
        this.eventName = eventName;
        this.eventYear = eventYear;
    }

    public int getGymnastID() {
        return gymnastID;
    }

    public void setGymnastID(int gymnastID) {
        this.gymnastID = gymnastID;
    }

    public int getScoreID() {
        return scoreID;
    }

    public void setScoreID(int scoreID) {
        this.scoreID = scoreID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

  

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventYear() {
        return eventYear;
    }

    public void setEventYear(String eventYear) {
        this.eventYear = eventYear;
    }

  
    
}
