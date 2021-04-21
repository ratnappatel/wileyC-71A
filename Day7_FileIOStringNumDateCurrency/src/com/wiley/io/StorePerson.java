package com.wiley.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StorePerson {

	public static void main(String[] args) {

		try {
			ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("personData.txt"));
			
			Person p=new Person(12, "abc", "Female");
			os.writeObject(p);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		try 
		{
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("personData.txt"));
			Person p1=(Person)ois.readObject();
			
			System.out.println(p1);
					
		} catch (Exception e) {
		}
		
	}

}
