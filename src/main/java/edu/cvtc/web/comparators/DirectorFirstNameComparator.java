/**
 * 
 */
package edu.cvtc.web.comparators;

import java.util.Comparator;

import edu.cvtc.web.model.Movie;

/**
 * @author Aowens6
 *
 */
public class DirectorFirstNameComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie m1, Movie m2) {

		return m1.getDirectorFirstName().toLowerCase().compareTo(m2.getDirectorFirstName().toLowerCase());
	}

}
