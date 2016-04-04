/**
 * 
 */
package edu.cvtc.web.model;

/**
 * @author Aowens6
 *
 */
public class Movie {
	
	private String title;
	private String directorFirstName;
	private String directorLastName;
	private Integer movieLength;
	
	public Movie(final String title, final String directorFirstName, final String directorLastName, final Integer movieLength) {
		this.title = title;
		this.directorFirstName = directorFirstName;
		this.directorLastName = directorLastName;
		this.movieLength = movieLength;
	}

	public String getTitle() {
		return title;
	}

	public String getDirectorFirstName() {
		return directorFirstName;
	}

	public String getDirectorLastName() {
		return directorLastName;
	}

	public Integer getMovieLength() {
		return movieLength;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", directorFirstName=" + directorFirstName + ", directorLastName="
				+ directorLastName + ", movieLength=" + movieLength + "]";
	}
	
	

}
