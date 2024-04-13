/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.servlet;

import com.bean.Gymnast;
import com.dao.gymnastDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.List;
/**
 *
 * @author USER
 */
@WebServlet(name = "gymnastServlet", urlPatterns = {"/addGymnast","/updateGymnast","/deleteGymnast","/detailGymnast","/listGymnast"})
@MultipartConfig(
  fileSizeThreshold = 1024 * 1024 * 1, // 1 MB
  maxFileSize = 1024 * 1024 * 10,      // 10 MB
  maxRequestSize = 1024 * 1024 * 100   // 100 MB
)
public class gymnastServlet extends HttpServlet {
 private gymnastDAO gymnastDAO;
    
    public void init(){
        gymnastDAO = new gymnastDAO();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();
        
        switch(action){
            case "/addGymnast":
                addGymnast(request,response);
        break;
            case "/updateGymnast":
                updateGymnast(request,response);
                break;
            case "/deleteGymnast" :
                deleteGymnast(request,response);
                break;
            case "/detailGymnast": 
                allGymnastByID(request,response);
                break;
            case "/listGymnast":
                allGymnast(request,response);
                break;
                
        }
   
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             doGet(request, response);
    }
    
    private void addGymnast(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{
           
    
        try{
 
        Part file = request.getPart("image");
        
        String profilePicture = file.getSubmittedFileName();
          String filePath = "C:/Users/USER/Documents/NetBeansProjects/Rhythmic Gymnastics (RG)//web/images/" + profilePicture;
          
          FileOutputStream fos= new FileOutputStream(filePath);
          InputStream is = file.getInputStream();
          
          byte[]  data = new byte[is.available()];
          is.read();
          fos.write(data);
          fos.close();
        
        int id = Integer.parseInt(request.getParameter("gymnastID")); 
        String name = request.getParameter("gymnastName");
        String state = request.getParameter("gymnastState");
        String category = request.getParameter("category");
        String program = request.getParameter("program");
        
        Gymnast gym = new Gymnast(id,name,state,profilePicture,category,program);
        
        gymnastDAO.addGymnast(gym);
        
          RequestDispatcher dispatcher = request.getRequestDispatcher("listGymnast.jsp");
                    
          request.setAttribute("status" ,"success");
          dispatcher.forward(request,response);
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
    }
    
    private void updateGymnast(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        
           Part file = request.getPart("image");
        
        String profilePicture = file.getSubmittedFileName();
          String filePath = "C:/Users/USER/Documents/NetBeansProjects/Rhythmic Gymnastics (RG)//web/images/" + profilePicture;
          
          FileOutputStream fos= new FileOutputStream(filePath);
          InputStream is = file.getInputStream();
          
          byte[]  data = new byte[is.available()];
          is.read();
          fos.write(data);
          fos.close();
          
        int id = Integer.parseInt(request.getParameter("gymnastID"));
        String name = request.getParameter("gymnastName");
        String state = request.getParameter("gymnastState");
//        String profilePicture = request.getParameter("profilePicture");
        String category = request.getParameter("category");
        String program = request.getParameter("program");
        
        Gymnast gym = new Gymnast(id,name,state,profilePicture,category,program);
        
        gymnastDAO.updateGymnast(gym);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("listGymnast.jsp");
        dispatcher.forward(request, response);
        
        
    }
    
    private void deleteGymnast(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        
        
        try{
            
        int id = Integer.parseInt(request.getParameter("gymnastID"));
        
        ServletContext ctx = null;
       
           List<Gymnast> gymnastDetail = gymnastDAO.GymnastByID(id);
if (gymnastDetail.isEmpty() || gymnastDetail.size() <= id) {
  throw new Exception("Gymnast details not found for ID: " + id);
}
        String photoName = gymnastDetail.get(id).getProfilePicture();
        String filePath = ctx.getRealPath("photos") + File.separator + photoName;
        File file = new File(filePath);
        if (file.exists()) {
  if (!file.delete()) {
    // Handle deletion failure (log the error, display a message)
    System.err.println("Failed to delete profile picture: " + filePath);
  }
}
        
        gymnastDAO.deleteGymnast(id);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("listGymnast.jsp");
        dispatcher.forward(request,response);
        
        }catch(Exception e){
        e.printStackTrace();
        }
    }
    
    private void allGymnast(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
         List<Gymnast> gymnastDetail = gymnastDAO.allGymnast();
         
         request.setAttribute("gymnastDetail",gymnastDetail);
         RequestDispatcher dispatcher = request.getRequestDispatcher("listGymnast.jsp");
         dispatcher.forward(request,response);
    }
    
    private void allGymnastByID(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
             int id = Integer.parseInt(request.getParameter("gymnastID"));
        List<Gymnast> gymnastDetail = gymnastDAO.GymnastByID(id);
         
         request.setAttribute("gymnastDetail",gymnastDetail);
         
        
         RequestDispatcher dispatcher = request.getRequestDispatcher("listGymnastByID.jsp");
         dispatcher.forward(request,response);
    }

      
               
    }
