package com.wiley.test1;

import java.util.*;
public class Compare
{
public static void main( String args[])
{
	String[] cities =
	{"Bangalore","Pune","San Francisco","New York City"};
	MySort ms = new MySort();
	Arrays.sort(cities, ms);
	System.out.println(Arrays.binarySearch(cities,
	"New York City"));
	}
	static class MySort implements Comparator
	{
		public int compare( String a, String b)
		{
		return b.compareTo(a);
		}

		@Override
		public int compare(Object arg0, Object arg1) {
			// TODO Auto-generated method stub
			return 0;
		}
	}
}