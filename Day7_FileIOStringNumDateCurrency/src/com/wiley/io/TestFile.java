package com.wiley.io;

import java.io.File;

public class TestFile {

	public static void main(String[] args) {
		File file=new File("abc.doc");
		boolean check=file.exists();
		if(check)
			System.out.println("abc.doc is Available");
		else
			System.out.println("abc.doc file does not exists..");
	}

}
