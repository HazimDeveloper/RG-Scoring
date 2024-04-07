/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.servlet;

import com.bean.User;
import com.dao.userDAO;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author USER
 */
@WebServlet(name = "userServlet", urlPatterns = {"/userServlet","/login"})
public class userServlet extends HttpServlet {
private userDAO userdao;
    
    public void init(){
        userdao = new userDAO();
    }

 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        String action = request.getServletPath();
        
        switch(action){
            case "/login" :
                loginUser(request,response);
                break;
        }
    }

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      doGet(request,response);
   
    }
    
    public void loginUser(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        User user = new User(username,password);
        
       
       User newUser = userdao.getUserDetailByUsername(user);
       
        HttpSession session = request.getSession();
        
        System.out.println(newUser.getUserType());
         if(username == "" && password == ""){
        request.setAttribute("Err", "repeat");
        request.getRequestDispatcher("login.jsp").include(request, response);
    }else{
        if(newUser.getUserType().equals("admin")){
            session.setAttribute("userID", user.getUserID());
           request.getRequestDispatcher("admin/index.jsp").include(request, response);
        }else{
              session.setAttribute("userID", newUser.getUserID());
                request.getRequestDispatcher("judge/handleScoreGymnast.jsp").include(request, response);
        } 
        }
        
    }

}
