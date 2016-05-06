/**
 * 
 */
package edu.cvtc.web.dao.impl;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.cvtc.web.dao.MovieDao;
import edu.cvtc.web.model.Movie;
import edu.cvtc.web.util.DBUtility;
import edu.cvtc.web.util.WorkbookUtility;

/**
 * @author Aowens6
 *
 */
public class MovieDaoImpl implements MovieDao {

	private static final String DROP_TABLE_MOVIE = "drop table if exists movie";
	private static final String CREATE_TABLE_MOVIE = "create table movie (id integer primary key autoincrement, directorFirstName text, directorLastName text, length integer, title text)";
	private static final String SELECT_ALL_FROM_MOVIE = "select * from movie";
	

	
	@Override
	public void populate(String filePath) throws Exception {
		final Connection connection = DBUtility.createConnection();
		final Statement statement = connection.createStatement();
		
		try{
			statement.setQueryTimeout(DBUtility.TIMEOUT);
			
			statement.executeUpdate(DROP_TABLE_MOVIE);
			statement.executeUpdate(CREATE_TABLE_MOVIE);
			
			final File inputFile = new File(filePath);
			final List<Movie> movies = WorkbookUtility.retrieveMoviesFromWorkbook(inputFile);
			
			for (final Movie movie : movies){
				final String insertValues = "insert into movie (directorFirstName, directorLastName, length, title) values ('"
						+ movie.getDirectorFirstName() + "', '"
								+ movie.getDirectorLastName() + "', "
										+ movie.getMovieLength() + ", '"
												+ movie.getTitle() + "');";
				
			System.out.println(insertValues);
			
			statement.executeUpdate(insertValues);
			}
			
		}finally{
			DBUtility.closeConnections(connection, statement);
		}

	}

	
	@Override
	public List<Movie> retrieveMovies() throws Exception {
		
		final List<Movie> movieList = new ArrayList<>();
		
		final Connection connection = DBUtility.createConnection();
		
		final Statement statement = connection.createStatement();
		
		try{
			statement.setQueryTimeout(DBUtility.TIMEOUT);
			
			final ResultSet resultSet = statement.executeQuery(SELECT_ALL_FROM_MOVIE);
			
			while(resultSet.next()){
				
				final String directorFirstName = resultSet.getString("directorFirstName");
				final String directorLastName = resultSet.getString("directorLastName");
				final int length = resultSet.getInt("length");
				final String title = resultSet.getString("title");
				
				final Movie movie = new Movie(title, directorFirstName, directorLastName, length);
				movieList.add(movie);
			}
		}finally{
			DBUtility.closeConnections(connection, statement);
		}
		return movieList;
	}


	@Override
	public void insertMovie(Movie movie) throws Exception {
		
		Connection connection = null;
		
		PreparedStatement insertStatement = null;
		try{
			connection = DBUtility.createConnection();
			final String insertValues = "insert into movie(directorFirstName, directorLastName, length, title) values(?, ?, ?, ?)";
			insertStatement = connection.prepareStatement(insertValues);
			
			insertStatement.setString(1, movie.getDirectorFirstName());
			insertStatement.setString(2, movie.getDirectorLastName());
			insertStatement.setInt(3, movie.getMovieLength());
			insertStatement.setString(4, movie.getTitle());
			
			insertStatement.setQueryTimeout(DBUtility.TIMEOUT);
			insertStatement.executeUpdate();
			
		}finally{
			DBUtility.closeConnections(connection, insertStatement);
		}
	}


	
}
