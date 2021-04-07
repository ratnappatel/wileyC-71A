package com.wiley.array;

public class CreateArray {

	public static void main(String[] args) {
		int arr[]; // declaration of array  =0  local variable
		arr=new int[5];
		
		for(int i=0;i<args.length;i++)
			arr[i]=Integer.parseInt(args[i]);
		
		// wrapper class  can convert one data type to other
		// taking command line input 
		
		for(int x:arr)
			System.out.print(x+" , ");
	}

}
