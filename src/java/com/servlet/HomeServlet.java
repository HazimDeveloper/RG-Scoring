/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.servlet;

import com.bean.Event;
import com.bean.Gymnast;
import com.bean.Perfomance;
import com.dao.eventDAO;
import com.dao.gymnastDAO;
import com.dao.perfomanceDAO;
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
@WebServlet(name = "HomeServlet", urlPatterns = {"/","/sEvent"})
public class HomeServlet extends HttpServlet {

    private eventDAO eventdao;
    private gymnastDAO gymnastdao = new gymnastDAO();
    private perfomanceDAO perfomancedao= new perfomanceDAO();
    public void init(){
    eventdao = new eventDAO();
    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action  = request.getServletPath();
        
        switch(action){
            case "/" : 
                routeHomePage(request,response);
                break;
            case "/sEvent": 
                specificEvent(request,response);
                break;
                 case "/perfomanceGymnast": 
                perfomanceGymnast(request,response);
                break;
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

 private void routeHomePage(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
                    List<Event> eventDetail = eventdao.listAllDataEvent();
         
         request.setAttribute("eventDetail",eventDetail);
         System.out.println("liast" + eventDetail);
         
         RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
         dispatcher.forward(request,response);
         
         
              }
 
   private void specificEvent(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
                       int eventID = Integer.parseInt(request.getParameter("eventID"));
        List< Perfomance > perfomanceGymnast = perfomancedao.listAllDataEventByID(eventID);
         
         request.setAttribute("perfomanceGymnast",perfomanceGymnast);
//         for (Event event : perfomanceGymnast.get(0).getEvent()) {
//            System.out.println(event.getEventName());
//        }
         RequestDispatcher dispatcher = request.getRequestDispatcher("sEvent.jsp");
         dispatcher.forward(request,response);
         
        
                 }
   
      private void perfomanceGymnast(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
             int gymnastID = Integer.parseInt(request.getParameter("gymnastID"));
        List< Perfomance > perfomanceGymnast = perfomancedao.listAllDataGymnastByID(gymnastID);
         
         request.setAttribute("perfomanceGymnast",perfomanceGymnast);
         
         RequestDispatcher dispatcher = request.getRequestDispatcher("perfomanceGymnast.jsp");
         dispatcher.forward(request,response);
    }
}
