package com.wiley.exceptions;


class OneException extends Exception {
	    public OneException(String s) {
	        super(s);
	    }
	}

class TwoException extends Exception {
	    public TwoException(String s) {
	        super(s);
	    }
	}

public class RethrowException {
	    
	    public static void someMethod() throws OneException {
	        System.out.println("originating the exception in someMethod()");
	        throw new OneException("thrown from f()"); // custom -exception : checked either throws / try_catch
	    }
	    
	    public static void main(String[] args) throws TwoException {
	        try {
	            someMethod();
	        } catch (OneException e) {
	            System.err.println("Caught in main, e.printStackTrace()");
	            e.printStackTrace();
	            
	            // The TwoException will be handled by default exception
	            // handler.
	            throw new TwoException("from main()");
	           // System.out.println("");
	        }
	    }
	} 