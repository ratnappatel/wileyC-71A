package com.wiley.dst.arraylist1;

import java.util.Arrays;
import java.util.Collections;

public class MyArrayList {

	Employee e;
	//final default_init_capacity =10;
	int capacity=10; // without resizing a list
	Employee [] list; // this array list is most specific to Employee object: any Java Object + follow type saftey
	private int index=0,size=0;
	
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
		size++;
		index++;
		return true;
	}
	
	public boolean add(int index,Employee e) 
	{
		if(index<size)
		{
			if(size+1<capacity)
					System.arraycopy(list, index, list, index+1, size-index);
					list[index]=e;
					size++;
		}
		return true;
	}

	
	public void set(int index, Employee e)
	{
		list[index]=e;
	}
	
	
	public Employee get(int index)
	{
		if(index<size)
			e=list[index];
		return e;
	}
	
	public int size()
	{
		return size;
	}
	
	public void print() {
		for(int i=0;i<size;i++)
			System.out.println(list[i].hashCode());
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
		size--;
	}
	public void remove(Employee emp) throws Exception
	{
		for(int i=0;i<size;i++)
		{
			if(list[i].equals(emp))
			{
				remove(i);
				i--;
				continue;
			}
		}
	}
	
	public String toString() // for list object : collection employees
	{
		StringBuffer res=new StringBuffer("["); // not string 
		
		for(int i=0;i<size;i++)
			res.append(list[i].toString()); // it will create new string object
		
		res.append("]");
		String returns=res.toString();
		
		return returns;
	}
	public Employee[] toArray()
	{
		return Arrays.copyOf(list, size);
	}
}
