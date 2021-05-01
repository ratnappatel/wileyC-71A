package com.wiley.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class FindMaxTotalValue {

	public static int kanpSack(Item items[],int n,int capacity) 
	{
		Arrays.sort(items, new ItemComparator());
		
		  for(Item i:items) System.out.println(i);
			int curr=0;
			int ans=0;
		
		for(int i=0;i<n;i++)
		{
			if(curr+items[i].getWeight()<=capacity)
			{
				curr+=items[i].getWeight();
				ans+=items[i].getValue();
			}
			else
			{
				int rem=capacity-curr;
				int finalValue=(int)(items[i].getValue()*((float)rem/items[i].getWeight()));
				ans=ans+finalValue-rem;

				break;
			}
		}
		System.out.println("Weight is : "+curr);
		System.out.println("Value is : "+ans);
		return ans;
	}
	public static void main(String[] args) {
		
		Item [] items=new Item[3];
		items[0]=new Item(10,60);
		items[1]=new Item(20,100);
		items[2]=new Item(30,120);
		System.out.println("Max Total Value : "+FindMaxTotalValue.kanpSack(items, 3, 50));
		
		System.out.println("====================================================");
		Item [] items1=new Item[5];
		items1[0]=new Item(10,60);
		items1[1]=new Item(20,100);
		items1[2]=new Item(30,120);
		items1[3]=new Item(40,180);
		items1[4]=new Item(50,210);
		System.out.println("Max Total Value : "+FindMaxTotalValue.kanpSack(items1, 5, 120));
	}

}

// sorting on custom object 
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

class ItemComparator implements Comparator<Item>
{

	@Override
	public int compare(Item a, Item b) {
		int res=(a.getValue()/a.getWeight())>(b.getValue()/b.getWeight())?-1:1;
		return res;
	}
	
}