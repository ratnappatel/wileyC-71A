package com.wiley.interview;

import java.util.ArrayList;
import java.util.Stack;

// dry-run table
public class LargestRectAngle {
	
	
	//O(n)  |O(n)
	public static int largestRect(ArrayList<Integer> buildings)
	{
		Stack<Integer> pillar=new Stack<Integer>();
		int maxArea=0;
		
		ArrayList<Integer> extendedBuildings=new ArrayList<Integer>(buildings);
		extendedBuildings.add(0);
		
		for(int i=0;i<extendedBuildings.size();i++)
		{
			int h=extendedBuildings.get(i);
			System.out.println("Height : "+h);
			while(!pillar.isEmpty() && extendedBuildings.get(pillar.peek())>=h)
			{
				int pillarH=extendedBuildings.get(pillar.pop());
				int width=(pillar.isEmpty())?i:i-pillar.peek()-1;
				maxArea=Math.max(width*pillarH,maxArea);
			}
			pillar.push(i);
		}
 		
		return maxArea;
	}

	public static void main(String[] args) {
		ArrayList<Integer> bs=new ArrayList<Integer>();
		
		  bs.add(1); bs.add(3); bs.add(3); bs.add(2); bs.add(4); bs.add(1); bs.add(5);
		  bs.add(3); bs.add(2);
		 
		
		/*
		 * bs.add(1); bs.add(1); bs.add(1);
		 */
		
		int ma=LargestRectAngle.largestRect(bs);//4
		System.out.println("Largest Rectangle :"+ma);

	}

}
