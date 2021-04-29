package com.wiley.sorting.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// O(n2)
public class BruteForceMostFreqElement {

	//O(1)
	public static int frequentElement(int a[] ,int n)
	{
		int maxFreq=0;
		int temp=-1; // the element which is most frequent to be stored...
		
		for(int i=0;i<n;i++)
		{
			int currFreq=1;
			for(int j=i+1;j<n;j++)
				if(a[i]==a[j])
					currFreq++;
			if(maxFreq<currFreq)
			{
				maxFreq=currFreq;
				temp=a[i];
			}
			else if(maxFreq==currFreq)
				temp=Math.min(temp, a[i]);
		}
		return temp;
		
	}
	// using sorting=linear O(nlogn)+O(n) = O(n)
	//O(1) , merge sort O(n)
public static int frequentElement1(int a[],int n)
	{
		int maxFreq=0;
		int temp=-1;
		
		Arrays.sort(a);
		int i=0;
		while(i<n)
		{
			int currFreq=1;
			while(i+1<n && a[i+1]==a[i])
			{
				currFreq=currFreq+1;
				i++;
			}
			if(maxFreq<currFreq)
			{
				maxFreq=currFreq;
				temp=a[i];
			}
			else if(maxFreq==currFreq)
				temp=Math.min(temp, a[i]);
					
		}
		return temp;
		
	}
	// using HashMap/HashTable + Stream
	public static int frequentElement2(int a[],int n)
	{
		int temp=-1;
		int max=0;
		HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
		for(int i:a)
		{
			if(map.containsKey(i))
				map.put(i, map.get(i)+1);
			else
				map.put(i, 1); //utilize autoboxing
		}
		
		Set<Entry<Integer,Integer>> elements=map.entrySet();
		for(Map.Entry<Integer,Integer> e:elements)
		{
			if(e.getValue()>max)
			{
				max=e.getValue();
				temp=e.getKey();
			}
		}
		return temp;
	}
	
	public static void main(String[] args) {
		int no=BruteForceMostFreqElement.frequentElement2(new int[]{2,5,3,7,3,2},6);
		System.out.println("Most Frequent No is :"+no);
	}

}

















