package com.wiley.io;

import java.io.File;

import java.io.FilenameFilter;

public class FileNameFilterDemo {

	public static void main(String[] args) {

		String dir="C:/Users/ratpatel/Desktop/Desktop Misc/Ratna Java Materials/"
				+ "Ratna Java Materials/1023_javainheritance/javainheritance/samples/MyOnlineShop/src/myonlineshop";
		String extn=".java";
		
		File file=new File(dir);
		String files[]=file.list(new FilterContent());
		
		for(String s:files)
			System.out.println(s);
	}

}
class FilterContent implements FilenameFilter
{

	@Override
	public boolean accept(File arg0, String arg1) {
		// TODO Auto-generated method stub
		return arg1.endsWith(".java");
	}
	
}