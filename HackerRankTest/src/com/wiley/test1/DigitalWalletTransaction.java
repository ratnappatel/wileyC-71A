package com.wiley.test1;

public class DigitalWalletTransaction {
	
	public static void addMoney(DigitalWallet digitalWallet,int amount)throws TransactionException 
	{
		if(amount<0)
			throw new TransactionException("Amount should be greater than zero","INVALID_AMOUNT");
		else
		{
			digitalWallet.setWalletBalance(digitalWallet.getWalletBalance()+amount);
		}
			
		
	}
	public static void payMoney(DigitalWallet digitalWallet, int amount) throws TransactionException
	{
		if(amount<0)
			throw new TransactionException("Amount should be greater than zero","INVALID_AMOUNT");
		if(amount>digitalWallet.getWalletBalance())
			throw new TransactionException("Insufficient Balance", "INSUFFICIENT_BALANCE");
	}

}
