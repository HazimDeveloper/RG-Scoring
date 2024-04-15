/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.servlet;

import com.bean.Perfomance;
import com.bean.User;
import com.dao.perfomanceDAO;
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
import java.util.List;

/**
 *
 * @author USER
 */
@WebServlet(name = "userServlet", urlPatterns = {"/login","/viewJudgePage","/addJudgePage","/routeLogin","/viewManager","/addManager","/dashboard","/logout"})
public class userServlet extends HttpServlet {
private userDAO userdao;
private perfomanceDAO perfomancedao = new perfomanceDAO();     
    public void init(){
        userdao = new userDAO();
    }

 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        String action = request.getServletPath();
        
        switch(action){
            case "/routeLogin" : 
                routeLogin(request,response);
                break;
            case "/login" :
                loginUser(request,response);
                break;
            case "/viewJudgePage":
                routerJudgePage(request,response);
                break;
                case "/addJudgePage":
                routerAddJudgePage(request,response);
                break;
                case "/viewManager": 
                     routerViewManagerPage(request,response);
                    break;
                case "/addManager":
                    routerAddManagerPage(request,response);
                    break;
                    
                     case "/dashboard":
                    routerDashboardPage(request,response);
                    break;
                    
                     case "/logout" : 
                         logout(request,response);
                         break;
        }
    }

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      doGet(request,response);
   
    }
    
    public void logout(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        HttpSession session = request.getSession();
        session.invalidate();
        request.getRequestDispatcher("login.jsp").include(request, response);    
    }
    
    public void routeLogin(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
    request.getRequestDispatcher("login.jsp").include(request, response);
    }
    
     public void routerDashboardPage(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
    request.getRequestDispatcher("admin/index.jsp").include(request, response);
    }
     
    public void routerAddManagerPage(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
    request.getRequestDispatcher("admin/addManager.jsp").include(request, response);
    }
    public void routerJudgePage(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        
            
         List< Perfomance > perfomanceGymnast = perfomancedao.ListJudgeWithEventHandled();
        request.getRequestDispatcher("judge/viewJudgeDetail.jsp").include(request, response);
       
    }
      public void routerViewManagerPage(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        
         List< Perfomance > perfomanceGymnast = perfomancedao.ListManagerWithEventHandled();
         
         request.setAttribute("perfomanceGymnast",perfomanceGymnast);    
        request.getRequestDispatcher("admin/viewManager.jsp").include(request, response);
        
    }
    
    
     public void routerAddJudgePage(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
      
            
        request.getRequestDispatcher("judge/addJudge.jsp").include(request, response);
        
    }
    public void loginUser(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        String username = request.getParameter("username");
        String password = request.getParameter("password");
          HttpSession session = request.getSession();
        User user = new User(username,password);
         if(user.getUsername().equals("admin") && user.getPassword().equals("admin123")){
           session.setAttribute("admin", "admin");
           request.getRequestDispatcher("admin/index.jsp").include(request, response);
           return;
    }
       
       User newUser = userdao.getUserDetailByUsername(user);
       
      
        
        if(newUser == null){
               request.setAttribute("Err", "notMatch");
        request.getRequestDispatcher("login.jsp").include(request, response);
        return;
        } 
         if(user.getUsername().equals("") && user.getPassword().equals("")){
        request.setAttribute("Err", "null");
        request.getRequestDispatcher("login.jsp").include(request, response);
    }else if(username.trim().length() == 0 && password.trim().length()==0){
         request.setAttribute("Err", "notValid");
        request.getRequestDispatcher("login.jsp").include(request, response);
    } else{
        
        if(newUser.getUserType().equals("manager")){
            session.setAttribute("userID", user.getUserID());
           request.getRequestDispatcher("manager/index.jsp").include(request, response);
        }else if(newUser.getUserType().equals("judge")){
              session.setAttribute("userID", newUser.getUserID());
                request.getRequestDispatcher("judge/handleScoreGymnast.jsp").include(request, response);
        }
        }
        
    }

}
