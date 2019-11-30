<?php 
session_start();
//prevention of sql injection
$hostname = "sql2.freemysqlhosting.net";
$username = "sql2310859";
$password = "jixvis-3muBho-qofjaf";
$db = "sql2310859";
$dbTable = "users";
	
//connect to database
$dbconnect=mysqli_connect($hostname,$username,$password,$db);
if ($dbconnect->connect_error) {
	die("Database connection failed: " . $dbconnect->connect_error);
}

// initializing variables
$username = "";
$userID="";
$location  = "";
$description  = "";
$phoneNumber  = "";

$errors = array(); 

// REGISTER USER
if (isset($_POST['reg_user'])) {
	// receive all input values from the form
	$username = mysqli_real_escape_string($dbconnect, $_POST['username']);
	$password_1 = mysqli_real_escape_string($dbconnect, $_POST['password_1']);
	$password_2 = mysqli_real_escape_string($dbconnect, $_POST['password_2']);
	$location = mysqli_real_escape_string($dbconnect, $_POST['location']);
	$description = mysqli_real_escape_string($dbconnect, $_POST['description']);
	$phoneNumber = mysqli_real_escape_string($dbconnect, $_POST['phoneNumber']);
	// vallidate to see if fields are empty
  
	if (empty($username)) { array_push($errors, "Username is required"); }
	if (empty($location)) { array_push($errors, "location is required"); }
	if (empty($phoneNumber)) { array_push($errors, "phoneNumber is required"); }
	if (empty($password_1)) { array_push($errors, "Password is required"); }
	if ($password_1 != $password_2) {
		array_push($errors, "The password does not match");
	}

	// make sure user doesnt already exist with same credentials
	
	$user_check_query = "SELECT * FROM user WHERE userName='$username' LIMIT 1";
	$result = mysqli_query($dbconnect, $user_check_query);
	$user = mysqli_fetch_assoc($result);
  
	if ($user) { // if user exists
		if ($user['userName'] == $username) {
			array_push($errors, "Username already exists");
		}
	}
	
	$user_check_query = "SELECT * FROM pubs WHERE pubName='$pubName' LIMIT 1";
	$result = mysqli_query($dbconnect, $user_check_query);
	$user = mysqli_fetch_assoc($result);
  
	if ($user) { // if user exists
		if ($user['pubName'] == $pubName) {
			array_push($errors, "Pub Name already exists");
		}
	}
	
	
	$user_check_query = "SELECT max(userID) FROM user WHERE userID>200000 AND userID<300000";
	$result = mysqli_query($dbconnect, $user_check_query);
	$idReference = mysqli_fetch_assoc($result);	
	//create a new ID
	if ($idReference) { // if user exists
		$userIDGen=$idReference['max(userID)']+1;
	}
	else{
		$userIDGen=200001;
	}
		echo($userIDGen);

		
	// Finally, register user if there are no errors in the form
	if (count($errors) == 0) {
		echo("sucess");

  	$query = "INSERT INTO user (userID, userName, userPassword, userType) 
  			  VALUES('$userIDGen', '$username', '$password_1', 'Pub')";
  	mysqli_query($dbconnect, $query);
  	
	$query = "INSERT INTO pubs (pubID, pubName, location, description, phoneNumber) 
  			  VALUES('$userIDGen', '$pubName', '$location', '$description', '$phoneNumber')";
  	mysqli_query($dbconnect, $query);
	
	header('location: login.php');
	//>
  }
}
?>
<!DOCTYPE html>
<html>
<head>
  <title>PC Builder - Sign Up</title>
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
  <div class="header">
	<h1>PC Builder</h1>
	<h2>Sign Up</h2>
  </div>
	
  <form method="post" action="register.php">
  	<?php include('errors.php'); ?>
  	<div class="input-group">
  	  <label>Email Address</label>
  	  <input type="text" name="username" value="<?php echo $username; ?>">
  	</div>
  	<div class="input-group">
  	  <label>Password</label>
  	  <input type="password" name="password_1">
  	</div>
  	<div class="input-group">
  	  <label>Confirm password</label>
  	  <input type="password" name="password_2">
  	</div>
  	<div class="input-group">
  	  <button type="submit" class="btn btn-outline-pink btn-md" name="reg_user">Sign Up</button>
  	</div>
  	<p>
  		Already have a PC Builder account? <a href="login.php">Log In</a>
  	</p>
  </form>
</body>
</html>