package com.wiley.arrays;


// O(nk) time |  O(nk) space
public class MaxProfitKTrans {

	// method is independent to be called without any usage of field / instance variable
	// start thinking on worst-case : data passed are missing / values : data passed has highest nos
	public static int  maxProfitKTransaction(int prices[], int k)
	{
		if(prices.length == 0)
			return 0;
		int [][] profits=new int[k+1][prices.length]; // allocate memory to an array in java will initialize it elements with default value
		for(int i=1;i<k+1;i++)
		{
			int maxP=Integer.MIN_VALUE;
			for(int d=1;d<prices.length;d++)
			{
				
				maxP=Math.max(maxP, profits[i-1][d-1]-prices[d-1]);
				//System.out.println(""+maxP+" , "+profits[i-1][d-1]+" - "+prices[d-1]);
				profits[i][d]=Math.max(profits[i][d-1], maxP+prices[d]);
				//System.out.println();
			}
			
		}
		for(int i=0;i<profits.length;i++)
		{
			for(int j=0;j<profits[i].length;j++)
				System.out.print(profits[i][j]+"  ");
			System.out.println("\n");
		}
		System.out.println();
		return profits[k][prices.length-1];
	}
	public static void main(String[] args) {
		int maxP=MaxProfitKTrans.maxProfitKTransaction(new int[] {5,11,3,50,60,90}, 2);
		
		System.out.println("The Max Profit earned with 2 transaction is : "+maxP);
	}

}
