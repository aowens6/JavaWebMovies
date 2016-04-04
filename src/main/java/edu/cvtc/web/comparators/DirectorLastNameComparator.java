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
public class DirectorLastNameComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie m1, Movie m2) {
		return m1.getDirectorLastName().compareTo(m2.getDirectorLastName());
	}

}
