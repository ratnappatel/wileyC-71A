package com.wiley.arrays;

/*
 * Time complexity : O(n)O(n). Only a single pass is needed.

Space complexity : O(1)O(1). Only two variables are used.
 */
public class MaxProfitStocks {
	
	    public static int maxProfit(int prices[]) {
	        int minprice = Integer.MAX_VALUE;
	        int maxprofit = 0;
	        for (int i = 0; i < prices.length; i++) {
	            if (prices[i] < minprice)
	                minprice = prices[i];
	            else if (prices[i] - minprice > maxprofit)
	                maxprofit = prices[i] - minprice;
	        }
	        return maxprofit; 
	    }
	    public static void main(String args[])
	    {
	    	int maxP=MaxProfitStocks.maxProfit(new int[] {7,1,5,3,6,4});
	    	System.out.println("Maximum Profit is :"+maxP);
	    }
	}
