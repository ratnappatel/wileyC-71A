package com.example.exercise;

import com.example.domain.Genre;
import com.example.domain.Movie;
import com.example.service.InMemoryMovieService;
import com.example.service.MovieService;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

import static java.lang.String.format;
import static java.lang.System.out;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/*EXERCISE #8

Find the list of movies having the genres "Drama" and "Comedy" only:
	*/
public class Exercise8 {

    public static void main(String[] args) {
        // Find the list of movies having the genres "Drama" and "Comedy" only
        MovieService movieService = InMemoryMovieService.getInstance();
        Collection<Movie> movies = movieService.findAllMovies();
        Predicate<Movie> drama = movie -> movie.getGenres().stream().anyMatch(genre -> genre.getName().equals("Drama"));
        Predicate<Movie> comedy = movie -> movie.getGenres().stream().anyMatch(genre -> genre.getName().equals("Comedy"));
        Predicate<Movie> havingTwoGenresOnly = movie -> movie.getGenres().size() == 2;
        List<Movie> dramaAndComedyMovies = movies.stream()
                .filter(havingTwoGenresOnly.and(drama.and(comedy)))
                .collect(toList());
        dramaAndComedyMovies.forEach(movie -> out.println(format("%-32s: %12s", movie.getTitle(), movie.getGenres().stream().map(Genre::getName).collect(joining(",")))));
    }

}
