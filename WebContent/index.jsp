<!doctype html>
<html>
<head>
	<title>Movies Application: Index</title>
	<meta name="description" content="This is a jsp example">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@ include file="includes/styles.jsp" %>
</head>
<body>
	<%@ include file="includes/curtains.jsp" %>
	<div id="dimScreen"></div>
	<div class="container">
		<div class="hero-unit">
			<h1>Movies Application</h1>
		</div>
		<%@ include file="includes/navigation.jsp" %>
		
		<div class="container">
			<p>If you need to populate the database first, <a href="populateDatabase.jsp">Populate</a></p>
			<hr>
			
			<%@ include file="includes/footer.jsp" %>
		</div>
		
	</div>
	
<%@ include file="includes/scripts.jsp" %>
<script src="http://code.jquery.com/jquery-2.2.3.min.js"></script>
<script src="assets/js/openCurtains.js"></script>
</body>
</html>