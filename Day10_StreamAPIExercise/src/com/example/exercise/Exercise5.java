package com.example.exercise;

import com.example.dao.CityDao;
import com.example.dao.CountryDao;
import com.example.dao.InMemoryWorldDao;
import com.example.domain.City;
import com.example.domain.Country;

import java.util.Objects;
import java.util.Optional;

import static java.lang.System.out;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.maxBy;

/*EXERCISE #5

Find the highest populated capital city:*/

public class Exercise5 {

    public static void main(String[] args) {
        // Find the most populated capital
        CountryDao countryDao = InMemoryWorldDao.getInstance();
        CityDao cityDao = InMemoryWorldDao.getInstance();
        Optional<City> capital = countryDao.findAllCountries()
                .stream()
                .map(Country::getCapital)
                .map(cityDao::findCityById)
                .filter(Objects::nonNull)
                .collect(maxBy(comparing(City::getPopulation)));
        capital.ifPresent(out::println);
    }

}
