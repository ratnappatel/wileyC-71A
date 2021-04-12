package com.wiley.coupling;

public class Volume {
	int vol;
	public static void main(String args[])
	{
		Box b=new Box(12,56,89);
		//System.out.println("The Volume of Box is: "+b.vol);
	}

}
class Box
{

	public Box(int length,int width,int height)
	{
		int vol=length*width*height;
	}
}