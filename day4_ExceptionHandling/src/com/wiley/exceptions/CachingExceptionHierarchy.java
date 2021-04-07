package com.wiley.exceptions;



class MyParentException extends Exception {
}

class MyChildException extends MyParentException {
}

public class CachingExceptionHierarchy {
    
    public static void main(String[] args) {
        try {
            throw new MyChildException();
        } catch (MyChildException s) {
            System.err.println("Caught MyChildException");
        } catch (MyParentException a) {
            System.err.println("Caught MyParentException");
        }
    }
} 

