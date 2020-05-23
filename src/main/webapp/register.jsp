<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register User</title>
<%@include file='common_css_js.jsp'%>
</head>
<body  >
<div class="container-fluid">

	<div class="row mt-5" >

		<div class="col-md-6 offset-md-3">
		<%@include file="message.jsp" %>
		
			<div class="card">
			
			<div class="card-header text-center">
				<h3>Register here</h3>
			</div>
			
				<div class="card-body">


					<form action="RegisterServlet" method="post">
						<div class="form-group">
							<label for="name">Name</label> <input type="text" name ="user_name"
								class="form-control" id="name" placeholder="Enter Name">
						</div>

						<div class="form-group">
							<label for="mobile">Mobile</label> <input type="number" name ="user_mobile"
								class="form-control" id="mobile" placeholder="Enter Mobile">
						</div>

						<div class="form-group">
							<label for="email">Email address</label> <input type="email" name ="user_email"
								class="form-control" id="email" aria-describedby="emailHelp"
								placeholder="Enter email">
						</div>

						<div class="form-group">
							<label for="password">Password</label> <input type="password" name ="user_password"
								class="form-control" id="password" placeholder="Password">
						</div>


						<div class="form-group">
							<label for="address">Address</label>
							<textarea style="height: 150px" class="form-control" id="address" name ="user_address"
								placeholder="Address"></textarea>
						</div>

						<div class="container" align="center">
							<button class="btn btn-outline-primary">Register</button>
							<input type="reset" class="btn btn-outline-warning"
									value="Reset">
						</div>


					</form>
				</div>
			</div>
		</div>
	</div>
	</div>

</body>
</html>