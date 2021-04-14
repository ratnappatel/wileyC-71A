package com.wiley.io;

import java.io.FileReader;

public class ReaderDemo {
	public static void readData() throws Exception
	{
		//("resource")
		FileReader fr=new FileReader("charData.txt");
		
		while(fr.read()!=-1) // i<arr.length =A EOF =-1
		{
			System.out.println("ASCII : "+fr.read()); //=B
			System.out.println("CHAR : "+(char)fr.read());
		}
	}

	public static void main(String[] args) throws Exception {
		ReaderDemo.readData();
		/*try
		{
			FileReader fr=new FileReader("charData.txt");
			int data=fr.read();// i=0 -1
			while(data!=-1) // i<arr.length
			{
				System.out.print("ASCII : "+data);
				System.out.print("CHAR Of ASCII : "+(char)data+"\n");
				data=fr.read(); //i++
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		

	}

}
