package com.wiley.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeManagement {

	ObjectInputStream ois;
	ObjectOutputStream os;
	public void read()
	{
		try
		{
			ois=new ObjectInputStream(new FileInputStream("employee.txt"));
			Employee e1=(Employee)ois.readObject();
			System.out.println(e1);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void write()
	{
		Employee e=new Employee(101,"Ratna",45000);
		
		try {
			
			os=new ObjectOutputStream(new FileOutputStream("employee.txt"));
			os.writeObject(e);
			System.out.println("Data Written successfully...");
		}
		catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public static void main(String[] args) {
		EmployeeManagement em=new EmployeeManagement();
		em.write();
		em.read();
	}

}
