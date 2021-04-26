package com.wiley.timeComplexity;

public class BigONotation {

	public static void main(String[] args) {
		int n=10;
		int arr[]=new int[n];//{1,2,3,4,5};
		for(int i=0;i<n;i++)
			arr[i]=i+1;
		
		long startTime , endTime ,duration;
		BigO1 o1=new BigO1();
		BigON on=new BigON();
		BigON2 on2=new BigON2();
		
		System.out.println("\n BIG O OF CONSTANT 1");
		
		startTime = System.nanoTime();
		o1.operation(arr);
		endTime=System.nanoTime();
		duration=startTime-endTime;
		System.out.println("Execution time of constant algorithm O(1)"+duration);
		
		System.out.println("\n \nBIG O OF N");
		
		startTime = System.nanoTime();
		on.operation(arr);
		endTime=System.nanoTime();
		duration=startTime-endTime;
		System.out.println("Execution time of constant algorithm O(1)"+duration);
		
		
		System.out.println("\n \n BIG O OF N-SQUARE");
		startTime = System.nanoTime();
		on2.operation(arr);
		endTime=System.nanoTime();
		duration=startTime-endTime;
		System.out.println("\nExecution time of constant algorithm O(1)"+duration);

	}

}

//Constant 
class BigO1
{
	public void operation(int arr[])
	{
		int ans=1+arr[0];
		System.out.println("1 + arr[0] = "+ans);
	}
}

//Linear
class BigON
{
	public void operation(int arr[])
	{
		int total=0;
		for(int i:arr)
			total+=i;
		System.out.println("sum(n) = "+total);
	}
}

//n-square
class BigON2
{
	public void operation(int arr[])
	{
		System.out.println("pair[n]");
		for(int i:arr)
			for(int j=i+1;j<arr.length;j++)
				System.out.print("["+i+", "+j+"] ,");
	}
}