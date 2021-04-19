package com.example.exercise;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;

import com.example.domain.Director;
import com.example.domain.Genre;
import com.example.domain.Movie;
import com.example.service.InMemoryMovieService;
import com.example.service.MovieService;

import static java.util.stream.Collectors.*;

/*
EXERCISE #4

Find the number of genres of each director's movies:
*/public class Exercise4 {

    public static void main(String[] args) {
        // Find the number of genres of each director's movies
        MovieService movieService = InMemoryMovieService.getInstance();
        Collection<Director> directors = movieService.findAllDirectors();
        Stream<DirectorGenre> stream =
                directors.stream()
                        .flatMap(director -> director.getMovies()
                                .stream()
                                .map(Movie::getGenres)
                                .flatMap(Collection::stream)
                                .map(genre -> new DirectorGenre(director, genre))
                                .collect(toList()).stream()
                        );
        Map<Director, Map<Genre, Long>> directorGenreList =
                stream.collect(
                        groupingBy(
                                DirectorGenre::getKey,
                                groupingBy(DirectorGenre::getValue, counting())
                        )
                );
        directorGenreList.forEach(
                (k1,v1) -> {
                    System.out.println(k1.getName());
                    v1.forEach( (k2,v2) -> {
                                System.out.println(String.format("\t%-12s: %2d", k2.getName(), v2));
                            });
                    System.out.println();
                }
        );
    }

}

class DirectorGenre implements Map.Entry<Director, Genre> {
    private Director director;
    private Genre genre;

    public DirectorGenre(Director director, Genre genre) {
        this.director = director;
        this.genre = genre;
    }

    @Override
    public Director getKey() {
        return director;
    }

    @Override
    public Genre getValue() {
        return genre;
    }

    @Override
    public Genre setValue(Genre genre) {
        this.genre = genre;
        return genre;
    }

}
