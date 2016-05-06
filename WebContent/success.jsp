<!doctype html>
<html>
<head>
	<title>Movie Application: Success</title>
	<meta name="description" content="This is a jsp example that demonstrates a success response page for successful functions">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@ include file="includes/styles.jsp" %>
</head>
<body>
<%@ include file="includes/curtains.jsp" %>
	<div class="container">
		<div class="hero-unit">
			<h1>Success</h1>
		</div>
		<%@ include file="includes/navigation.jsp" %>

		<div class="container">
			<p>${success}</p>
			
			<%@ include file="includes/footer.jsp" %>
		</div>
		
	</div>
	
<%@ include file="includes/scripts.jsp" %>
</body>
</html>