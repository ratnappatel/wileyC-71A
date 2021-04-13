package com.wiley.returnType;

public class ReturnValueCreate {

	public static boolean findPrimeNos(int nos[])
	{
		boolean flag=true;
		for(int i=0;i<nos.length;i++)
		{
			for(int j=2;j<=nos[i]/2;j++)
			{
				if(nos[i]%j==0)
				{
					flag=false;
					break;
				}
			}
			if(!flag)
				break;
			
		}
		return flag;
	}
	public static void main(String[] args) {
		int array[]= {2,5,7};
		System.out.println(ReturnValueCreate.findPrimeNos(array));
	}

}
