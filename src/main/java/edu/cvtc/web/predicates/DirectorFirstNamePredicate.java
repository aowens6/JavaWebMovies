/**
 * 
 */
package edu.cvtc.web.predicates;

import com.google.common.base.Predicate;

import edu.cvtc.web.model.Movie;

/**
 * @author Aowens6
 *
 */
public class DirectorFirstNamePredicate implements Predicate<Movie> {
	
	private String directorFirstName;
	
	public DirectorFirstNamePredicate(final String directorFirstName){
		this.directorFirstName = directorFirstName;
	}

	@Override
	public boolean apply(final Movie movie) {
		return movie.getDirectorFirstName().equalsIgnoreCase(directorFirstName) ;
	}

}
