package com.wiley.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PortfoliProblem1 {

	public static int maxValue(int length, int[][] rounds)
    {
		 
		        int[] arr = new int[length+1];
		        int max=0;
		        Arrays.fill(arr, 0);
		        
		        for(int i = 0; i < rounds.length; i++) //No of Rows
		        {
		            int startIndex=rounds[i][0];
		            int endIndex=rounds[i][1];
		            int amount=rounds[i][2];
		            System.out.println(startIndex+" , "+endIndex+" , "+amount );
		            for(int start=startIndex;start<=endIndex;start++)
		            {
		            	arr[start]+=amount;  //arithmetic assignment	
		            	max=Math.max(max, arr[start]);
		             }
		        }
		       for(int i:arr)
		    	   System.out.print(i+"  ");
		       System.out.println();
		       
		        return max;
		    }
   	public static void main(String[] args) throws Exception, IOException {
		/*
		 * int updates[][]= {{1,2,10},{2,4,5},{3,5,12}};
		 * System.out.println(PortfoliProblem1.maxValue(5,updates));
		 */
	    
	    System.out.println("---------------------------------------");
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    
	    System.out.println("No. of Investment ..");  // 5
	    int n=Integer.parseInt(br.readLine()); 
	    
	    System.out.println("No of rounds");//3
	    int r=Integer.parseInt(br.readLine());
	    
	    int rounds[][]=new int[r][3]; // START , END ,AMOUNT
	    
	    for(int i=0;i<r;i++)
	    {
	    	System.out.println("Enter contribution details..");
	    	String s=br.readLine();
	    	
	    	StringTokenizer st=new StringTokenizer(s, " ");
	    	int idx=0;
	    	int arr[]=new int[r]; //EACH CONTRI
	    	while(st.hasMoreTokens())
	    	{
	    		arr[idx]=Integer.parseInt(st.nextToken());
	    		idx++;
	    	}
	    	rounds[i]=arr;
	    }
	    
	    System.out.println("\nMaximum Investment is :"+PortfoliProblem1.maxValue(n,rounds));
	  }

}
