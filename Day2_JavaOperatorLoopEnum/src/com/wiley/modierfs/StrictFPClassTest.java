package com.wiley.modierfs;

public class StrictFPClassTest {

	public strictfp double sum()
	{
		double n1=10e+10;
		double n2=6e+08;
		return n1+n2;
	}
	public static void main(String[] args) {
		StrictFPClassTest t1=new StrictFPClassTest();
		System.out.println(t1.sum());
	}
}
