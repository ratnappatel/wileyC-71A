package com.example.exercise;

import com.example.dao.CityDao;
import com.example.dao.CountryDao;
import com.example.dao.InMemoryWorldDao;
import com.example.domain.City;

import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import static java.lang.System.out;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

/*
EXERCISE #6

Find the highest populated capital city of each continent:
*/
public class Exercise6 {

    public static void main(String[] args) {
        // Find the highest populated capital city of each continent
        CountryDao countryDao = InMemoryWorldDao.getInstance();
        CityDao cityDao = InMemoryWorldDao.getInstance();
        Map<String, Optional<ContinentPopulatedCity>> continentsCapitals = countryDao.findAllCountries()
                .stream()
                .filter(country -> country.getCapital() > 0)
                .map(country -> new ContinentPopulatedCity(country.getContinent(), cityDao.findCityById(country.getCapital())))
                .collect(groupingBy(ContinentPopulatedCity::getKey, maxBy(comparing(cpc -> cpc.getValue().getPopulation()))));
        BiConsumer<String, Optional<ContinentPopulatedCity>> print= (k, v) -> {
            Consumer<ContinentPopulatedCity> continentPopulatedCityConsumer = cpc -> out.println(cpc.getKey() + ": " + v.get().getValue());
            v.ifPresent(continentPopulatedCityConsumer);
        };
        continentsCapitals.forEach(print);
    }

}

class ContinentPopulatedCity implements Map.Entry<String, City> {
    private String continent;
    private City city;

    public ContinentPopulatedCity(String continent, City city) {
        this.continent = continent;
        this.city = city;
    }

    @Override
    public String getKey() {
        return continent;
    }

    @Override
    public City getValue() {
        return city;
    }

    @Override
    public City setValue(City city) {
        this.city = city;
        return city;
    }

}
