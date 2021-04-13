package com.wiley.codingassignment;

import java.util.Date;

public class Account implements Service
{
 private double bal;  //The current balance
 private int accnum;  //The account number
 private String name;
 Transaction t;
 public Account(int a,double bal,Customer c)
 {    
	this.bal=bal;
	accnum=a;
	name=c.fname;
 }
 
 public void deposit(double sum)
 {
	if (sum>0)
	    bal+=sum;    
	else
	    System.err.println("Account.deposit(...): "
			       +"cannot deposit negative amount."); 
	t=new Transaction(accnum,0,sum,new Date(),"CR");
 }
 
 public void withdraw(double sum)
 {
	if (sum>0)
	    bal-=sum;    
	else
	    System.err.println("Account.withdraw(...): "
			       +"cannot withdraw negative amount.");   
	t=new Transaction(0,accnum,sum,new Date(),"DR");
 }
 
 public double getBalance()
 {
	return bal;
 }
 
 public double getAccountNumber()
 {
	return accnum;
 }
 
 public String toString()
 {
	return "Acc " + accnum + ": " + "balance = " + bal;    
 }
 
 public final void print()
 {
	
	System.out.println( toString() );    
 }

@Override
public Transaction fundsTransfer(int fromAccount, int toAccount, double amount) {
		t=new Transaction(fromAccount,toAccount,amount,new Date(),"Funds Transfer");
	return t;
}
 
}