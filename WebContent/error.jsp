<!doctype html>
<html>
<head>
	<title>Movies Application: Error</title>
	<meta name="description" content="This is an error response page for successful functions">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@ include file="includes/styles.jsp" %>
</head>
<body>
	<%@ include file="includes/curtains.jsp" %>
	<div class="container">
		<div class="hero-unit">
			<h1>Error</h1>
		</div>
		<%@ include file="includes/navigation.jsp" %>

		<div class="container">
			<p>${error}</p>
			
			<%@ include file="includes/footer.jsp" %>
		</div>
		
	</div>
	
<%@ include file="includes/scripts.jsp" %>
</body>
</html>