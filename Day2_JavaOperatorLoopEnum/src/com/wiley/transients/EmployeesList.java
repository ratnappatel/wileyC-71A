package com.wiley.transients;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeesList {

	public static void main(String[] args) {

		try 
		{
			Employee e=new Employee(101, "abc", 67000.890, "developer","neel");
			
			ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("emps.txt"));
			os.writeObject(e);
			
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("emps.txt"));
			
			Employee e1=(Employee) ois.readObject();
			System.out.println(e1);
			
		} catch (Exception e) {e.printStackTrace();	}
	}

}
