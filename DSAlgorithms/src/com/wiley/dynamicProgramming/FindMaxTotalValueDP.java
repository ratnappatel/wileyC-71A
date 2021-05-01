package com.wiley.dynamicProgramming;

import java.util.Arrays;
import java.util.Comparator;

import com.wiley.greedy.FindMaxTotalValue;


public class FindMaxTotalValueDP {
	public static int knapsack(Item[] items,int n, int capacity)
	{
		int [][] value=new int[n+1][capacity+1]; //[value][weight]
		
		for(int i=0;i<=n;i++)
		{
			for(int wt=0;wt<=capacity;wt++)
			{
				if(i==0 || wt==0)
					value[i][wt]=0;
				else if(items[i-1].getWeight()<=wt)
				{
					//System.out.println(items[i-1].getValue()+" + "+value[i-1][wt-items[i-1].getWeight()]+" , "+value[i-1][wt]);
					value[i][wt]=Math.max(items[i-1].getValue() + value[i-1][wt-items[i-1].getWeight()] ,value[i-1][wt]);
					
				}
				else
				{
					//System.out.println(value[i-1][wt]);
					value[i][wt]=value[i-1][wt];
				}
					//System.out.println();
			}
		}
		return value[n][capacity];
	}
	
	public static void main(String[] args) {


		Item [] items=new Item[3];
		items[0]=new Item(10,60);
		items[1]=new Item(20,100);
		items[2]=new Item(30,120);
		System.out.println("Max Total Value : "+FindMaxTotalValueDP.knapsack(items, 3, 50));
		
		System.out.println("====================================================");
		Item [] items1=new Item[5];
		items1[0]=new Item(10,60);
		items1[1]=new Item(20,100);
		items1[2]=new Item(30,120);
		items1[3]=new Item(40,180);
		items1[4]=new Item(50,210);
		System.out.println("Max Total Value : "+FindMaxTotalValueDP.knapsack(items1, 5, 120));
		
	}

	public static int knapsacRec(Item [] items,int n, int capacity)
	{
		if(n<=0)
			return 0;
		else if(items[n-1].getWeight()>capacity)
			return knapsacRec(items,n-1,capacity);
		else
			return Math.max(knapsacRec(items,n-1,capacity), knapsacRec(items, n-1, capacity-items[n-1].getWeight()));
			
	}
}


class Item
{
	int weight;
	int value;
	
	public Item(int weight, int value) {
		super();
		this.weight = weight;
		this.value = value;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Item [weight=" + weight + ", value=" + value + "]";
	}
	
}

