package com.wiley.io;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DestRead {

	public static void main(String[] args) throws Exception {
		File file=new File("source.txt");
		DataInputStream dos=new DataInputStream(new FileInputStream(file));
		Long len=0L;
		
		while(len<file.length()-1)
		{
			String s=dos.readUTF();
			System.out.print(" "+s);
			len++;
		}
	}

}
