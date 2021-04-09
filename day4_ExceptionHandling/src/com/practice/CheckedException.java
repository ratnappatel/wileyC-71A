package com.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

	public static void main(String[] args) //throws FileNotFoundException // throws =declaring invoke default exception handler.. 
	{
		try {
			FileReader r=new FileReader("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //checked exception called FileNotFoundException
		System.out.println("I become unavailable hmmmmmmmm");
	}

}
