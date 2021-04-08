package com.wiley.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.StreamCorruptedException;

 interface TestException
{
	public void get()throws IOException;
}
 
public class ExceptionInterface implements TestException  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void get() throws ObjectStreamException {
		// TODO Auto-generated method stub
		
	}

}
