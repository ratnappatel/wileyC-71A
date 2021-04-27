package com.wiley.arrays;

public class MaxProfitStockON2 {
	
	    public static int maxProfit(int prices[]) {
	        int maxprofit = 0;
	        for (int i = 0; i < prices.length - 1; i++) {
	            for (int j = i + 1; j < prices.length; j++) {
	                int profit = prices[j] - prices[i];
	                if (profit > maxprofit)
	                    maxprofit = profit;
	            }
	        }
	        return maxprofit;
	    }
	    public static void main(String args[])
	    {
	    	int maxP=MaxProfitStockON2.maxProfit(new int[] {7,1,5,3,6,4});
	    	System.out.println("Maximum Profit is :"+maxP);
	    }
	}

