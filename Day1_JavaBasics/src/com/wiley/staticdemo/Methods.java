package com.wiley.staticdemo;
import com.wiley.staticdemo.*;
public class Methods {
   
    /** Creates a new instance of Methods */
    public Methods() {
    }
    // Static variable
    static int a = 0;
   
    // Static method
    static void staticMethod(int i) {
        System.out.println("staticMethod("+ i +") entered");
    }
   
    // Anonymous static method.  The things inside the anonymous
    // static method get executed when the class is loaded.  That is the
    // reason why you see result of Figure-1.13 below.
    static {    //static block
        System.out.println("Anonymous static method enetered, a = " + a);
        a += 1;  // same thing as a = a + 1
        System.out.println("Anonymous static method exiting, a = " + a);
    }
   
    // Non-static method
    void myNonStaticMethods(int i){
        System.out.println("myNonStaticMethod("+ i +") entered");
    }
}