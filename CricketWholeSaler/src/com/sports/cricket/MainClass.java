package com.sports.cricket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) throws IOException {

		//System.out.println("Enter your purchase Details seperated with , (comma)");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Purchase> purchases=new ArrayList<Purchase>();
		String ch="yes";
		do
		{
			try 
			{
				System.out.println("Enter your purchase Details seperated with , (comma)");
				String input=br.readLine();
				purchases.add(Purchase.obtainPurchaseWithAmount(input));
			} 
			catch (Exception e)
			{
				System.out.println(e);
				break;
			} 
			System.out.println("would you like to purcahse more item?(yes/no)?");
			ch=br.readLine();
		}while(ch.equalsIgnoreCase("yes"));
		
		System.out.println(purchases);
	}
}

