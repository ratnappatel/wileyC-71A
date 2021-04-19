package com.example.exercise;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.dao.CountryDao;
import com.example.dao.InMemoryWorldDao;
import com.example.domain.City;

/*EXERCISE #1

Find the highest populated city of each country:*/

public class Exercise1 {

    public static void main(String[] args) {
        // Find the highest populated city of each country
        CountryDao countryDao = InMemoryWorldDao.getInstance();
        List<City> highPopulatedCitiesOfCountries = countryDao.findAllCountries()
                .stream()
                .map(country -> country.getCities().stream().max(Comparator.comparing(City::getPopulation)))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
        highPopulatedCitiesOfCountries.forEach(System.out::println);
    }

}
