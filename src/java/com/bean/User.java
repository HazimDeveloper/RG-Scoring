/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bean;

/**
 *
 * @author USER
 */
public class User {
    
    int userID;
    String username,password,userType;

    public User(int userID, String username, String password, String userType) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.userType = userType;
    }
    
       public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String roleType) {
        this.userType = roleType;
    }
    
    
    
}
