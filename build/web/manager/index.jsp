<!DOCTYPE html>
<html lang="en">

<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>Manager</title>
  <!-- plugins:css -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

  <link rel="stylesheet" href="http://127.0.0.1:5500/vendors/ti-icons/css/themify-icons.css">
  <link rel="stylesheet" href="http://127.0.0.1:5500/vendors/css/vendor.bundle.base.css">
  <link rel="stylesheet" href="https://cdn.datatables.net/2.0.3/css/dataTables.bootstrap5.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.3.0/css/bootstrap.min.css">
  <!-- endinject -->
  <!-- Plugin css for this page -->
  <link rel="stylesheet" href="https://cdn.datatables.net/2.0.3/css/dataTables.dataTables.min.css">
  <link rel="stylesheet" href="http://127.0.0.1:5500/vendors/datatables.net-bs4/dataTables.bootstrap4.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/MaterialDesign-Webfont/7.4.47/css/materialdesignicons.min.css" integrity="sha512-/k658G6UsCvbkGRB3vPXpsPHgWeduJwiWGPCGS14IQw3xpr63AEMdA8nMYG2gmYkXitQxDTn6iiK/2fD4T87qA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  <!-- End plugin css for this page -->
  <!-- inject:css -->
  <link rel="stylesheet" href="http://127.0.0.1:5500/css/vertical-layout-light/style.css">
</head>
<body>
  <div class="container-scroller">
    <!-- partial:partials/_navbar.html -->
    <nav class="navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
      <div class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
        <a class="navbar-brand brand-logo mr-5" href="index.html"><img src="../images/logo.png" class="mr-2" alt="logo"/></a>
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
              Hello Manager
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
    <div class="container-fluid page-body-wrapper w-100">
 
      <!-- partial -->
      <!-- partial:partials/_sidebar.html -->
      <nav class="sidebar sidebar-offcanvas" id="sidebar">
        <ul class="nav">
          <li class="nav-item">
            <a class="nav-link" href="index.html">
              <span class="mdi mdi-view-dashboard"></span>
              <span class="menu-title">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Dashboard</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#ui-basic"  aria-expanded="false" aria-controls="ui-basic">
              
<span class="mdi mdi-gymnastics"></span>
              <span class="menu-title">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Gymnast</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="ui-basic">
              <ul class="nav flex-column sub-menu">
                <li class="nav-item"> <a class="nav-link" href="pages/ui-features/buttons.html">Add Gymnast</a></li>
              </ul>
            </div>
          </li>
          <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#form-elements" aria-expanded="false" aria-controls="form-elements">
              <span class="mdi mdi-calendar-multiple"></span>
              <span class="menu-title">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Event</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="form-elements">
              <ul class="nav flex-column sub-menu">
                <li class="nav-item"><a class="nav-link" href="pages/forms/basic_elements.html">Add Event</a></li>
              </ul>
            </div>
          </li>
   
          <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#auth" aria-expanded="false" aria-controls="auth">
              <span class="mdi mdi-account-outline"></span>
              <span class="menu-title">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;User Pages</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="auth">
              <ul class="nav flex-column sub-menu">
                <li class="nav-item"> <a class="nav-link" href="pages/samples/login.html"> Login </a></li>
                <li class="nav-item"> <a class="nav-link" href="pages/samples/register.html"> Register </a></li>
              </ul>
            </div>
          </li>
   
        </ul>
      </nav>

      <!-- End Sidebar -->

      <!-- partial -->
      <div class="main-panel">
        <div class="content-wrapper">
          <div class="row">
            <div class="col-md-12 grid-margin">
              <div class="row">
                <div class="col-12 col-xl-8 mb-4 mb-xl-0">
                  <h3 class="font-weight-bold">Welcome Manager</h3>
                  <h6 class="font-weight-normal mb-0">All systems are running smoothly! </h6>
                </div>
              </div>
            </div>
          </div>
          
          <div class="row">
            <div class="col-md-12 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <p class="card-title">MSSM 2014</p>
                  <div class="row">
                    <div class="col-12">
                      <div class="table-responsive">
                        <table id="" class="table" >
                          <thead>
                            <tr>
                              <th></th>
                              <th></th>
                              <th></th>

                              <th  class="text-center border 1px" colspan="4"><img width="40px" height="40px" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSGqySi-J7uDBTwm_dGFWfoArtyDnt2VK_1zQ&s"></th>
                              <th class="text-center border 1px" colspan="4"><img width="40px" height="40px" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSGqySi-J7uDBTwm_dGFWfoArtyDnt2VK_1zQ&s"></th>

                              <th></th>
                            </tr>
                            <tr>
                              <th>Place</th>
                              <th>State</th>
                              <th>Year</th>
                              <th class="border-left 1px">D</th>
                              <th >E</th>
                              <th >A</th>
                              <th class="border-right 1px">Ded.</th>
                              <th class="border-left 1px">D</th>
                              <th >E</th>
                              <th >A</th>
                              <th class="border-right 1px"> Ded.</th>
                              
                              <th >D + A + E</th>
                              <th >Score.</th>
                              <th>Qualified P3</th>
                            </tr>
                          </thead>
                          <tbody>
                            <tr>
                              <td>1</td>
                              <td>Terengganu</td>
                              <td>2019</td>
                              <td>10</td>
                              <td>21</td>
                              <td>23.0</td>
                              <td>3</td>
                              <td>10</td>
                              <td>21</td>
                              <td>3</td>
                              <td>12.22</td>
                              <td>40.6</td>
                              <td>60</td>
                              <td>Q1</td>
                            </tr>
                          </tbody>
                      </table>
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
      <!-- main-panel ends -->
    </div>   
    <!-- page-body-wrapper ends -->
  </div>
  <!-- container-scroller -->

  <!-- plugins:js -->
  <script src="http://127.0.0.1:5500/vendors/js/vendor.bundle.base.js"></script>
  <!-- endinject -->

  <!-- End plugin js for this page -->

  <script src="http://127.0.0.1:5500/https://cdn.datatables.net/2.0.3/js/dataTables.min.js"></script>
  <script src="http://127.0.0.1:5500/js/template.js"></script>
  <script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<script>
  let table = new DataTable('#myTable');
</script>
  <!-- Custom js for this page-->
  <script src="http://127.0.0.1:5500/js/dashboard.js"></script>
  <!-- End custom js for this page-->
</body>

</html>

