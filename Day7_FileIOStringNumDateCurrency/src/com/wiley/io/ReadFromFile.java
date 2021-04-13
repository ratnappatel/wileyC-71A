package com.wiley.io;

import java.io.File;
import java.io.FileInputStream;

public class ReadFromFile {

	public static void main(String[] args) {
		try
		{
			//
			File file=new File("d:/mydetails.txt");
			byte b[]=new byte[100];
			FileInputStream fis=new FileInputStream(file);
			fis.read(b);
			System.out.println(new String(b));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
