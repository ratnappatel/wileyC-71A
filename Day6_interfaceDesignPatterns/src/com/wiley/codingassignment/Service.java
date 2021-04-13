package com.wiley.codingassignment;

public interface Service {
	
	public Transaction fundsTransfer(int fromAccount,int toAccount, double amount);

	public static String service(int accountNo,int no_of_cheque,String name)
	{
		String srno=name.substring(1, 2);
		int no=(int) (Math.random()*10000);
		srno+=no;
		return srno;
	}
	public static String  service(double loanAmount,int tenure,String name)
	{
		String srno=name.substring(1, 2);
		int no=(int)(Math.random()*10000);
		srno+=no;
		return srno;
	}
}
