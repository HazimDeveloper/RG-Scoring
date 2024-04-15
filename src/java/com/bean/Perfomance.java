/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bean;

import java.util.List;

/**
 *
 * @author USER
 */
public class Perfomance {
    private List <Event> event;
    private List <User> user;
    private List <Score> score;
    private List <Gymnast> gymnast;

    public Perfomance(List<Event> event, List<User> user, List<Score> score, List<Gymnast> gymnast) {
        this.event = event;
        this.user = user;
        this.score = score;
        this.gymnast = gymnast;
    }
    public Perfomance(List<Event> event, List<User> user) {
        this.event = event;
        this.user = user;
    }
    

    public List<Event> getEvent() {
        return event;
    }

    public void setEvent(List<Event> event) {
        this.event = event;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public List<Score> getScore() {
        return score;
    }

    public void setScore(List<Score> score) {
        this.score = score;
    }

    public List<Gymnast> getGymnast() {
        return gymnast;
    }

    public void setGymnast(List<Gymnast> gymnast) {
        this.gymnast = gymnast;
    }

 

   

  
    

}
