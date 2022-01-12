package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country, title, Genre, releaseDate, director;
    public ArrayList<String> casts = new ArrayList<>();


    public Movie(String country, String title, String Genre, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.Genre = Genre;
        this.releaseDate = releaseDate;
        this.director = director;
    }

    public void addCast(String argument){
        casts.add(argument);
    }

    public void addCasts(String[] argument){
        casts.addAll(Arrays.asList(argument));
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", Genre='" + Genre + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", director='" + director + '\'' +
                ", casts=" + casts +
                '}';
    }
}
/*
3.1. Create a class named Movie
	    Attributes:
	        country (String), title (String), Genre (String), releaseDate (String), director (String), casts (ArrayList<String>)

		Add a constructor to set the country, title, release date, and director of the Movie

	    Actions
	        addCast(String): adds the given string argument to the arrayList casts
	        addCasts(String[]): adds the given string array argument to the arrayList casts
	        toString(): returns the name of country, title, release date, and total number of casts

 */