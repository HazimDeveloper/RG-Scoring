<%-- 
    Document   : login
    Created on : 4 Apr 2024, 1:50:29 pm
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html class="h-100" lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>Quixlab - Bootstrap Admin Dashboard Template by Themefisher.com</title>
 
    <jsp:include page="assets/css-login.jsp" />
    
</head>

<body class="h-100">
    
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

    



    <div class="login-form-bg h-100">
        <div class="container h-100">
            <div class="row justify-content-center h-100">
                <div class="col-xl-6">
                    <div class="form-input-content">
                        <div class="card login-form mb-0">
                            <div class="card-body pt-5">
                                <a class="text-center" href="index.html"> <h4>Login Panel</h4></a>
        
                                <form class="mt-5 mb-5 login-input" method="post" action="login">
                                    <div class="form-group">
                                        <input type="text" name="username" class="form-control" placeholder="Enter your Username " required>
                                    </div>
                                    <div class="form-group">
                                        <input type="password" name="password" class="form-control" placeholder="Enter Your Password " required>
                                    </div>
                                    <button class="btn login-form__btn submit w-100" name="submit">Sign In</button>
                                </form>
                                <p class="mt-5 login-form__footer">Dont have account? <a href="page-register.html" class="text-primary">Sign Up</a> now</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <input type="hidden" id="status" value="<%= request.getAttribute("Err") %>">
    

    <!--**********************************
        Scripts
    ***********************************-->

    
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    <script>
        var status = document.getElementById("status");
        
        if(status == "repeat"){
            
            Swal.fire({
  title: "Email or password do not match with our credential",
  text: "Please try again!",
  icon: "warning"
});
        }
        
        
    </script>
        <jsp:include page="assets/js-login.jsp" />
</body>
</html>






