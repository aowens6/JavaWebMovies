<!DOCTYPE html>
<html>
<head>
	<title>Movies Application: Add Movies</title>
	<meta name="description" content="This page allows you to add more movies to the database">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<%@ include file="includes/styles.jsp" %>
	
</head>
<body>
<%@ include file="includes/curtains.jsp" %>
<div class = "container">
	<div class="hero-unit">
		<h1>Add Movie</h1>		
	</div>
	<%@ include file="includes/navigation.jsp" %> 
	
	<div class="container">
		<form action="AddMovie" method="post">
			<div class="form-group">
				
				<label for="title"><strong>Title:</strong></label>
				<input id="title" name="title">
				
				<label for="directorFirstName"><strong>Director's First Name:</strong></label>
				<input id="directorFirstName" name="directorFirstName">
				
				<label for="directorLastName"><strong>Director's Last Name:</strong></label>
				<input id="directorLastName" name="directorLastName">
				
				<label for="length"><strong>Length:</strong></label>
				<input id="length" name="length">
				
				<input class="btn btn-primary btn-lg>" name="submit" type="submit" value="Add Movie">
			</div>
		</form>	
		
	</div>
	
	<hr>
	<div class="hero-unit">&copy; 2016 AJ Owens
		
	</div>
</div>

</body>
</html>