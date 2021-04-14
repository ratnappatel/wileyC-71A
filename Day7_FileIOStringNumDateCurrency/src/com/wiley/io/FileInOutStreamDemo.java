package com.wiley.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class FileInOutStreamDemo {

	byte arr[];
	File f;
	public FileInOutStreamDemo()
	{
		f=new File("MyText.txt");
	}
	public void readData()
	{
		
		FileInputStream fis=null;
		try
		{
			fis=new FileInputStream(f); // MYTEXT MUST BE PRESENT IN CURRENT PROJECT DIRECTORY/ DEFAULT DIRECTORY
			arr=new byte[100];
			fis.read(arr);
			System.out.println(new String(arr));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void writeData() throws Exception
	{
		FileOutputStream fos=new FileOutputStream(f,true);
		String msg=" Its better to learn by example ..";
		arr=msg.getBytes(); // is a method from String class converts String to byte array 
		fos.write(arr);
	}
	public static void main(String[] args) throws Exception {
		FileInOutStreamDemo f1=new FileInOutStreamDemo();
		f1.writeData();
		f1.readData();
	}

}
