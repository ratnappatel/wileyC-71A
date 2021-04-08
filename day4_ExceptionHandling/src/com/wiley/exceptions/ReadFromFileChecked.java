package com.wiley.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFromFileChecked {

	public static void main(String[] args)throws FileNotFoundException{
	
		try {
			FileReader file=new FileReader("test.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File is missing @ specified path");
		} 
		System.out.println("Main Exited....");
	}

}
