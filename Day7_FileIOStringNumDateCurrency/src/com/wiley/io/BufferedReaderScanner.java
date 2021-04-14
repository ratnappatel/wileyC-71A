package com.wiley.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedReaderScanner {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your id");
		int id=sc.nextInt();
		System.out.println("Enter Your address");
		String address=sc.nextLine();
		
		System.out.println("Id: "+id+"Address is :"+address);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your id");
		int id1=Integer.parseInt(br.readLine());
		System.out.println("Enter Your address");
		String address1=br.readLine();
		System.out.println("Id: "+id1+"Address is :"+address1);
		
	}

}
