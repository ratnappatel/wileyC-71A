package com.wiley.arrays;

import java.util.Arrays;

public class SmallestNonConstructibleChange {

	// O(nlogn) time | o(1) space 
	public int nonConstructibleChange(int [] coins)
	{
		Arrays.sort(coins); // due to which O(nlogn)
		
		int currentChangeCreated=0;
		for(int coin: coins)
		{
			if(coin>currentChangeCreated+1)
				return currentChangeCreated+1;
			currentChangeCreated+=coin;
		}
		
		return currentChangeCreated+1;
	}
	public static void main(String[] args) {
		SmallestNonConstructibleChange sc=new SmallestNonConstructibleChange();
		int arr[]= {5,7,1,1,2,3,22};
		int changeCreated=sc.nonConstructibleChange(arr);
		
		System.out.println(changeCreated);
	}

}
