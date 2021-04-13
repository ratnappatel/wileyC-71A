package com.wiley.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutStreamDemo {

	byte arr[];
	public void readData()
	{
		FileInputStream fis=null;
		try
		{
			fis=new FileInputStream("MyText.txt");
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
		FileOutputStream fos=new FileOutputStream("MyText.txt",true);
		String msg="I should be written to file ..";
		arr=msg.getBytes();
		fos.write(arr);
	}
	public static void main(String[] args) throws Exception {
		FileInOutStreamDemo f1=new FileInOutStreamDemo();
		f1.writeData();
		f1.readData();
	}

}
