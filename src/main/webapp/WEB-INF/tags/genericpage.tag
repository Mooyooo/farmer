<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<%@attribute name="body" fragment="true"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Farmer App">
<meta name="author" content="">

<title>Farmer App</title>

<!-- Bootstrap core CSS -->
<link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<style>
body {
	padding-top: 54px;
}

@media ( min-width : 992px) {
	body {
		padding-top: 56px;
	}
}
</style>

</head>

<body>

	<!-- Navigation -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
		<div class="container">
			<a class="navbar-brand" href="#">Farmer App</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarResponsive" aria-controls="navbarResponsive"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item active"><a class="nav-link" href="#">Home
					</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/approvedProducts">Products</a></li>
					<li class="nav-item"><a class="nav-link" href="/admin">All
							Products</a></li>
					<li class="nav-item"><a class="nav-link" href="/newProduct">Add
							Product</a></li>
					<li class="nav-item"><a class="nav-link" href="/approvedProducts">Shopping
							Cart</a></li>
					<li class="nav-item"><a class="nav-link" href="/logout">Login/Logout</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>

	<!-- Page Content -->
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
				<jsp:doBody />
			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript -->
	<script src="../jquery/jquery.min.js"></script>
	<script src="../bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>