<!doctype html>
<html>
<head>
	<title>Movie Application: Search</title>
	<meta name="description" content="This is a jsp example of search">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@ include file="includes/styles.jsp" %>
</head>
<body>
	<%@ include file="includes/curtains.jsp" %>
	<div class="container">
		<div class="hero-unit">
			<h1>Search</h1>
		</div>
		<%@ include file="includes/navigation.jsp" %>
		
		<div class="container">
			<form action="Search">
				<label for="directorLastName"><strong>Search By Director's Last Name:</strong></label>
				<input name="directorLastName">
				<input type="hidden" name="searchType" value="directorLastName">
				<input type="submit" value="Search">
			</form>
			
			<form action="Search">
				<label for="directorFirstName"><strong>Search By Director's First Name:</strong></label>
				<input name="directorFirstName">
				<input type="hidden" name="searchType" value="directorFirstName">
				<input type="submit" value="Search">
			</form>
			
			<form action="Search">
				<label for="title"><strong>Search By Title:</strong></label>
				<input name="title">
				<input type="hidden" name="searchType" value="title">
				<input type="submit" value="Search">
			</form>
			
		</div>
		
		<hr>
		<%@ include file="includes/footer.jsp" %>
	</div>
	
<%@ include file="includes/scripts.jsp" %>
</body>
</html>