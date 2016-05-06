<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		
		<c:choose>
			<c:when test="${empty movies}">
				<p>Sorry, there were no results</p>
			</c:when>
			<c:otherwise>
				<c:forEach var="movie" items="${movies}" >
					<div class="span10">
						<h2>${movie.title}</h2>
						<p>${movie.title} is directed by ${movie.directorFirstName} ${movie.directorLastName} and is ${movie.movieLength} minutes long.</p>
						
					</div>
				</c:forEach>
			</c:otherwise>
		</c:choose>