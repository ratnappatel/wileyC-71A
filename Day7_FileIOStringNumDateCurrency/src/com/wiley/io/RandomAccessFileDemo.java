package com.wiley.io;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) {
		try {
			byte arr[]=new byte[100];
			RandomAccessFile raf=new RandomAccessFile("MyText.txt","rw");
			raf.seek(15);
			
			int ch;
			while((ch=raf.read())!=-1)
				System.out.print((char)ch);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
