<%-- 
    Document   : handleScoreGymnast
    Created on : 5 Apr 2024, 3:45:29 pm
    Author     : USER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Select Event</title>
          <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
       <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
   
          
    </head>
    <style>
        .navbar-light .navbar-nav .nav-link {
  color: #000;
}
    </style>
    <body>
    <!-- Navbar -->
<nav class="navbar navbar-expand-lg fixed-top bg-light navbar-light">
  <div class="container">
    <a class="navbar-brand" href="#">RG Scoring System</a>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav ms-auto align-items-center">
        <li class="nav-item ms-3">
          <a class="btn btn-black btn-rounded" href="#!">Log out</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
<!-- Navbar -->

        <div class="container ">
            <div class="row">
                <div class="col-12">
       
                    <div class="px-4 py-5 my-5 text-center">
                        <div class="row">
                            <div class="col">
                                <p>Select Event</p>
                                
                                <select class="form-select" id="eventSelect" aria-label="Default select example">
  
                                        <c:forEach var="dataEvent" items="${event}" >
                                        <option selected>Open this select menu</option>
                                        <option value="<c:out value="${dataEvent.eventName}"/>"><c:out value="${dataEvent.eventName}"/></option>                                
                                        </c:forEach>
        
</select>
                                
                                
                            </div>
                            
                            <div class="col">
                                <p>Select Gymnast</p>
                                <select class="form-select" id="gymnastSelect" aria-label="Default select example">
                                    <c:forEach var="dataEvent" items="${event}" >
                                    <option selected>Open this select menu</option>
                                    <option value="<c:out value="${dataEvent.gymnastName}"/>"><c:out value="${dataEvent.gymnastName}" /></option>
                                        
                                    </c:forEach>
</select>
                            </div>
                        </div>
                        
                        
                        <form action="" method="post">
                                
   <table class="table table-light table-striped mt-3">
      
       <tr>
           
           <th>Criteria</th>
           <th>Score</th>
           <th>Points</th>
       </tr>
       <tr>
             <th>Score Difficulty</th>
             <td>80</td>
               <td><input type="number" name="scoreD"></td>
       </tr>
       <tr>
             <th>Score Artistic impression</th>
             <td>80</td> 
             <td><input type="number" name="scoreA"></td>
       </tr>
       <tr>
              <th>Score Execution</th>
              <td>80</td>   
              <td><input type="number" name="scoreE"></td>
       </tr>
       <tr>
            <th>Deduction Point</th>
            <td>80</td> 
            <td><input type="number" name="deductionPoint"></td>
       </tr>
   </table>
                            
                            <button name="submit" class="btn btn-success">Save Score</button>
   
                        </form> 
                        <form action="" method="post">
            <input type="hidden" id="selectedEventId" name="selectedEventId">  </form>
  </div>
                </div>
            </div>
        </div>
        <!--<h1><%= session.getAttribute("userID") %></h1>-->
       
           <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<script>
     const eventSelect = document.getElementById('eventSelect');
const gymnastSelect = document.getElementById('gymnastSelect');
const selectedEventIdInput = document.getElementById('selectedEventId');

eventSelect.addEventListener('change', async (event) => {
  const selectedEventId = event.target.value;
  selectedEventIdInput.value = selectedEventId;

  // Find corresponding gymnast data based on selectedEventId
  const selectedEvent = eventWithGymnasts.find(eventWithGymnasts => eventWithGymnasts.event.id === selectedEventId);

  if (selectedEvent) {
    // Clear existing gymnast options
    gymnastSelect.innerHTML = '';

    // Populate gymnast dropdown with new options
    selectedEvent.gymnastData.forEach(gymnast => {
      const option = document.createElement('option');
      option.value = gymnast.id;
      option.textContent = gymnast.name;
      gymnastSelect.appendChild(option);
    });
  } else {
    // Handle case where no gymnasts found for selected event (optional)
    gymnastSelect.innerHTML = '<option>No gymnasts found</option>';
  }
});

</script>
    </body>
    
</html>
