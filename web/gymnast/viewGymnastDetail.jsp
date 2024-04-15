<!DOCTYPE html>
<html lang="en">

<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>Add Manager</title>
  <!-- plugins:css -->
  <link rel="stylesheet" href="http://127.0.0.1:5500/vendors/feather/feather.css">
  <link rel="stylesheet" href="http://127.0.0.1:5500/vendors/ti-icons/css/themify-icons.css">
  <link rel="stylesheet" href="http://127.0.0.1:5500/vendors/css/vendor.bundle.base.css">
  <!-- endinject -->
  <!-- Plugin css for this page -->
  <link rel="stylesheet" href="http://127.0.0.1:5500/vendors/datatables.net-bs4/dataTables.bootstrap4.css">
  <link rel="stylesheet" href="http://127.0.0.1:5500/vendors/ti-icons/css/themify-icons.css">
  <link rel="stylesheet" type="text/css" href="http://127.0.0.1:5500/js/select.dataTables.min.css">
  <!-- End plugin css for this page -->
  <!-- inject:css -->
  <link rel="stylesheet" href="http://127.0.0.1:5500/css/vertical-layout-light/style.css">
  <!-- endinject -->
  <link rel="shortcut icon" href="http://127.0.0.1:5500/images/favicon.png" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  <link rel="stylesheet" href="http://127.0.0.1:5500/vendors/mdi/css/materialdesignicons.min.css">
