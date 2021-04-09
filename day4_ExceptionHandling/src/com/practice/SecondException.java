package com.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class SecondException {

	public void func1()throws FileNotFoundException
	{
		System.out.println("func1 started");
		FileReader fr=new FileReader("");
		System.out.println("func1 ended");
	}
	public void func2()throws FileNotFoundException
	{
		System.out.println("func2 started");
		func1();
		System.out.println("func2 ended");
	}
	
	public static void main(String[] args) {
	
		System.out.println("Main Started...");
		SecondException s=new SecondException();
		try {
			s.func2();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main Exited...");
	}

}
