<%-- 
    Document   : index
    Created on : 4 Apr 2024, 2:44:08 pm
    Author     : USER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>List Gymnast</title>
 
      <jsp:include page="assets/css.jsp" /> 
    </head>
    
    
    <body>
          <!--**********************************
            Nav header start
        ***********************************-->
        <div class="nav-header">
            <div class="brand-logo">
                <a href="index.html">
                    <b class="logo-abbr"><img src="https://demo.themefisher.com/quixlab-bootstrap/images/logo.png" alt=""> </b>
                    <span class="logo-compact"><img src="https://demo.themefisher.com/quixlab-bootstrap/images/logo-compact.png" alt=""></span>
                    <span class="brand-title">
                        <img src="https://demo.themefisher.com/quixlab-bootstrap/images/logo-text.png" alt="">
                    </span>
                </a>
            </div>
        </div>
          
        <!--**********************************
            Nav header end
        ***********************************-->
    
        <!--**********************************
            Header start
        ***********************************-->
      <jsp:include page="navbar/navbar.jsp" /> 

        <!--**********************************
            Header end ti-comment-alt
        ***********************************-->   
        
        
        <!--**********************************
            Sidebar start
        ***********************************-->
            <jsp:include page="sidebar/sidebar.jsp" /> 
        <!--**********************************
            Sidebar end
        ***********************************-->
        
        <!--**********************************
            Content body start
        ***********************************-->
        <div class="content-body">

            <div class="row page-titles mx-0">
                <div class="col p-md-0">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="javascript:void(0)">Dashboard</a></li>
                        <li class="breadcrumb-item active"><a href="javascript:void(0)">Home</a></li>
                    </ol>
                </div>
            </div>
            <!-- row -->

            <div class="container-fluid">
                <div class="row">
                    <div class="col-12">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Data Table</h4>
                                <div class="table-responsive">
                                    <table class="table table-striped table-bordered zero-configuration">
                                        <thead>
                                            <tr>
                                                <th>PP</th>
                                                <th>Name</th>
                                                <th>State</th>
                                                <th>Category</th>
                                                <th>Program</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach var="gym" items="${gymnastDetail}">
                                            <tr>
                                                <th><img src="assest/img/"<c:out value="${gym.profilePicture}" />></th>
                                                <th><c:out value="${gym.gymnastName}" /></th>
                                                <th><c:out value="${gym.gymnastState}" /></th>
                                                <th><c:out value="${gym.gymnastCategory}" /></th>
                                                <th><c:out value="${gym.gymnastProgram}" /></th>
                                            </tr>+
                                        </c:forEach>
                                        </tbody>
                                        <tfoot>
                                            <tr>
                                                <th>PP</th>
                                                <th>Name</th>
                                                <th>State</th>
                                                <th>Category</th>
                                                <th>Program</th>
                                            </tr>
                                        </tfoot>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- #/ container -->
        </div>
        <!--**********************************
            Content body end
        ***********************************-->
        
   <jsp:include page="assets/js.jsp" /> 
    </body>
</html>
