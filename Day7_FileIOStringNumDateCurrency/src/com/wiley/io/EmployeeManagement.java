package com.wiley.io;

import java.io.EOFException;
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
				Employee e1=(Employee)ois.readObject(); // while reading any object back from jvm it comes as java.lang.Object type  CASTING A_CLAAS OBJECT CASTED TO B_CLASS OBJECT
				System.out.println(e1);
		}
		catch(Exception e)
		{
			
				System.out.println("No More Employee Details are available to read....");
			
				e.printStackTrace();
		}
	}
	public void write()
	{
		Employee e=new Employee(101,"Ratna",45000);
		Employee e11=new Employee(102,"uttam",9000);
		
		try {
			
			os=new ObjectOutputStream(new FileOutputStream("employee.txt",true));
			os.writeObject(e);
			os.writeObject(e11);
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
