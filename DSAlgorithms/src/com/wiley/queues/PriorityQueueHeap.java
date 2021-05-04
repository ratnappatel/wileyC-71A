package com.wiley.queues;

// MAXIMUM PRIORITY QUEUE

public class PriorityQueueHeap {
	
	static int heapSize=0;
	static int arraySize=20;
	static int f=10000;
	public static void maxHeap(int arr[])
	{
		for(int i=heapSize/2;i>=1;i--)
			heapify(arr,i);
	}
	private static void heapify(int[] arr, int i) 

	{
		int leftChild=getLeftChild(arr,i);
		int rightChild=getRightChild(arr,i);
		
		int max=i;
		if((leftChild<=heapSize) && (leftChild>0))
		{
			if(arr[leftChild]>arr[max])
				max=leftChild;
		}
		
		if(rightChild<=heapSize && (rightChild>0))
		{
			if(arr[rightChild]>arr[max])
				max=leftChild;
		}
		
		if(max!=i)
		{
			int temp;
			temp=arr[max];
			arr[max]=arr[i];
			arr[i]=temp;
			heapify(arr,max);
		}
	}
	public static int maximum(int arr[])
	{
		return arr[1];
	}
	
	private static int getRightChild(int[] arr, int i) {
		
		if(((i*2)+1)<arr.length && (i>=1))
			return(2*i)+1;
		return -1;
	}
	private static int getLeftChild(int[] arr, int i) {
		if((2*i)<arr.length && (i>=1))
			return 2*i;
		return -1;
	}
	
	public static int getParent(int arr[],int i)
	{
		if((i>1) && (i<arr.length))
			return i/2; // narrowing conversion  float--> int[its in range]
		return -1;
	}
	
	public static void printHeap(int arr[])
	{
		System.out.print("[ ");
		for(int i=1;i<=heapSize;i++)
			System.out.print(arr[i]+" , ");
		System.out.print("]\n");
	}
	
	public static void add(int arr[],int data)
	{
		heapSize++;
		arr[heapSize]=-1*f;
		System.out.println(arr[heapSize]);
		increaseKey(arr,heapSize,data);
		
	}
	public static int dequeue(int arr[])
	{
		int max=arr[1]; // maximum node / element 
		arr[1]=arr[heapSize]; // 1000
		heapSize--;
		heapify(arr,1);
		return max;
	}
	private static void increaseKey(int[] arr, int i, int data) {
		arr[i]=data;
		System.out.println(arr[i]+" == "+getParent(arr,i));
		while((i>1)&& (arr[getParent(arr,i)]<arr[i]))
		{
			int temp;
			temp=arr[getParent(arr,i)];
			arr[getParent(arr,i)]=arr[i];
			arr[i]=temp;
			i=getParent(arr,i);
		}
	}
	public static void main(String[] args) {
		int arr[]=new int[arraySize];
		maxHeap(arr);
		
		add(arr,20);
		System.out.println("Level 0");
		add(arr,15);
		add(arr,8);
		System.out.println("Level 1");
		  add(arr,10); add(arr,5); add(arr,7); add(arr,6); 
		  System.out.println("Level 2");
		  add(arr,9);
		 add(arr,35);
		System.out.println("\n\n======================================\n");
		printHeap(arr);
		System.out.println("\nMax Node is : "+maximum(arr));
		
		System.out.println("\nDequeuing max element "+dequeue(arr));
		printHeap(arr);
		
		System.out.println("\nDequeuing max element "+dequeue(arr));
		printHeap(arr);
	}

}

// 1. find an element and return its index + its parent node too
// PQ ELE:KEY[PRIORITY] 2. 
