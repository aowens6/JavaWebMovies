/**
 * 
 */
package edu.cvtc.web.dao;

import java.util.List;

import edu.cvtc.web.model.Movie;

/**
 * @author Aowens6
 *
 */
public interface MovieDao {
	
	void populate(String filePath) throws Exception;
	
	List<Movie> retrieveMovies() throws Exception;
	
	void insertMovie(Movie movie) throws Exception;

}
