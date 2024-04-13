/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.connection;

/**
 *
 * @author USER
 */
public abstract class QueryDBEvent {
    
    public QueryDBEvent(){}
    
    public abstract String listAllEvent();
    public abstract String listEventByID();
    public abstract String insertEvent();
    public abstract String updateEvent();
     public abstract String deleteEvent();
}
