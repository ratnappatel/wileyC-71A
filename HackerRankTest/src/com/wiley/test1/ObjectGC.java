package com.wiley.test1;

public class ObjectGC {

	public static void getObject(ObjectGC o1) // passed by reference [Object]
	{
		System.out.println(o1.toString()); // eligible fo GC
	}
	public static void main(String[] args) {
		ObjectGC g=new ObjectGC();
		g=null;
		ObjectGC.getObject(g);
	}

}
