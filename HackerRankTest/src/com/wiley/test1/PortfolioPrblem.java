package com.wiley.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PortfolioPrblem {

	public static int maxValue(int length, int[][] rounds)
    {
		 
		        int[] arr = new int[length];
		        Arrays.fill(arr, 0);

		        for(int i = 0; i < rounds.length; i++) {
		            arr[rounds[i][0]] += rounds[i][2];
		            if(rounds[i][1] < length - 1)
		                arr[rounds[i][1] + 1] -= rounds[i][2];
		        }
		        for(int i = 1; i < length; i++) {
		            arr[i] += arr[i - 1];
		        }
		        
		        for(int i:arr)
		        System.out.print(i+"  ");
		        return 0;
		    }
   	public static void main(String[] args) throws Exception, IOException {
   		int updates[][]= {{1,2,10},{2,4,5},{3,5,12}};
	    PortfolioPrblem.maxValue(5,updates);
	    
	    System.out.println("---------------------------------------");
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("No. of Investment ..");
	    int n=Integer.parseInt(br.readLine());
	    System.out.println("No of rounds");
	    int r=Integer.parseInt(br.readLine());
	    int rounds[][]=new int[r][3];
	    
	    for(int i=0;i<r;i++)
	    {
	    	System.out.println("Enter contribution details..");
	    	String s=br.readLine();
	    	StringTokenizer st=new StringTokenizer(s, " ");
	    	int idx=0;
	    	int arr[]=new int[r];
	    	while(st.hasMoreTokens())
	    	{
	    		arr[idx]=Integer.parseInt(st.nextToken());
	    	}
	    	idx=0;
	    	rounds[idx]=arr;
	    }
	    
	    PortfolioPrblem.maxValue(n,rounds);
	  }

}
