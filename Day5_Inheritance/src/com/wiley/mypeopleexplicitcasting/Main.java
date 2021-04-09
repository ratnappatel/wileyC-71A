package com.wiley.mypeopleexplicitcasting;

public class Main {
   
    public static void main(String[] args) {
       
        System.out.println("---- Observe overriding behavior ----");
        Person person1 = new Person();
        person1.myMethod("test1");
       
        Student student1 = new Student();
        student1.myMethod("test2");
       
        InternationalStudent internationalStudent1 =
                new InternationalStudent();
        internationalStudent1.myMethod("test3");
       
        // Polymorphic behavior
        System.out.println("---- Observe polymorphic behavior ----");

        // This is an implicit type casting between Student and Person class.
        Person person2 = new Student();   // Example 1
        person2 = student1;                        // Example 2
        person2.myMethod("test4");
       
        // This is an implicit type casting between InternationalStudent and Person class.
        Person person3 = new InternationalStudent();   // Example 3
        person3 =  internationalStudent1;                       // Example 4
        person3.myMethod("test5");
       
        // This is an implicit type casting between InternationalStudent and Student class.
        Student student2 = new InternationalStudent();  // Example 5
        student2 = internationalStudent1;                        // Example 6
        student2.myMethod("test6");
       
        // Calling hiding methods
        System.out.println("---- Observe how calling hiding methods work ----");
        person2.myStaticMethod("test7");
        person3.myStaticMethod("test8");
        student2.myStaticMethod("test9");
       
    }
}