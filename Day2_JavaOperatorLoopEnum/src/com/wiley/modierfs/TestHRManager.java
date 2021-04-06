package com.wiley.modierfs;

public class TestHRManager {

	public static void main(String[] args) {
		
		HRManager mgrs=new HRDeveloper();
		
			
		mgrs.calc_salary();
		mgrs.calc_leave();
		System.out.println("========================================================");
		mgrs=new HRSale();
		mgrs.calc_leave();
		mgrs.calc_salary();
	}

}
