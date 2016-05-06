<!doctype html>
<html>
<head>
	<title>Movies Application: Populate Database</title>
	<meta name="description" content="This is a jsp that populates a database">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@ include file="includes/styles.jsp" %>
</head>
<body>
<div class="container">
	<div class="hero-unit">
		<h1>Populate Database</h1>
	</div>
	<%@ include file="includes/navigation.jsp" %>
	<%@ include file="includes/curtains.jsp" %>
	<div class="container">
		<form action="PopulateDatabase" method="post">
			<input type="submit" name="populate" value="Populate">
		</form>
		<%@ include file="includes/footer.jsp" %>
	</div>
</div>

<%@ include file="includes/scripts.jsp" %>
</body>
</html>