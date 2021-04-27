package com.wiley.interview.stack;

import java.util.ArrayList;
import java.util.List;

public class FindGreaterToTheirRigth {

	public static List<Integer> find(int arr[])
	{
		
			List<Integer> li = new ArrayList<>();
			
			int curMax = arr[arr.length-1];

			
			li.add(arr[arr.length-1]);
			
			
			for(int i=arr.length-2;i>=0;i--) {
				if(arr[i]>curMax)
					li.add(arr[i]);
				curMax = Math.max(curMax, arr[i]);
			}
			
			return li;
		}
	public static void main(String[] args) {

		int arr[]= {10,4,6,3,5};
		System.out.println(FindGreaterToTheirRigth.find(arr));
	}

}
