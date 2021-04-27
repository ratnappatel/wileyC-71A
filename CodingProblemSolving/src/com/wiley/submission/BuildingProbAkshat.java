package com.wiley.submission;

public class BuildingProbAkshat {

	public static void main(String[] args) {
		int[] n=new int[] {1,3,3,2,4,1,5,3,2};
		int left;
		int right=0;
		int mid;
		int i=0;

		if(n.length==2)
		{
			System.out.println(Math.min(n[0],n[1])*2);
			return;
			}
		int maxArea=-Integer.MAX_VALUE;
		while(right+2<n.length)
		{
			left=i;
			right=i+2;
			mid=left+1;
			i++;
			int a1=Math.min(n[left],n[mid])*2;
			int a2=Math.min(n[right],Math.min(n[left],n[mid]))*3;
			int a3=Math.min(n[right], n[mid])*2;
			System.out.println(a1+" "+a2+" "+a3);
			maxArea=Math.max(maxArea, Math.max(a2,Math.max(a1, a3)));
		}
		System.out.println(maxArea);
		}


}
