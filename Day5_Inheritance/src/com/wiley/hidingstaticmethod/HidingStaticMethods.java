
package com.wiley.hidingstaticmethod;

public class HidingStaticMethods {
    
    public static void main(String[] args) {
        
        // Create object instance of Cat.
        Cat myCat = new Cat();
        
        // The object instance is Cat type
        // and assigned to Animal type variable.
        Animal myAnimal2 = myCat;
        
        // For static method, the static method of
        // the super class gets called.
        Animal.testClassMethod();
        myCat.testClassMethod();
        
        // For instance method, the instance method
        // of the subclass is called even though
        // myAnimal2 is a super class type. This is
        // polymorphism.
        myAnimal2.testInstanceMethod();
        
    }
    
}
