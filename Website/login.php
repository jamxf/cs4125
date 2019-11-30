<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>PC Builder - Log In</title>
    <!-- Font Awesome -->
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.4.5/css/mdb.min.css" />
    <!-- Bootstrap core CSS -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <!-- Material Design Bootstrap -->
    <link href="../css/mdb.min.css" rel="stylesheet">
	<!-- Your custom styles (optional) -->
	<link href="css/style.css" rel="stylesheet">
</head>

	<body>
		<div id="frm">
			<h1>PC Builder</h1>	
			<h2>Please Sign In</h2>	
				<form action = "process.php" method="POST">
					
					<p>
						<input type="text" name="user" placeholder="Email Address" />
					</p>
					<p>
						<input type="password" name="pass" placeholder="Password" />
					</p>
					<p>
						<button type="submit" name="submit" class="btn btn-outline-pink btn-md">Log In</button>
					</p>
				</form>
		</div>

		  <!-- SCRIPTS -->
		  <script>new WOW().init();</script>
		  <!-- JQuery -->
		  <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
		  <!-- Bootstrap tooltips -->
		  <script type="text/javascript" src="js/popper.min.js"></script>
		  <!-- Bootstrap core JavaScript -->
		  <script type="text/javascript" src="js/bootstrap.min.js"></script>
		  <!-- MDB core JavaScript -->
		  <script type="text/javascript" src="js/mdb.min.js"></script>
	</body>
</html>
