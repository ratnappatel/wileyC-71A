package com.wiley.utilityClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
	    public static void main(String[ ] args) throws IOException 
	    {
	        InputStreamReader input = new InputStreamReader(System.in); 
	        //Taking the input data using the BufferedReader class
	        BufferedReader reader = new BufferedReader(input); 


	        String name = ""; 
	        System.out.println("Enter the names and when you want to stop entering the name, type Done");

	        while(!name.equals("Done"))
	        { 

	            System.out.println("Enter the name: "); 
	            // Reading data using readLine() method
	            name = reader.readLine(); 
	          
	            // Printing the read line
	            System.out.println("The entered name is: "+name); 
	           
	            if(name.contentEquals("Done"))
	                System.out.println("You entered Done!!");
	        } 
	        reader.close(); 
	        input.close(); 
	    }  
}
