package com.wiley.exceptions;

public class IgnoringRuntimeException {


	  static void someMethod2() {
	    throw new RuntimeException("From someMethod2()");
	  }

	  // Note that this method does not need to
	  // catch the RunTimeException.
	  static void someMethod() {
	    someMethod2();
	  }

	  public static void main(String[] args) {
	    someMethod();
	  }
}
