package com.wiley.test1;

public class DigitalWallet {

	private String walletId;
	private String username;
	private String userAccessCode;
	private int walletBalance;
	public DigitalWallet(String walletId, String username, String userAccessCode) {
		this.walletId = walletId;
		this.username = username;
		this.userAccessCode = userAccessCode;
	}
	public DigitalWallet(String walletId, String username) {
		super();
		this.walletId = walletId;
		this.username = username;
	}
	public String getWalletId() {
		return walletId;
	}
	public String getUsername() {
		return username;
	}
	public String getUserAccessToken()throws TransactionException {
		if(userAccessCode==null)
			throw new TransactionException("User not authorized", "USER_NOT_AUTHORIZED");
		return userAccessCode;
	}
	public int getWalletBalance() {
		return walletBalance;
	}
	public void setWalletBalance(int walletBalance) throws TransactionException
	{
		if(walletBalance<0)
			throw new TransactionException("Amount should be greater than zero","INVALID_AMOUNT");
		this.walletBalance=walletBalance;
	}
	@Override
	public String toString() {
		return walletId +"  "+ username +"  "+ walletBalance;
	}
	
	
	
}
