package com.example.exercise;

import com.example.dao.InMemoryWorldDao;
import com.example.dao.WorldDao;
import com.example.domain.Country;

import java.util.Collection;
import java.util.Comparator;
import java.util.function.Predicate;

import static java.lang.System.out;
import static java.util.Comparator.comparingDouble;

/*EXERCISE #10

Sort the countries by their population densities
in descending order ignoring zero population countries:*/

public class Exercise10 {

    public static void main(String[] args) {
        // sort the countries by population densities in descending order
        WorldDao worldDao = InMemoryWorldDao.getInstance();
        Collection<Country> countries = worldDao.findAllCountries();
        Comparator<Country> populationDensityComparator = comparingDouble(country -> country.getPopulation() / country.getSurfaceArea());
        Predicate<Country> livesNobody = country -> country.getPopulation() == 0L;
        countries.stream().filter(livesNobody.negate()).sorted(populationDensityComparator.reversed())
                .forEach(out::println);
    }

}
