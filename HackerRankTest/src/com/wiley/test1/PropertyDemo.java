package com.wiley.test1;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class PropertyDemo {

	public static void main(String[] args)  {
		
		try {
			Properties p=new Properties();
			
			FileInputStream fis=new FileInputStream("prop.properties");
			p.load(fis);
			System.out.println(p.getProperty("path"));
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise", 
					p.getProperty("userName"), p.getProperty("password"));
			System.out.println("Connected......");
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties sys=System.getProperties(); // as a hashtable of key-value pair
		System.out.println(sys.getProperty("java.class.path"));
		
		
		Properties command=System.getProperties();
		System.out.println(command.getProperty("p1"));

	}

}
/*
 * intended to provide configuration data encrypted/hidden data to the java code
 * 
 * any java project we can set properties as a text[.properties] based file in project classpath
 */
