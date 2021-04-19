package com.wiley.collectionstream;

import java.util.function.Function;

public class FunctionChaining {
	public static void main(String args[]) {
	Function <String,Integer> f1= x->x.length();
	
	Function <Integer,Integer> f2= x-> x*2;
	
	Integer result=f1.andThen(f2).apply("Wiley");
	
	System.out.println(result);
}

}


// 1. function to get length of passed string
// 2. function to return square of given length of string

