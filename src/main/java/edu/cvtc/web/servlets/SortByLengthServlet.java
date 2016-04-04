package edu.cvtc.web.servlets;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import edu.cvtc.web.comparators.LengthComparator;
import edu.cvtc.web.model.Movie;
import edu.cvtc.web.util.WorkbookUtility;
import edu.cvtc.web.view.MovieView;

/**
 * Servlet implementation class SortByLengthServlet
 */
@WebServlet("/SortByLength")
public class SortByLengthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		final PrintWriter out = response.getWriter();
		
		try {
			
			final List<Movie> movies = new ArrayList<>();
			
			final String fileName = getServletContext().getRealPath(WorkbookUtility.INPUT_FILE);
			
			final File inputFile = new File(fileName);
						
			movies.addAll(WorkbookUtility.retrievePeopleFromWorkbook(inputFile));
			
			Collections.sort(movies, new LengthComparator());
			
			out.append(MovieView.buildHTML(movies));
			
			
		} catch (InvalidFormatException e) {
			
			e.printStackTrace();
			out.println("Oops there was a problem in retrieving the list of people from the worksheet");
		} catch (FileNotFoundException e){
			
			e.printStackTrace();
			out.println("file not found");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
