package com.wiley.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MainDigitalWallet2 {

	public static void main(String[] args)  {
		
		DigitalWallet w1=new DigitalWallet("1","Juli","abc");
		DigitalWallet w2=new DigitalWallet("2","Samantha");
		
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter No. of Transaction to be performed...");
		int n=0;
		try {
			System.out.println("No of transaction to perform");
			n = Integer.parseInt(br.readLine());
		} catch (Exception e1) {
			System.out.println(e1);
		} 
		
		String [][]transaction=new String[n][3]; 
		
		String s=null;
		StringTokenizer st=null;
		for(int i=0;i<n;i++)
		{
			try
			{
				System.out.println("give transaction details");
				s=br.readLine();
				st=new StringTokenizer(s," ");
				int idx=0;
				while(st.hasMoreTokens())
					transaction[i][idx++]=st.nextToken();
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		for(int i=0;i<transaction.length;i++)
		{
			String id=transaction[i][0];
			String type=transaction[i][1];
			int amount=Integer.parseInt(transaction[i][2]);
			
			
				
				try 
				{
					if(id.equals("1"))
					{
						if(w1.getUserAccessToken()!=null)
						{
							if(type.equals("pay"))
							{
								try {
									
									DigitalWalletTransaction.payMoney(w1,amount);
								} catch (Exception e) {
									System.out.println(e);
								}
							}
							else if(type.equals("add"))
							{
								try {
									DigitalWalletTransaction.addMoney(w1,amount);
								} catch (Exception e) {
									System.out.println(e);
								}
							}
						}
					}
					else if(id.equals("2"))
					{
						if(w2.getUserAccessToken()!=null)
						{
							if(type.equals("pay"))
							{
								try {
									
									DigitalWalletTransaction.payMoney(w1,amount);
								} catch (Exception e) {
									System.out.println(e);
								}
							}
							else if(type.equals("add"))
							{
								try {
									DigitalWalletTransaction.addMoney(w1,amount);
								} catch (Exception e) {
									System.out.println(e);
								}
							}
						}
					} 
				}
				catch (Exception e) 
				{
					System.out.println(e);
				}
				System.out.println(w1);
				System.out.println(w2);
			}
		}
}
	