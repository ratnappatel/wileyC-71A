package com.wiley.teets;

import java.util.Scanner;

public class TweetArray {

	Tweet tweets[];
	Scanner sc;
	int id;
	String content;
	public TweetArray(int size)
	{
		tweets=new Tweet[size];
		sc=new Scanner(System.in);
	}
	public void addTweet(int index)throws Exception
	{
		System.out.println("Enter Tweet Id:");
		id=sc.nextInt();
		content=sc.next();
		tweets[index]=new Tweet(id,content); 
		/*
		 * try { tweets[index]=new Tweet(id,content); } catch (Exception e) {
		 * System.out.println("WE CAN NOT ACCOMMODATE MORE TWeets"); //System.exit(0);
		 * // terminate program }
		 */
	}
	public void readTweet(int index)
	{
		System.out.println(tweets[index]);
	}
	
	public static void main(String[] args) {

		TweetArray t=new TweetArray(2);
		String ch="yes";
		int i=0;
		Scanner sc1=new Scanner(System.in);
		do
		{
			try {
				t.addTweet(i++);
			} catch (Exception e) {
				System.out.println("WE CAN NOT ACCOMMODATE MORE TWeets");
				break;
			}
			System.out.println("Would you like to add more tweets(yes/no) ? ");
			ch=sc1.next();
		}while(ch.equalsIgnoreCase("yes"));
		
		t.readTweet(1);
	}

}
