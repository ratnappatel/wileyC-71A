package com.wiley.operators;

public class TernaryOp {

	public static void main(String[] args) {
		
		int a= 23 , b =45 , c=29, result;
		
		int x=(10>4)?10:4;

		result= ((a>b)?
						(a>c)? a:c
						:(b>c)?
								b:c);
		
		System.out.println("The Max of three numbers = "+result);
		System.out.println("x = "+x);
	}

}
