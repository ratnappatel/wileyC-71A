package com.example.exercise;

import com.example.dao.CountryDao;
import com.example.dao.InMemoryWorldDao;
import com.example.domain.Country;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import static java.lang.String.format;
import static java.lang.System.out;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/*EXERCISE #7

Sort the countries by number of their cities in desending order:
	*/
public class Exercise7 {

    public static void main(String[] args) {
        // Sort the countries by number of cities
        CountryDao countryDao = InMemoryWorldDao.getInstance();
        Comparator<Country> sortByNumOfCities = comparing(country -> country.getCities().size());
        Predicate<Country> countriesHavingNoCities = country -> country.getCities().isEmpty();
        List<Country> countries = countryDao.findAllCountries()
                .stream()
                .filter(countriesHavingNoCities.negate())
                .sorted(sortByNumOfCities.reversed())
                .collect(toList());
        countries.forEach(country -> out.println(format("%38s %3d", country.getName(), country.getCities().size())));
    }

}
