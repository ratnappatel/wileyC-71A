package com.wiley.test1.canvasEvent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MergeLinkedList {

	public static  List<Integer> mergedList(ArrayList<LinkedList> arr)
	{
		List<Integer> mlist=new ArrayList<Integer>();
		
		for(int i=0;i<arr.size();i++)
		{
			if(i==0)
				mlist.addAll(arr.get(i));
			else
			{
				mlist.addAll(arr.get(i));
				Collections.sort(mlist);
			}
		}
		return mlist;
	}
	public void mySort()
	{
		
	}
	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(1);
		l1.add(4);
		l1.add(5);
		LinkedList<Integer> l2=new LinkedList<Integer>();
		l2.add(1);
		l2.add(3);
		l2.add(4);
		LinkedList<Integer> l3=new LinkedList<Integer>();
		l3.add(2);
		l3.add(6);
	

		ArrayList<LinkedList> arr=new ArrayList<LinkedList>();
		arr.add(l1);
		arr.add(l2);
		arr.add(l3);
		List a1[]= {l1,l2,l3};
		
		List<Integer> res=MergeLinkedList.mergedList(arr);
		System.out.println(res);
		

	}

}
