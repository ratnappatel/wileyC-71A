package com.wiley.threads.synBlock;

public class Matrix {
	public void printMatrix(String name)
	{
		try
		{
			for(int i=3;i>0;i--)
			{
				System.out.println(name+" -- "+i);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
