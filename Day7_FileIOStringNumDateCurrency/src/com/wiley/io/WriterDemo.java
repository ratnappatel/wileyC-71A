package com.wiley.io;

import java.io.FileWriter;

public class WriterDemo {

	public static void main(String[] args) {
		try
		{
			FileWriter fw=new FileWriter("charData.txt");
			String str="A B C , I AM AN OUTCOME OF CHAR-BASED WRITER CLASS";
			fw.write(str);
			System.out.println("str persisted to file..");
			fw.close();
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}

	}

}
