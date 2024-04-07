/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

import com.bean.Score;
import com.connection.DBConnect;
import com.connection.QueryDBScore;
import java.sql.*;

/**
 *
 * @author USER
 */
public class scoreDAO extends QueryDBScore{
    
    DBConnect db = new DBConnect();

    public scoreDAO(){}
    public String insertScore() {
        
        return "insert into score (scoreD,scoreA,scoreE,technicalDeduction) values (?,?,?,?)";
          }

    public String updateScore() {
    
        return "update score set scoreD = ? , scoreA = ?,scoreE = ?,technicalDeduction = ? WHERE scoreID = ?";
    }
    
    public String getScoreByID(){
        return "select * from score where scoreID";
    }
    public void insertDataScore(Score score){
        try(Connection con = db.getConnection();
                PreparedStatement pst = con.prepareStatement(insertScore())){
            pst.setDouble(1, score.getScoreD());
            pst.setDouble(2,score.getScoreA());
            pst.setDouble(3, score.getScoreE());
            pst.setDouble(4, score.getTechDeduct());
            
            pst.executeUpdate();
        }catch(SQLException e){
            printSQLException(e);
        }
    }
    
    public void updateDataScore(Score score){
        try(Connection con = db.getConnection();
                PreparedStatement pst = con.prepareStatement(updateScore())){
            pst.setDouble(1, score.getScoreD());
            pst.setDouble(2,score.getScoreA());
            pst.setDouble(3, score.getScoreE());
            pst.setDouble(4, score.getTechDeduct());

            pst.setInt(5, score.getScoreID());
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
