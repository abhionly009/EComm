<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="common_css_js.jsp"%>
</head>
<body style="background: url(background.jpg)">
	<div class="container-fluid">

		<div class="row mt-5">

			<div class="col-md-4 offset-md-4">
				<div class="card">
					<div class="card-header text-center">
						<h3>Login here</h3>
					</div>
					<div class="card-body">


						<form action="UserServlet" method="post">


							<div class="form-group">
								<label for="email">Email</label> <input type="email"
									name="email" id="email" class="form-control"
									placeholder="Enter your email">
							</div>

							<div class="form-group">
								<label for="password">Password</label> <input type="password"
									name="password" id="password" class="form-control"
									placeholder="Enter your Password">
							</div>

							<div class="container" align="center">
								<button class="btn btn-outline-primary">Login</button>
								<input type="reset" class="btn btn-outline-warning"
									value="Reset">

							</div>

						</form>


					</div>
					
					<div class="card-footer text-center"> 
						<h3>Sign Up </h3>
					</div>

				</div>

			</div>

		</div>

	</div>
</body>
</html>