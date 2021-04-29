package com.wiley.test1;

public class TransactionException extends Exception {

	private String errorMessage, errorCode;
	public TransactionException(String errorMessage,String errorCode) {
		this.errorCode=errorCode;
		this.errorMessage=errorMessage;
	}
	public String getErroeCode()
	{
		return errorCode;
	}
	public String toString()
	{
		return errorCode+" : "+errorMessage;
	}
}

