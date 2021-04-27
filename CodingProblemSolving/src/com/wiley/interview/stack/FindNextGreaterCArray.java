package com.wiley.interview.stack;

import java.util.Arrays;
import java.util.Stack;

public class FindNextGreaterCArray {

	public static int[] find(int arr[])
	{
		int n=arr.length;
		int res[]=new int[n];
		
		Arrays.fill(res, -1);
		Stack<Integer> stack=new Stack<Integer>();
		
		for(int i=0;i<2*n;i++) // O(2*n) =O(n) time
		{
			while(!stack.isEmpty() && arr[stack.peek()]<arr[i%n]) // called for element if they find next element >
				res[stack.pop()]=arr[i%n];
			stack.add(i%n);
		}
		return res;
	}
	public static void main(String[] args) {
		int input[]= {3,5,2,4};
		int res[]=FindNextGreaterCArray.find(input);
		System.out.println(Arrays.toString(res));
		
		int input1[]= {7,5,3,4};
		int []res1=FindNextGreaterCArray.find(input1);
		System.out.println(Arrays.toString(res1));
		

	}

}
