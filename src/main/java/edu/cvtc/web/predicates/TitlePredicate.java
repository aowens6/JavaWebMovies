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
public class TitlePredicate implements Predicate<Movie> {
	
	private String title;
	
	public TitlePredicate(final String title){
		this.title = title;
	}

	@Override
	public boolean apply(Movie movie) {
		return movie.getTitle().equalsIgnoreCase(title);
	}

}
