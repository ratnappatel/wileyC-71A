
package com.wiley.mypeopleimplicitcasting;

public class Main {
    
    public static void main(String[] args) {
        
        // Create object instances
        Person person1 = new Person();
        Student student1 = new Student();
        
        // Explicit casting
        Person person2 = student1;
        Student student2 = (Student) person2;
        
    }
}