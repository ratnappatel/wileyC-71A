package com.wiley.dst.arraylist1;

import java.util.Collections;

public class MyArrayList {

	Employee e;
	int capacity=10; // without resizing a list
	Employee [] list;
	int index=0,size=0;
	
	public MyArrayList()
	{
		list=new Employee[capacity];
	}
	public MyArrayList(int capacity)
	{
		this.capacity=capacity;
		list=new Employee[capacity];
	}
	public boolean add(Employee e) // compile time checking by generics
	{
		if(size()==capacity)
		{
			capacity=capacity+capacity/2;
			Employee list1[]=new Employee[capacity];
			System.arraycopy(list, 0,list1, 0, size());
			list=list1;
		}
		list[index]=e;
		index++;
		return true;
	}
	public Employee get(int index)
	{
		e=list[index];
		return e;
	}
	
	public int size()
	{
		size=list.length;
		return size;
	}
	
	public void remove(int i)throws Exception
	{
		if(i>this.index)
			throw new Exception("ArrayIndexOutOfBound");
		if(i<0)
			throw new Exception("Negative Value");
		System.out.println("Object getting removed:"+this.list[i]);
		for(int x=i;x<list.length-1;x++)
			list[x]=list[x+1];
		index--;
	}
	public String toString()
	{
		StringBuffer res=new StringBuffer("{");
		for(Employee e:list)
			res=res.append(e);
		res=res.append("}");
		String returns=res.toString();
		
		return returns;
	}
	
}
