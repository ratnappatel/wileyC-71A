package com.wiley.singleton;


//singleton class : only one object should exists managing application configuration+transaction+security 
public class UniversityEntryGate {
	
	private static int id[]= {23,45,67,89};
	private static int obj;
	private static UniversityEntryGate u;
	
	// because constructor is private no one can create an object directly 
	private UniversityEntryGate()
	{
		
	}
	
	
	public static UniversityEntryGate getInstance()

	{
		if(u==null)
		{
			u=new UniversityEntryGate();
			obj++;
		}
		return u;
	}
	public static String verifyId(int idNo)
	{
		if(idNo== id[0] || idNo==id[1])
			return "Examinor";
		else
			return "Student";
		/*
		 * System.out.println("Class Object Created for "+obj+" No of time");
		 * System.out.println(u);
		 */
	}
}
