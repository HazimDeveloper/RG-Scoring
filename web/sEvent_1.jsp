<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>Specific Event</title>
  <!-- plugins:css -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

  <link rel="stylesheet" href="https://demo.bootstrapdash.com/skydash-free/template/vendors/ti-icons/css/themify-icons.css">
  <link rel="stylesheet" href="https://demo.bootstrapdash.com/skydash-free/template/vendors/css/vendor.bundle.base.css">
  <link rel="stylesheet" href="https://cdn.datatables.net/2.0.3/css/dataTables.bootstrap5.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.3.0/css/bootstrap.min.css">
  <!-- endinject -->
  <!-- Plugin css for this page -->
  <link rel="stylesheet" href="https://cdn.datatables.net/2.0.3/css/dataTables.dataTables.min.css">
  <link rel="stylesheet" href="https://demo.bootstrapdash.com/skydash-free/template/vendors/datatables.net-bs4/dataTables.bootstrap4.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/MaterialDesign-Webfont/7.4.47/css/materialdesignicons.min.css" integrity="sha512-/k658G6UsCvbkGRB3vPXpsPHgWeduJwiWGPCGS14IQw3xpr63AEMdA8nMYG2gmYkXitQxDTn6iiK/2fD4T87qA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  <!-- End plugin css for this page -->
  <!-- inject:css -->
  <link rel="stylesheet" href="https://demo.bootstrapdash.com/skydash-free/template/css/vertical-layout-light/style.css">
</head>
<body>
  <div class="container-scroller">
    <!-- partial:partials/_navbar.html -->
    <nav class="navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
      <div class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
        <a class="navbar-brand brand-logo mr-5" href="index.html">Gymnast</a>
        <a class="navbar-brand brand-logo-mini" href="index.html"><img src="images/logo-mini.svg" alt="logo"/></a>
      </div>
      <div class="navbar-menu-wrapper d-flex align-items-center justify-content-end">
        <button class="navbar-toggler navbar-toggler align-self-center" type="button" data-toggle="minimize">
          <span class="icon-menu"></span>
        </button>
   
        <ul class="navbar-nav navbar-nav-right">
    

          <!-- Logout -->
          <li class="nav-item nav-profile dropdown">
            <a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown" id="profileDropdown">
              Hello Gymnastic Lover
            </a>
            <div class="dropdown-menu dropdown-menu-right navbar-dropdown" aria-labelledby="profileDropdown">
              <a class="dropdown-item">
                <i class="ti-settings text-primary"></i>
                Settings
              </a>
              <a class="dropdown-item">
                <i class="ti-power-off text-primary"></i>
                Logout
              </a>
            </div>
          </li>

        </ul>
        <button class="navbar-toggler navbar-toggler-right d-lg-none align-self-center" type="button" data-toggle="offcanvas">
          <span class="icon-menu"></span>
        </button>
      </div>
    </nav>
    



    <!-- start sidebar -->
    <div class="main-panel mt-5 container-fluid mb-0 w-100">
 

      <!-- partial -->
        <div class="content-wrapper ">
          <div class="row">
            <div class="col-md-12 grid-margin ">
              <div class="row">
                <div class="col-12 col-xl-8 mb-4 mb-xl-0">
                  <h3 class="font-weight-bold">Welcome To  Gymnastic Perfomance</h3>
                </div>
              </div>
            </div>
          </div>
          
          <div class="row ">
            <div class="col-md-12 grid-margin stretch-card">
              <div class="card">
                <div class="card-body ">
                
                        
                  <div class="row">
                    <div class="col-12">
                      <div class="table-responsive">
                           <c:forEach items="${perfomanceGymnast.get(0).getGymnast()}" var="pfr" >
                         <table id="" class="table" >
                          <thead>
                            <tr>
                              <th></th>
                              <th></th>
                              <th></th>

                              <th></th>
                              <th  class="text-center border 1px" colspan="4"><img width="40px" height="40px" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSGqySi-J7uDBTwm_dGFWfoArtyDnt2VK_1zQ&s"></th>
                            
                              <th></th>
                            </tr>
                            <tr>
                              <th>Place</th>
                              <th>Name</th>
                              <th>State</th>
                              <th>Year</th>
                            </tr>
                          </thead>
                          <tbody>
                            <tr>
                              <td>1</td>
                              <td><a href="perfomanceGymnast?gymnastID=2" ><c:out value="${pfr.gymnastName}"/></a></td>
                              <td><c:out value="${pfr.gymnastState}"/></td>  
                         
                               <c:forEach items="${perfomanceGymnast.get(0).getEvent()}" var="event" >
                              <td><c:out value="${event.eventYear}"/></td>
                              </c:forEach>
                              
                           
                            </tr>
                            
                    
                          </tbody>
                      </table>
                       </c:forEach>
                          
                                      <c:forEach items="${perfomanceGymnast.get(0).getScore()}" var="score" >
                                          <table class="table-striped table">
                              <thead>
                                  <tr>
                                     <th></th>
                              <th></th>
                              <th></th>

                              <th></th>
                              <th  class="text-center border 1px" colspan="4"><img width="40px" height="40px" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSGqySi-J7uDBTwm_dGFWfoArtyDnt2VK_1zQ&s"></th>
                            
                              <th></th>
                            </tr>
                                    <tr>
                              <th class="border-left 1px">D</th>
                              <th >E</th>
                              <th >A</th>
                              <th class="border-right 1px">Ded.</th>
                              <th >D + A + E</th>
                              <th >Final Score.</th>
                              <th>Qualified P3</th>
                            </tr>
                              </thead>
                              
                              <tbody>
                              <td><c:out value="${score.scoreD}"/></td>
                              <td><c:out value="${score.scoreE}"/></td>
                              <td><c:out value="${score.scoreA}"/></td>
                              <td><c:out value="${score.techDeduct}"/></td>
                            
                              <td><c:out value="${score.scoreD + score.scoreE + score.scoreA - score.techDeduct }"/></td>
                              <td><c:out value="${score.scoreD + score.scoreE + score.scoreA - score.techDeduct }"/></td>
                              <td>Q1</td>
                                 
                              </tbody>
                               </table>
                              </c:forEach>  
                      </div>
                    </div>
                  </div>
                  </div>
                </div>

                
              </div>
            </div>
            
        </div>
        <!-- content-wrapper ends -->
        <!-- partial:partials/_footer.html -->
        <footer class="footer">
          <div class="d-sm-flex justify-content-center justify-content-sm-between">
            <span class="text-muted text-center text-sm-left d-block d-sm-inline-block">Copyright � 2024 .All rights reserved.</span>
            <span class="float-none float-sm-right d-block mt-1 mt-sm-0 text-center">Hand-crafted & made with <i class="ti-heart text-danger ml-1"></i></span>
          </div>
        </footer> 
        <!-- partial -->
    </div>   
    <!-- page-body-wrapper ends -->
  </div>
  <!-- container-scroller -->

  <!-- plugins:js -->
  <script src="https://demo.bootstrapdash.com/skydash-free/template/vendors/js/vendor.bundle.base.js"></script>
  <!-- endinject -->

  <!-- End plugin js for this page -->

  <script src="https://cdn.datatables.net/2.0.3/js/dataTables.min.js"></script>
  <script src="https://demo.bootstrapdash.com/skydash-free/template/js/template.js"></script>
  <script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<script>
  let table = new DataTable('#myTable');
</script>
  <!-- Custom js for this page-->
  <script src="https://demo.bootstrapdash.com/skydash-free/template/js/dashboard.js"></script>
  <!-- End custom js for this page-->
</body>

</html>

