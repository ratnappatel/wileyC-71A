package com.wiley.dst;
import java.io.*;
import java.util.*; 

class ProductArrayPuzzle{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            
        }
  } 
 
class Solution 
{ 
	public static long[] productExceptSelf(int arr[], int n) 
	{ 
        long ans[] = new long[n];
        int noOfZeros = 0;
        long wholeProd = 1;
        for(int i=0;i <n;i++){
            if(arr[i]==0) noOfZeros +=1;
            wholeProd*=(arr[i]==0?1 : arr[i]);
        }
        if(noOfZeros > 1){
            return ans;
        }
        if(noOfZeros==0){
            for(int i=0;i<n;i++){
                ans[i] = wholeProd/arr[i];
            }
            return ans;
        }
        for(int i=0;i<n;i++){
                ans[i] = arr[i] == 0?wholeProd : 0;
            }
        return ans;
	} 
} 