package com.wiley.io;

import java.io.File;

public class TestFile {

	public static void main(String[] args) {
		File file=new File("C:/Users/ratpatel/Desktop");
		boolean check=file.exists();
		if(check)
		{
			if(file.isDirectory())
			{
				String content[]=file.list();
				for(String s:content)
					System.out.println(s);
			}
			else
				System.out.println("It is a file");
		}
		else
			System.out.println("abc.doc file does not exists..");
	}

}
