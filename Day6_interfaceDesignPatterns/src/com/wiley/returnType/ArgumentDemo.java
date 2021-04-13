package com.wiley.returnType;

public class ArgumentDemo {

	int total=0;
	public void func1(int b,int ... a) // 10 
	{
		
	}
	public void func2(Object ... args)
	{
		for(int i=0;i<args.length;i++)
			total+=(Integer)args[i];
	}
	public static void main(String[] args) {
		ArgumentDemo a1=new ArgumentDemo();
		a1.func1(12, 34,56,8,90);
		a1.func2(12,45,78,"sdf");

	}

}
