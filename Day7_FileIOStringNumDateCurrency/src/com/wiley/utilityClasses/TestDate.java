package com.wiley.utilityClasses;

import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		Date date1=new Date();
		Date date2=new Date(99999999999L);
		Date date3=new Date(999999999999L);
		
		System.out.println("Our First Date is : "+date1);
		System.out.println("Our Second Date is : "+date2);
		System.out.println("Our Third Date is : "+date3);
		
		if(date1.after(date2))
			System.out.println("Our First Date is after our Second Date.");
		if(date2.before(date3))
			System.out.println("Our Second Date is before our third Date .");
	}

}
