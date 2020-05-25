<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="common_css_js.jsp"%>

</head>
<body style="background: gray">

	<div class="container">

		<!-- first row -->
		<div class="row mt-3">

			<!-- first col -->
			<div class="col md-4 ">
				<div class="card">

					<div class="card-body" align="center">
						<div class="container" align="center">
							<img alt="users" class="img-circle" style="max-width: 85px"
								src="team.png">
						</div>
						<h1 class="mt-2">535234</h1>
						<h1>Users</h1>
					</div>

				</div>
			</div>
			<!-- second col -->
			<div class="col md-4 ">
				<div class="card">

					<div class="card-body" align="center">

						<div class="container" align="center">
							<img alt="users" class="img-circle" style="max-width: 85px"
								src="list.png">
						</div>
						<h1 class="mt-2">23</h1>
						<h1>Category</h1>

					</div>

				</div>
			</div>

			<!-- third col -->
			<div class="col md-4 ">
				<div class="card">

					<div class="card-body" align="center">
						<div class="container" align="center">
							<img alt="users" class="img-circle" style="max-width: 85px"
								src="product.png">
						</div>
						<h1 class="mt-2">42334</h1>
						<h1>product</h1>

					</div>

				</div>
			</div>

		</div>

		<div class="row mt-3">

			<div class="col md-6">

				<div class="card" data-toggle="modal" data-target="#add-category">

					<div class="card-body" align="center">
						<div class="container" align="center">
							<img alt="users" class="img-circle" style="max-width: 85px"
								src="add.png">
						</div>
						<h1 class="mt-2">Add Category</h1>

					</div>

				</div>
			</div>


			<div class=" col md-6">

				<div class="card">

					<div class="card-body" align="center">
						<div class="container" align="center">
							<img alt="users" class="img-circle" style="max-width: 85px"
								src="add.png">
						</div>
						<h1 class="mt-2">Add Product</h1>

					</div>

				</div>
			</div>
		</div>

		<div class="row mt-3 mb-5">

			<div class="col md-6">

				<div class="card">

					<div class="card-herder" align="center">
						<h1 class="mt-3">Extract Report</h1>
					</div>

					<div class="card-body" align="center">
						<a href="#"><span>List of Users</span> </a><br> <a href="#">
							<span>List of Category</span>
						</a><br> <a href="#"><span>List of Product</span> </a><br>

					</div>
				</div>
			</div>


			<div class="col md-6 pb-20">

				<div class="card">

					<div class="card-herder" align="center">
						<h1 class="mt-3">Upload data in files</h1>
					</div>

					<div class="card-body" align="center">
						<a href="#"><span>Products</span> </a><br> <a href="#"> <span>Categories</span>
							<br> <br>
						</a><a href="#"><span></span></a>

					</div>
				</div>
			</div>

		</div>



	</div>




	<!-- Modal -->
	<div class="modal fade" id="add-category" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Add Category</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">

					<div class="form-group">
						<label for="name">Category</label> <input type="text" name="name"
							id="name" class="form-control" placeholder="Enter your category">
					</div>


					<div class="form-group">
						<label for="description">Description</label>
						<textarea name="description" id="description" class="form-control"
							placeholder="Enter your description"></textarea>
					</div>

					<div class="container">

						<button type="button" class="btn btn-primary">Add
							category</button>
					</div>

				</div>

			</div>
		</div>
	</div>
</body>
</html>