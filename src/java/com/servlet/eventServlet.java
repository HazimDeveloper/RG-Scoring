/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.servlet;

import com.bean.Event;
import com.dao.eventDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
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
@WebServlet(name = "eventServlet", urlPatterns = {"/addEvent","/viewAddEvent","/updateEvent","/deleteEvent","/listEvent","/listEventByID"})
public class eventServlet extends HttpServlet {
    private eventDAO eventdao;
    public void init(){
  eventdao = new eventDAO();    
    }
    
 

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();
        
        switch(action){
            
            case "/addEvent" : 
                addEvent(request,response);
                break;
            case "/updateEvent": 
                updateEvent(request,response);
                break;
            case "/deleteEvent": 
                deleteEvent(request,response);
                break;
            case "/listEvent": 
                listAllEvent(request,response);
                break;
            case "/viewAddEvent": 
                routerAddEvent(request,response);
            break;
            case "/listEventByID":
                listAllEventByID(request,response);
                break;
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
    
     private void addEvent(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{
     
     
     }
     private void routerAddEvent(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{
     
         RequestDispatcher dispatcher = request.getRequestDispatcher("event/addEvent.jsp");
         dispatcher.forward(request,response);
     }
     
        private void updateEvent(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        }
        
           private void deleteEvent(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
            int id = Integer.parseInt(request.getParameter("eventID"));
            
            eventdao.deleteDataEvent(id);
               RequestDispatcher dispatcher = request.getRequestDispatcher("listEvent.jsp");
        dispatcher.forward(request,response);
           }

              private void listAllEvent(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
                    List<Event> eventDetail = eventdao.listAllDataEvent();
         
         request.setAttribute("eventDetail",eventDetail);
         RequestDispatcher dispatcher = request.getRequestDispatcher("event/eventDetail.jsp");
         dispatcher.forward(request,response);
              }
              
                 private void listAllEventByID(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
                      int id = Integer.parseInt(request.getParameter("eventID"));
                         List<Event> eventDetailByID = eventdao.listAllDataEventByID(id);
         
         request.setAttribute("eventDetail",eventDetailByID);
         
         RequestDispatcher dispatcher = request.getRequestDispatcher("event/listEventByID.jsp");
         dispatcher.forward(request,response);
                 }
}
