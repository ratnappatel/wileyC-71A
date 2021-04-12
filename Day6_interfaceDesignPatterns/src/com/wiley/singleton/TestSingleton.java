package com.wiley.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		//UniversityEntryGate u1=new UniversityEntryGate();
		
		UniversityEntryGate u1=UniversityEntryGate.getInstance();
		String loginType=u1.verifyId(23);
		if(loginType.equalsIgnoreCase("Examinor"))
		{
			Examinor ex=new  Examinor();
			ex.disp();
		}
		else
		{
			Student s=new Student();
			s.disp();
		}
	}
}
