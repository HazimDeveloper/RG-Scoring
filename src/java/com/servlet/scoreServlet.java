/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.servlet;

import com.bean.Event;
import com.bean.Score;
import com.dao.eventDAO;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *
 * @author USER
 */
@WebServlet(name = "scoreServlet", urlPatterns = {"/scoreServlet","/handleScore"})
public class scoreServlet extends HttpServlet {

    private eventDAO eventdao;

public void init(){
    eventdao = new eventDAO();
}

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();
        
        switch(action){
            case "/insertScore" : 
                insertPost(request,response);
            break ;   
            case "/handleScore" :
                getAllEvent(request,response);
                break;
        }
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }
    
    public void insertPost(HttpServletRequest request,HttpServletResponse response) throws ServletException{
        
        //insert score
        
        double scoreD = Double.parseDouble(request.getParameter("scoreD")); 
        double scoreA = Double.parseDouble(request.getParameter("scoreA"));
        double scoreE = Double.parseDouble(request.getParameter("scoreE"));
        double deductPoint = Double.parseDouble(request.getParameter("deductionPoint"));
        
        Score score = new Score(scoreD,scoreA,scoreE,deductPoint);
        
        
        //insert event
        String eventName = request.getParameter("eventName");
        String eventYear = request.getParameter("eventYear");
        int userID = Integer.parseInt(request.getParameter("userID"));
        int gymnastID = Integer.parseInt(request.getParameter("gymnastID"));
        
        //int eventID, int scoreID, int userID,int gymnastID, String eventName, String eventYear
        Event event = new Event(0,score.getScoreID(),userID,gymnastID,eventName,eventYear);
            
    }
    
    public void getAllEvent(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        List <Event> event = eventdao.listAllDataEvent();
        request.setAttribute("allDataEvent", event);
        RequestDispatcher dispatcher = request.getRequestDispatcher("judge/handleScoreGymnast.jsp");
        dispatcher.forward(request, response);
        
    }


}
