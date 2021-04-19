package com.example.exercise;

import com.example.domain.Movie;
import com.example.service.InMemoryMovieService;
import com.example.service.MovieService;

import java.util.Collection;
import java.util.Map;

import static java.lang.String.format;
import static java.lang.System.out;
import static java.util.Comparator.comparing;
import static java.util.Map.*;
import static java.util.stream.Collectors.*;

/*EXERCISE #9

Group the movies by the year and list them:*/

public class Exercise9 {

    public static void main(String[] args) {
        // Group the movies by year
        MovieService movieService = InMemoryMovieService.getInstance();
        Collection<Movie> movies = movieService.findAllMovies();
        Map<Integer, String> moviesByYear = movies.stream().collect(groupingBy(Movie::getYear, mapping(Movie::getTitle, joining(","))));
        moviesByYear.entrySet().stream().sorted(comparing(Entry::getKey)).forEach(entry -> out.println(format("%4d: %s", entry.getKey(), entry.getValue())));
    }

}
