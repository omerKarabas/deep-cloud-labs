package com.example.exercises;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.example.domain.Movie;
import com.example.service.InMemoryMovieService;
import com.example.service.MovieService;


public class Exercise1 {
	private static final MovieService movieService = InMemoryMovieService.getInstance();

	public static void main(String[] args) {
		// Find the number of movies of each director
        final Collection<Movie> movies = movieService.findAllMovies();
        
        var directorMovieCounts=
        movies
        .stream()
        .map(Movie:: getDirectors)
        .flatMap(List::stream)
        .collect(Collectors.groupingBy(
        				Function.identity(),
        				Collectors.counting()
        				)
        		);
        
        directorMovieCounts.forEach((director,count)->
        	System.out.println(
        			String.format("%24s: %-3d",director.getName(),count)
        		));
       // Find the two director in one movie
        
       movies.stream()
       .filter(movie -> movie.getDirectors().size()> 1)
       .forEach(System.out::println);
       
       // Drama and comedy
       
       var drama = movieService.findGenreByName("Drama");
       var comedy = movieService.findGenreByName("Comedy");
       
       Predicate<Movie> isDrama =
    		     movie -> movie.getGenres().contains(drama);
       
       Predicate<Movie> isComedy =
    	    		     movie -> movie.getGenres().contains(comedy);
       movies.stream()
       .filter(isDrama.and(isComedy))
       .forEach(System.out::println);
	}

}
