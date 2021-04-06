package com.wiley.modierfs;

public abstract class HRManager {
	double bSal;
	double hra;
	double ta;
	double da;
	
	public  abstract double calc_salary();
	
	//leave policy
	public final void calc_leave()
	{
		System.out.println("I am constant in my nature , you should accept as I am. ");
	}
}

class HRDeveloper extends HRManager
{
	double incentive;

	@Override
	public double calc_salary() {
		System.out.println("CALCULATING SALARY ADDING INCENTIVE FOR DEVELOPERS");
		return 0;
	}

}
class HRSale extends HRManager
{
	final int minSale=15;
	int salesAchieved;
	double bonus;
	@Override
	public double calc_salary() {
		System.out.println("CALCULATING SALARY BY ADDING BONUS FOR SALES EMPLOYEE");
		return 0;
	}
}