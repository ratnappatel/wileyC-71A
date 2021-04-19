package com.wiley.collectionAlgo;

@FunctionalInterface
interface myInterface
{
	int disp(int x); // by default public  abstract
	// default + static  can be n nos of but not recommanded
}
public class LambdaExpression1 {

	public static void main(String[] args) {
		
		myInterface mi= (x)-> {return x*x;};
		
		System.out.println(mi);
	}

}

/*
 * class DefineInterface implements myInterface {
 * 
 * @Override public void disp(int x) { System.out.println("Square is : "+x*x);
 * 
 * }
 * 
 * }
 */