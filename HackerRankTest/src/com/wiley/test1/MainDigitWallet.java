package com.wiley.test1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MainDigitWallet {

	public static void main(String[] args) {
		
		String input[]=new String[3];
		DigitalWallet []wallets=null;
		try 
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("No.of Wallets to be created");
			int n=Integer.parseInt(br.readLine());
			wallets=new DigitalWallet[n];
			
			
			System.out.println("Add wallet details:");
			String w1=br.readLine();
			String w2=br.readLine();
			
			StringTokenizer st=new StringTokenizer(w1," ");
			int i=0;
			while(st.hasMoreTokens())
			{
				input[i]=st.nextToken();
			}
			wallets[0]=new DigitalWallet(input[0],input[1],input[2]);
			
			st=new StringTokenizer(w2," ");
			i=0;
			while(st.hasMoreTokens())
			{
				input[i]=st.nextToken();
			}
			wallets[1]=new DigitalWallet(input[0],input[1]);	
			
			
			System.out.println("How Many Transaction are needed to perform..");
			n=Integer.parseInt(br.readLine());
			
			String ts[]=new String[n];
			for(int j=0;j<n;j++)
					ts[j]=br.readLine();
					
			
			for(int j=0;j<n;j++)
			{
				st=new StringTokenizer(ts[j]," ");
				while(st.hasMoreTokens())
				{
					if(st.nextToken().equals("1"))
					{
						if(wallets[0].getUserAccessToken()!=null)
						{
							if(st.nextToken().equalsIgnoreCase("pay"))
							{
								try {
									DigitalWalletTransaction.payMoney(wallets[0]
											, Integer.parseInt(st.nextToken()));
								} catch (Exception e) {
									System.out.println(e);
								}
								
							}
							else if(st.nextToken().equalsIgnoreCase("add"))
								try {
									DigitalWalletTransaction.addMoney(wallets[0]
											, Integer.parseInt(st.nextToken()));
								} catch (Exception e) {
									System.out.println(e);
								}
						}
					}
					else if(st.nextToken().equals("2"))
					{
						if(wallets[1].getUserAccessToken()!=null)
						{
							if(st.nextToken().equalsIgnoreCase("pay"))
									DigitalWalletTransaction.payMoney(wallets[1]
											, Integer.parseInt(st.nextToken()));
								else if(st.nextToken().equalsIgnoreCase("add"))
									DigitalWalletTransaction.addMoney(wallets[1]
											, Integer.parseInt(st.nextToken()));
						}
					}
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(wallets[0]);
		System.out.println(wallets[1]);
	}

}
