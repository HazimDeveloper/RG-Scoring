<%-- 
    Document   : index
    Created on : 3 Apr 2024, 10:55:42 am
    Author     : USER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>List Gymnast</title>
 
</head>

<body>

    <!--*******************
        Preloader start
    ********************-->
    <div id="preloader">
        <div class="loader">
            <svg class="circular" viewBox="25 25 50 50">
                <circle class="path" cx="50" cy="50" r="20" fill="none" stroke-width="3" stroke-miterlimit="10" />
            </svg>
        </div>
    </div>
    <!--*******************
        Preloader end
    ********************-->

    
    <!--**********************************
        Main wrapper start
    ***********************************-->
    <div id="main-wrapper">

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
                                                <th><c:out value="${gym.category}" /></th>
                                                <th><c:out value="${gym.program}" /></th>
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
        
        
        <!--**********************************
            Footer start
        ***********************************-->
       <jsp:include page="footer/footer.jsp" /> 
        <!--**********************************
            Footer end
        ***********************************-->
    </div>
    <!--**********************************
        Main wrapper end
    ***********************************-->

    <!--**********************************
        Scripts
    ***********************************-->
</body>

</html>