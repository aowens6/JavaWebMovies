package edu.cvtc.web.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.cvtc.web.dao.MovieDao;
import edu.cvtc.web.dao.impl.MovieDaoImpl;
import edu.cvtc.web.util.WorkbookUtility;

/**
 * Servlet implementation class PopulateDatabaseServlet
 */
@WebServlet("/PopulateDatabase")
public class PopulateDatabaseContoller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String target = null;
		
		try{
			final MovieDao movieDao = new MovieDaoImpl();
			
			final String filePath = getServletContext().getRealPath(WorkbookUtility.INPUT_FILE);
			movieDao.populate(filePath);
			
			request.setAttribute("success", "Success, the databse has been populated");
			target = "success.jsp";
		}catch (Exception e){
			e.printStackTrace();
			request.setAttribute("error", "Sorry, there was a problem populating the databse");
			target = "error.jsp";
		}
		
		request.getRequestDispatcher(target).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
