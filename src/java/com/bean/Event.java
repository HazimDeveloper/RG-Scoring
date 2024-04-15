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
    
    private int eventID;
    private String eventName,eventYear,category,program;
    
    
    public Event(int eventID, String eventName, String eventYear) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventYear = eventYear;
    }

    public Event(int eventID, String eventName, String eventYear, String category, String program) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventYear = eventYear;
        this.category = category;
        this.program = program;
    }

    public String getCategory() {
        return category;
    }

    public String getProgram() {
        return program;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setProgram(String program) {
        this.program = program;
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
