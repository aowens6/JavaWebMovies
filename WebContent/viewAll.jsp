<!doctype html>
<html>
<head>
	<title>Movies Application: Movies List</title>
	<meta name="description" content="This is a jsp example that demonstrates how to output data from a database">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@ include file="includes/styles.jsp" %>
</head>
<body>
<%@ include file="includes/curtains.jsp" %>
<div class = "container">
	<div class="hero-unit">
		<h1>Movie List</h1>
	</div>
	
	<%@ include file="includes/navigation.jsp" %>
	
	<div class="container">
		<%@ include file="includes/movies.jsp" %>
	</div>
</div>

<%@ include file="includes/scripts.jsp" %>
</body>
</html>