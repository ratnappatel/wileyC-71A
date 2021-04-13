package com.wiley.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutputExample {

	public static void main(String[] args)  {
		try
		{
			byte b[]=new byte[100];
			System.out.println("Give me data to write to first.txt file");
			System.in.read(b);
			
			//Creates new Empty File (if file is not available)
			File file=new File("d:/mydetails.txt");
			
			//used to write any byte[] form of data to file
			FileOutputStream fos=new FileOutputStream(file);
			fos.write(b);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
