<!doctype html>
<html>
<head>
	<title>Movie Application: Search Results</title>
	<meta name="description" content="This is a jsp example of a search results page">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@ include file="includes/styles.jsp" %>
</head>
<body>
<%@ include file="includes/curtains.jsp" %>
	<div class="container">
		<div class="hero-unit">
			<h1>Search Results</h1>
		</div>
		<%@ include file="includes/navigation.jsp" %>
		
		
		<div class="container">
			<%@ include file="includes/movies.jsp" %>
		</div>
		<%@ include file="includes/footer.jsp" %>
	</div>
	
<%@ include file="includes/scripts.jsp" %>
</body>
</html>