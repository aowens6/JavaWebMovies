/**
 * 
 */
package edu.cvtc.web.search.impl;

import java.util.Collections;
import java.util.List;

import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

import edu.cvtc.web.comparators.DirectorFirstNameComparator;
import edu.cvtc.web.comparators.DirectorLastNameComparator;
import edu.cvtc.web.comparators.LengthComparator;
import edu.cvtc.web.comparators.SortBy;
import edu.cvtc.web.comparators.TitleComparator;
import edu.cvtc.web.dao.MovieDao;
import edu.cvtc.web.dao.impl.MovieDaoImpl;
import edu.cvtc.web.exceptions.MovieSearchException;
import edu.cvtc.web.model.Movie;
import edu.cvtc.web.predicates.DirectorFirstNamePredicate;
import edu.cvtc.web.predicates.DirectorLastNamePredicate;
import edu.cvtc.web.predicates.TitlePredicate;
import edu.cvtc.web.search.MovieSearch;

/**
 * @author Aowens6
 *
 */
public class MovieSearchImpl implements MovieSearch {
	
	private static final String EXCEPTION_MESSAGE = "List of movies could not be retrieved from database";

	@Override
	public List<Movie> findMoviesByDirectorLastName(final String directorLastName)
			throws MovieSearchException {
		
		try{
			final List<Movie> movies = retrieveMovies();
			
			return Lists.newArrayList(Collections2.filter(movies, new DirectorLastNamePredicate(directorLastName)));
			
		}catch(final Exception e){
			e.printStackTrace();
			throw new MovieSearchException(EXCEPTION_MESSAGE);
		}
		
	}
	

	@Override
	public List<Movie> findMoviesByDirectorFirstName(final String directorFirstName)
			throws MovieSearchException {
		
		try{
			
			final List<Movie> movies = retrieveMovies();
			
			return Lists.newArrayList(Collections2.filter(movies, new DirectorFirstNamePredicate(directorFirstName)));
			
		}catch(final Exception e){
			e.printStackTrace();
			throw new MovieSearchException(EXCEPTION_MESSAGE);
		}
	}

	@Override
	public List<Movie> findMoviesByTitle(final String title) throws MovieSearchException {
		
		try{
			
			final List<Movie> movies = retrieveMovies();		
			
			return Lists.newArrayList(Collections2.filter(movies, new TitlePredicate(title)));
			
		}catch(final Exception e){
			e.printStackTrace();
			throw new MovieSearchException(EXCEPTION_MESSAGE);
		}
	}


	private List<Movie> retrieveMovies() throws Exception {
		final MovieDao movieDao = new MovieDaoImpl();

		return movieDao.retrieveMovies();
	}


	@Override
	public List<Movie> retrieveMovies(final String sortType) throws MovieSearchException {

		try{
			final List<Movie> movies = retrieveMovies();
			
			if(null != sortType){
				sortMovies(movies, sortType);
			}
			
			return movies;
		}catch(final Exception e){
			e.printStackTrace();
			throw new MovieSearchException(EXCEPTION_MESSAGE);
		}
	}


	private void sortMovies(final List<Movie> movies, final String sortType) {
		
		switch(sortType){
		case SortBy.DIRECTOR_FIRST_NAME:
			Collections.sort(movies, new DirectorFirstNameComparator());
			break;
		case SortBy.DIRECTOR_LAST_NAME:
			Collections.sort(movies, new DirectorLastNameComparator());
			break;
		case SortBy.TITLE:
			Collections.sort(movies, new TitleComparator());
			break;
		case SortBy.LENGTH:
			Collections.sort(movies, new LengthComparator());
			break;
		default:
			break;
		
		}
		
	}

}
