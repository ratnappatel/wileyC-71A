package com.wiley.io;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class InputConsole {
	
	public static void main(String[] args) throws Exception
	{
		File file=new File("source.txt");
		DataOutputStream dos=new DataOutputStream(new FileOutputStream(file));
		for(int i=0;i<args.length;i++)
			dos.writeUTF(args[i]);
		System.out.println("Data Written..");

	}

}
