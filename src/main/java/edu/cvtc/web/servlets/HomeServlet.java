package edu.cvtc.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/Home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		final PrintWriter out = response.getWriter();
		
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
		
		out.append("\n\t<p>Find out more about popular movies, sorted in various ways in the links above.</p>");
		
		out.append("\n\t<p>&copy; Copyright 2016 AJ Owens</p>");
		
		out.append("\n</body>");
		out.append("\n</html");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
