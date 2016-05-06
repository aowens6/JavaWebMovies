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
public class DirectorLastNamePredicate implements Predicate<Movie> {
	
	private String directorLastName;

	public DirectorLastNamePredicate(final String directorLastName){
		this.directorLastName = directorLastName;
	}
	@Override
	public boolean apply(final Movie movie) {
		return movie.getDirectorLastName().equalsIgnoreCase(directorLastName);
	}

}
