package com.wiley.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferedInputStreamDemo {

	public static void main(String[] args) {

		try {
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream("MyText.txt"));
			System.out.println("No of remaining bytes: "+bis.available());
			
			boolean b=bis.markSupported();
			if(b)
				bis.mark(bis.available());
			
			bis.skip(4);
			System.out.println("File Contents :");
			int ch;
			while((ch=bis.read())!=-1) // -127 to +128
			{
				System.out.print((char)ch);
			}
			System.out.println("\n");
			bis.reset();
			while((ch=bis.read())!=-1)
			{
				System.out.print((char)ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
