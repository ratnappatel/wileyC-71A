
package com.wiley.mypeopleimplicitcasting;

public class Person {
    
    public Person() {
        // System.out.println("Person: constructor is called");
    }
    
    public Person(String name) {
        this.name = name;
        // System.out.println("Person: constructor 2 is called");
    }
    
    protected String name;
    protected String address;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    // A method that will be overriden by sub-class
    public void myMethod(String t){
        System.out.println("myMethod(" + t + ") in Person class");
    }
    
    // A method that will be hidden by sub-class
    public static void myStaticMethod(String t){
        System.out.println("myStaticMethod(" + t + ") in Person class");
    }
    
}
