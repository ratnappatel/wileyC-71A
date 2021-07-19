package com.sports.cricket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Purchase implements Comparable<Purchase>{
	
	private static long id;
	private static Date purchaseDate ;
	private static double totalAmount;
	private static String user;
	
	public Purchase() {
		// TODO Auto-generated constructor stub
	}

	public Purchase(long id, Date purchaseDate, double totalAmount, String user) {
		super();
		this.id = id;
		this.purchaseDate = purchaseDate;
		this.totalAmount = totalAmount;
		this.user = user;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((purchaseDate == null) ? 0 : purchaseDate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(totalAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Purchase other = (Purchase) obj;
		if (id != other.id)
			return false;
		if (purchaseDate == null) {
			if (other.purchaseDate != null)
				return false;
		} else if (!purchaseDate.equals(other.purchaseDate))
			return false;
		if (Double.doubleToLongBits(totalAmount) != Double.doubleToLongBits(other.totalAmount))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		//return "Purchase [id=" + id + ", purchaseDate=" + purchaseDate + ", totalAmount=" + totalAmount + ", user="+ user + "]\n";
		return "\n"+id+","+user+","+totalAmount;
	}

	@Override
	public int compareTo(Purchase purchase1) {
		
		return (int) (this.totalAmount-purchase1.totalAmount);
	}
	
	public static Purchase obtainPurchaseWithAmount(String str)throws InvalidWholeSaleException,ParseException
	{
		
		String input[]=str.split(",");
		long cost;
		int qty;
		
		id=Long.parseLong(input[0]);
		SimpleDateFormat sDate=new SimpleDateFormat("dd-mm-yyyy");
		purchaseDate=sDate.parse(input[1]);
		user=input[2];
		System.out.println("Total input is : "+input.length);
		totalAmount=0;
		if(input.length>=18)
		{
				int i=3;
				while(i<input.length)
				{
					cost=Long.parseLong(input[i+1]);
					qty=Integer.parseInt(input[i+2]);
					totalAmount+=cost*qty;
					i+=3;
				}
		}
		else
			throw new InvalidWholeSaleException(id);
			
		Purchase p=new Purchase(id, purchaseDate, totalAmount, user);	
				
		return p;
	}
}
