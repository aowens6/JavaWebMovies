/**
 * 
 */
package edu.cvtc.web.view;

import java.util.List;

import edu.cvtc.web.model.Movie;

/**
 * @author Aowens6
 *
 */
public class MovieView {
	
	public static String buildHTML(List<Movie> movieList){
		final StringBuilder out = new StringBuilder();
		
		out.append("<!doctype html><html>");
		out.append("\n<head>");
		out.append("\n\t<title>Movie List");
		out.append("\n\t</title>");
		out.append("\n</head>");
		out.append("\n<body>");
		out.append("\n\t<h1>Movie List</h1>");
		out.append("\n\t<p><a href=\"Home\">Home</a>"
				+ " - <a href=\"Movies\">Unsorted</a>"
				+ " - <a href = \"SortByTitle\">Sort by Title</a>"
				+ " - <a href = \"SortByDirectorFirstName\">Sort by Director's First Name</a>"
				+ " - <a href=\"SortByDirectorLastName\">Sort by Director's Last Name</a>"
				+ " - <a href=\"SortByLength\">Sort by Length</a>");
		
		for (final Movie movie : movieList) {
			out.append("\n\t<div class=\"movie\">\n\t\t<h2>" + movie.getTitle() + "</h2>");
			out.append("\n\t\t<p>" + movie.getTitle() + " is directed by " + movie.getDirectorFirstName() + " " + movie.getDirectorLastName() + " and is " + movie.getMovieLength() + " minutes long.");
		}
			
		
		out.append("\n\t<p>&copy; Copyright 2016 AJ Owens</p>");
		
		out.append("\n</body>");
		out.append("\n</html");
		
		return out.toString();
		
	}
}
