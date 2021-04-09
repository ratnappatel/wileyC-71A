
package com.wiley.hidingstaticmethod;

public class Cat extends Animal{
    
    public static void testClassMethod() {
        System.out.println("The class method in Cat.");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat.");
    }
    
}
