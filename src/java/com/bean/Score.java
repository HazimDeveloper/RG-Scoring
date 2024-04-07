/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bean;

/**
 *
 * @author USER
 */
public class Score {
    
    int scoreID;
            double scoreD,scoreA,scoreE,techDeduct;

    public Score(int scoreID, double scoreD, double scoreA, double scoreE, double techDeduct) {
       
        this.scoreID = scoreID;
        this.scoreD = scoreD;
        this.scoreA = scoreA;
        this.scoreE = scoreE;
        this.techDeduct = techDeduct;
    }
    
     public Score(double scoreD, double scoreA, double scoreE, double techDeduct) {
       
        this.scoreID = scoreID;
        this.scoreD = scoreD;
        this.scoreA = scoreA;
        this.scoreE = scoreE;
        this.techDeduct = techDeduct;
    }

    public int getScoreID() {
        return scoreID;
    }

    public void setScoreID(int scoreID) {
        this.scoreID = scoreID;
    }

    public double getScoreD() {
        return scoreD;
    }

    public void setScoreD(double scoreD) {
        this.scoreD = scoreD;
    }

    public double getScoreA() {
        return scoreA;
    }

    public void setScoreA(double scoreA) {
        this.scoreA = scoreA;
    }

    public double getScoreE() {
        return scoreE;
    }

    public void setScoreE(double scoreE) {
        this.scoreE = scoreE;
    }

    public double getTechDeduct() {
        return techDeduct;
    }

    public void setTechDeduct(double techDeduct) {
        this.techDeduct = techDeduct;
    }
    
    
}

