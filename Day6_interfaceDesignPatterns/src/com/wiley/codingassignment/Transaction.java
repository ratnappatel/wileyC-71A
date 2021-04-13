package com.wiley.codingassignment;

import java.util.Date;

public class Transaction {
	private int fromAccount, toAccount; 
	private double amount;
	private Date tDate;
	private String type;
	
	public Transaction(int fromAccount, int toAccount, double amount, Date tDate, String type) {
		super();
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.amount = amount;
		this.tDate = tDate;
		this.type = type;
	}
	public String getType() {
		return type;
	}
	
	public int getFromAccount() {
		return fromAccount;
	}
	
	public int getToAccount() {
		return toAccount;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public Date gettDate() {
		return tDate;
	}
}