</head>
<body>
  <div class="container-scroller">
    <!-- partial:partials/_navbar.html -->
    <nav class="navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
      <div class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
        <a class="navbar-brand brand-logo mr-5" href="index.html"><img src="http://127.0.0.1:5500/logo.jpg" class="mr-2" alt="logo"/></a>
        <a class="navbar-brand brand-logo-mini" href="index.html"><img src="http://127.0.0.1:5500/logo.jpg" alt="logo"/></a>
      </div>
      <div class="navbar-menu-wrapper d-flex align-items-center justify-content-end">
        <button class="navbar-toggler navbar-toggler align-self-center" type="button" data-toggle="minimize">
          <span class="icon-menu"></span>
        </button>
        <ul class="navbar-nav mr-lg-2">
        </ul>
        <ul class="navbar-nav navbar-nav-right">
          <li class="nav-item nav-profile dropdown">
            <a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown" id="profileDropdown">
                <p>Welcome Manager</p>
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
    <!-- partial -->
    <div class="container-fluid page-body-wrapper">
      <div id="right-sidebar" class="settings-panel">
        <i class="settings-close ti-close"></i>
        <ul class="nav nav-tabs border-top" id="setting-panel" role="tablist">
          <li class="nav-item">
            <a class="nav-link active" id="todo-tab" data-toggle="tab" href="#todo-section" role="tab" aria-controls="todo-section" aria-expanded="true">TO DO LIST</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" id="chats-tab" data-toggle="tab" href="#chats-section" role="tab" aria-controls="chats-section">CHATS</a>
          </li>
        </ul>
        <div class="tab-content" id="setting-content">
          <div class="tab-pane fade show active scroll-wrapper" id="todo-section" role="tabpanel" aria-labelledby="todo-section">
            <div class="add-items d-flex px-3 mb-0">
              <form class="form w-100">
                <div class="form-group d-flex">
                  <input type="text" class="form-control todo-list-input" placeholder="Add To-do">
                  <button type="submit" class="add btn btn-primary todo-list-add-btn" id="add-task">Add</button>
                </div>
              </form>
            </div>
            <div class="list-wrapper px-3">
              <ul class="d-flex flex-column-reverse todo-list">
                <li>
                  <div class="form-check">
                    <label class="form-check-label">
                      <input class="checkbox" type="checkbox">
                      Team review meeting at 3.00 PM
                    </label>
                  </div>
                  <i class="remove ti-close"></i>
                </li>
                <li>
                  <div class="form-check">
                    <label class="form-check-label">
                      <input class="checkbox" type="checkbox">
                      Prepare for presentation
                    </label>
                  </div>
                  <i class="remove ti-close"></i>
                </li>
                <li>
                  <div class="form-check">
                    <label class="form-check-label">
                      <input class="checkbox" type="checkbox">
                      Resolve all the low priority tickets due today
                    </label>
                  </div>
                  <i class="remove ti-close"></i>
                </li>
                <li class="completed">
                  <div class="form-check">
                    <label class="form-check-label">
                      <input class="checkbox" type="checkbox" checked>
                      Schedule meeting for next week
                    </label>
                  </div>
                  <i class="remove ti-close"></i>
                </li>
                <li class="completed">
                  <div class="form-check">
                    <label class="form-check-label">
                      <input class="checkbox" type="checkbox" checked>
                      Project review
                    </label>
                  </div>
                  <i class="remove ti-close"></i>
                </li>
              </ul>
            </div>
            <h4 class="px-3 text-muted mt-5 font-weight-light mb-0">Events</h4>
            <div class="events pt-4 px-3">
              <div class="wrapper d-flex mb-2">
                <i class="ti-control-record text-primary mr-2"></i>
                <span>Feb 11 2018</span>
              </div>
              <p class="mb-0 font-weight-thin text-gray">Creating component page build a js</p>
              <p class="text-gray mb-0">The total number of sessions</p>
            </div>
            <div class="events pt-4 px-3">
              <div class="wrapper d-flex mb-2">
                <i class="ti-control-record text-primary mr-2"></i>
                <span>Feb 7 2018</span>
              </div>
              <p class="mb-0 font-weight-thin text-gray">Meeting with Alisa</p>
              <p class="text-gray mb-0 ">Call Sarah Graves</p>
            </div>
          </div>
          <!-- To do section tab ends -->
          <div class="tab-pane fade" id="chats-section" role="tabpanel" aria-labelledby="chats-section">
            <div class="d-flex align-items-center justify-content-between border-bottom">
              <p class="settings-heading border-top-0 mb-3 pl-3 pt-0 border-bottom-0 pb-0">Friends</p>
              <small class="settings-heading border-top-0 mb-3 pt-0 border-bottom-0 pb-0 pr-3 font-weight-normal">See All</small>
            </div>
            <ul class="chat-list">
              <li class="list active">
                <div class="profile"><img src="images/faces/face1.jpg" alt="image"><span class="online"></span></div>
                <div class="info">
                  <p>Thomas Douglas</p>
                  <p>Available</p>
                </div>
                <small class="text-muted my-auto">19 min</small>
              </li>
              <li class="list">
                <div class="profile"><img src="images/faces/face2.jpg" alt="image"><span class="offline"></span></div>
                <div class="info">
                  <div class="wrapper d-flex">
                    <p>Catherine</p>
                  </div>
                  <p>Away</p>
                </div>
                <div class="badge badge-success badge-pill my-auto mx-2">4</div>
                <small class="text-muted my-auto">23 min</small>
              </li>
              <li class="list">
                <div class="profile"><img src="images/faces/face3.jpg" alt="image"><span class="online"></span></div>
                <div class="info">
                  <p>Daniel Russell</p>
                  <p>Available</p>
                </div>
                <small class="text-muted my-auto">14 min</small>
              </li>
              <li class="list">
                <div class="profile"><img src="images/faces/face4.jpg" alt="image"><span class="offline"></span></div>
                <div class="info">
                  <p>James Richardson</p>
                  <p>Away</p>
                </div>
                <small class="text-muted my-auto">2 min</small>
              </li>
              <li class="list">
                <div class="profile"><img src="images/faces/face5.jpg" alt="image"><span class="online"></span></div>
                <div class="info">
                  <p>Madeline Kennedy</p>
                  <p>Available</p>
                </div>
                <small class="text-muted my-auto">5 min</small>
              </li>
              <li class="list">
                <div class="profile"><img src="images/faces/face6.jpg" alt="image"><span class="online"></span></div>
                <div class="info">
                  <p>Sarah Graves</p>
                  <p>Available</p>
                </div>
                <small class="text-muted my-auto">47 min</small>
              </li>
            </ul>
          </div>
          <!-- chat tab ends -->
        </div>
      </div>
      
    
      <nav class="sidebar sidebar-offcanvas" id="sidebar">
        <ul class="nav">
          <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#ui-basic" aria-expanded="false" aria-controls="ui-basic">
              <i class="fa fa-gavel"></i> &nbsp;
              <span class="menu-title">Judge</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="ui-basic">
              <ul class="nav flex-column sub-menu">
                <li class="nav-item"> <a class="nav-link" href="viewJudgePage">View</a></li>
                <li class="nav-item"> <a class="nav-link" href="addJudgePage">Add</a></li>
              </ul>
            </div>
          </li>
          <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#ui-basic2" aria-expanded="false" aria-controls="ui-basic">
              <i class="fa-solid fa-calendar"></i> &nbsp;
              <span class="menu-title">Event</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="ui-basic2">
              <ul class="nav flex-column sub-menu">
                <li class="nav-item"> <a class="nav-link" href="listEvent">View</a></li>
                <li class="nav-item"> <a class="nav-link" href="viewAddEvent">Add</a></li>
              </ul>
            </div>
          </li>
          <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#ui-basic3" aria-expanded="false" aria-controls="ui-basic">
              <i class="fa-solid fa-person-walking"></i></i> &nbsp;
              <span class="menu-title">Gymnast</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="ui-basic3">
              <ul class="nav flex-column sub-menu">
                <li class="nav-item"> <a class="nav-link" href="listGymnast">View</a></li>
                <li class="nav-item"> <a class="nav-link" href="viewAddGymnast">Add</a></li>
              </ul>
            </div>
          </li>
        </ul>
      </nav>

      <div class="main-panel">
        <div class="content-wrapper">
          <div class="row">
            <div class="col-md-12 grid-margin">
                <div class="row">

                    <div class="col-lg-12 grid-margin stretch-card">
                        <div class="card">
                          <div class="card-body">
                            <h4 class="card-title">Gymnast List</h4>
                            <div class="table-responsive">
                              <table class="table table-striped">
                                <thead>
                                  <tr>
                                    <th>
                                      Profile Picture
                                    </th>
                                    <th>
                                      Name
                                    </th>
                                    <th>
                                      State
                                    </th>
                                    <th colspan="2">
                                      Action
                                    </th>
                                  </tr>
                                </thead>
                                <tbody>
                                  <tr>
                                    <td>
                                        <img src="data:image/jpeg;base64,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" class="rounded ">
                                    </td>
                                    <td>
                                       Lin Zxuan Ying
                                    </td>
                                    <td>
                                      Kuala Lumpur
                                    </td>
                                    <td>
                                      <a class="btn-sm btn btn-warning"><i class="mdi mdi-pencil"></i></a>
                                    </td>
                                    <td>
                                      <a class="btn-sm btn btn-danger"><i class="mdi mdi-pot-mix"></i></a>
                                    </td>
                                  </tr>
                                  <tr>
                                    <td>
                                        <img src="data:image/jpeg;base64,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" class="rounded ">
                                    </td>
                                    <td>
                                      Yu Knin Mang
                                    </td>
                                    <td>
                                      Perak
                                    </td>
                                    <td>
                                      <a class="btn-sm btn btn-warning"><i class="mdi mdi-pencil"></i></a>
                                    </td>
                                    <td>
                                      <a class="btn-sm btn btn-danger"><i class="mdi mdi-pot-mix"></i></a>
                                    </td>
                                  </tr>
                              </table>
                            </div>
                          </div>
                        </div>
                      </div>
                </div>
            </div>
          </div>
        </div>

        <footer class="footer">
          <div class="d-sm-flex justify-content-center justify-content-sm-between">
            <span class="text-muted text-center text-sm-left d-block d-sm-inline-block">Copyright © 2024.  Gymnas</span>
          </div>
        </footer> 
        
      </div>
      <!-- main-panel ends -->
    </div>   
    <!-- page-body-wrapper ends -->
  </div>
  <!-- container-scroller -->

  <!-- plugins:js -->
  <script src="http://127.0.0.1:5500/vendors/js/vendor.bundle.base.js"></script>
  <!-- endinject -->
  <!-- Plugin js for this page -->
  <script src="http://127.0.0.1:5500/vendors/chart.js/Chart.min.js"></script>
  <script src="http://127.0.0.1:5500/vendors/datatables.net/jquery.dataTables.js"></script>
  <script src="http://127.0.0.1:5500/vendors/datatables.net-bs4/dataTables.bootstrap4.js"></script>
  <script src="http://127.0.0.1:5500/js/dataTables.select.min.js"></script>

  <!-- End plugin js for this page -->
  <!-- inject:js -->
  <script src="http://127.0.0.1:5500/js/off-canvas.js"></script>
  <script src="http://127.0.0.1:5500/js/hoverable-collapse.js"></script>
  <script src="http://127.0.0.1:5500/js/template.js"></script>
  <script src="http://127.0.0.1:5500/js/settings.js"></script>
  <script src="http://127.0.0.1:5500/js/todolist.js"></script>
  <!-- endinject -->
  <!-- Custom js for this page-->
  <script src="http://127.0.0.1:5500/js/dashboard.js"></script>
  <script src="http://127.0.0.1:5500/js/Chart.roundedBarCharts.js"></script>
  <!-- End custom js for this page-->
</body>

</html>

