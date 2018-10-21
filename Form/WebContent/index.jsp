<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
		
	<div class="container-fluid">
		<div class = "row">
		<div class="col-md-12"><center><h1><b>Sample Form</b></h1></center></div>
		<div class = "col-md-3"></div>
		<div class = "col-md-6">
		<form action="FormServlet" method="post"> 
				  <div class="form-group">
				    <label for="emp_name">Employee Name:</label>
				    <input type="text" class="form-control" name = "emp_name" id="emp_name" aria-describedby="emailHelp" placeholder="Enter your Name...">
				    <!-- <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small> -->
				  </div>
				  <div class="form-group">
				    <label for="emp_no">Employee Number:</label>
				    <input type="text" class="form-control" name= "emp_no" id="emp_no" placeholder="Enter Employee No...">
				  </div>
				  <div class="form-group">
				    <label for="email">Email ID:</label>
				    <input type="email" class="form-control" name="email" id="email" placeholder="Enter Email ID...">
				  </div>
				  <div class="form-group">
				    <label for="emp_mob_no">Mobile Number:</label>
				    <input type="text" class="form-control" name="emp_mob_no" id="emp_mob_no" placeholder="Enter Mobile Number...">
				  </div>
				  
				  
				  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
		</div>
		<div class = "col-md-3"></div>
		</div>
	</div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>		
</body>
</html>