/**
 * 
 */
package edu.cvtc.web.search;

import java.util.List;

import edu.cvtc.web.exceptions.MovieSearchException;

import edu.cvtc.web.model.Movie;

/**
 * @author Aowens6
 *
 */
public interface MovieSearch {

	List<Movie> findMoviesByDirectorLastName(String directorLastName) throws MovieSearchException;
	
	List<Movie> findMoviesByDirectorFirstName(String directorFirstName) throws MovieSearchException;
	
	List<Movie> findMoviesByTitle(String title) throws MovieSearchException;
	
	List<Movie> retrieveMovies(String sortType) throws MovieSearchException;
}
