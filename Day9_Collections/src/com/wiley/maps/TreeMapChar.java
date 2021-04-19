package com.wiley.maps;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String here");
		String str=sc.next();
		int value=0;
		TreeMap<Character,Integer> cfreq=new TreeMap<Character,Integer>();
		
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(cfreq.containsKey(arr[i]))
			{
				value=cfreq.get(arr[i]);
				cfreq.put(arr[i], ++value);
			}
			else
				cfreq.put(arr[i], 1);
		}
		
		System.out.println(cfreq);
	}

}
