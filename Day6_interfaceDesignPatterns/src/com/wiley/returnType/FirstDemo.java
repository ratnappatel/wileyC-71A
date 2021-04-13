package com.wiley.returnType;

public class FirstDemo {
	
	int nos[]=new int[3];
	String arr[]=new String[nos.length];
	public FirstDemo(int n1[])
	{
		this.nos=n1;
	}
	public String[] square()
	{
		for(int i=0;i<3;i++)
			arr[i]=nos[i]+" : "+nos[i]*nos[i];
		
		return arr;
	}

	public Square[] doSquare(int a1[])
	{
		Square s[]=new Square[3];
		for(int i=0;i<a1.length;i++)
			s[i]=new Square(a1[i],a1[i]*a1[i]);
		
		return s;
	}
	public static void main(String[] args) {
		int input[]= {23,45,67};
		FirstDemo f1=new FirstDemo(input);
		
		String result[]=f1.square();
		
		for(String s:result)
			System.out.println(s);
		
		Square s1[]=f1.doSquare(input);
		for(Square s:s1)
			if(s.squr>2000)
				System.out.println(s);
		
			
	}

}
// custom data type
class Square
{
	int no;
	int squr;
	public Square(int no,int squr)
	{
		this.no=no;
		this.squr=squr;
	}
	@Override
	public String toString() {
		return ""+ no + " : " + squr ;
	}
	
}
// take 10 number as input and display their square as given below: 5 : 25 , 6: 36 , 7:49