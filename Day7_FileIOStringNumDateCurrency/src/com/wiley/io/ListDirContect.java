package com.wiley.io;

import java.io.File;

public class ListDirContect {

	public static void main(String[] args) {
		System.out.println("In Main");
		try
		{
		File dir=new File("C:/Users/Ratna/Desktop/sdocs");
		File f;
		String contents[]=dir.list();
		for(int i=0;i<contents.length;i++)
		{
			f=new File(contents[i]);
			if(f.isDirectory())
				System.out.println("\n"+contents[i]+"  is Directory..");
			else if(f.isFile())
				System.out.println("\n"+contents[i]+"  is File..");
			else
				System.out.println(contents[i]);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("MainExiting");
	}

}
