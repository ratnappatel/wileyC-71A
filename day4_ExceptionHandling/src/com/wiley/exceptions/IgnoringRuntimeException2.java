package com.wiley.exceptions;

class MyException extends RuntimeException {
    
    public MyException(String x){
        super(x);
    }
}

public class IgnoringRuntimeException2 {

  static void someMethod2() {
    throw new MyException("From someMethod2()");
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