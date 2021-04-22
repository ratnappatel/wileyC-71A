package com.wiley.frames.events;


public class Country implements Comparable<Country> {
    private String code;
    private String name;
 
    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }
 
    public String getCode() {
        return code;
    }
 
    public void setCode(String code) {
        this.code = code;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    @Override
    public String toString() {
        return this.name;
    }
 
    @Override
    public int compareTo(Country anotherCountry) {
        return this.name.compareTo(anotherCountry.getName());
    }      
}
