package com.sports.cricket;

public class InvalidWholeSaleException extends Exception {
	
	long purchaseId;
	public InvalidWholeSaleException(long purchaseId) {
		this.purchaseId=purchaseId;
	}
	public String toString()
	{
		return "Purchase "+purchaseId+"  is not a wholesale";
	}
}
