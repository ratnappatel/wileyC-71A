package com.wiley.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SchoolHospitalMain {

	public static void main(String[] args) throws IOException 
	{
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Give Your Input");
		String i1=br.readLine();
		System.out.println(i1);
		StringTokenizer st=new StringTokenizer(i1," ");
		int input[]=new int[2];
		int i=0;
		while(st.hasMoreTokens())
		{
			input[i]=Integer.parseInt(st.nextToken());
			i++;
		}
		School s1=new School(input[0]);
		Hospital h1=new Hospital(input[1]);
		
		//SCHOOL FLOOR COMPLETED-----------------------------------------------
		System.out.println("\nGive Your Input");
		i1=br.readLine();
		st=new StringTokenizer(i1," ");
		i=0;
		int input1[]=new int[3];
		while(st.hasMoreTokens())
		{
			input1[i]=Integer.parseInt(st.nextToken());
			System.out.println(input1[i]);
			i++;
		}
		for(int j:input1)
			s1.floorCompleted(j);
		//SCHOOL PRINT STATUS----------------------------------------------
		System.out.println("\nGive Your Input");
		i1=br.readLine();
		st=new StringTokenizer(i1," ");
		int input2[]=new int[3];
		i=0;
		while(st.hasMoreTokens())
		{
			input2[i]=Integer.parseInt(st.nextToken());
			i++;
		}
		for(int j:input2)
			s1.printStatus(j);
		
		//HOSPITAL FLOOR COMPLETED----------------------------------------------------
		System.out.println("\nGive Your Input");
		i1=br.readLine();
		st=new StringTokenizer(i1," ");
		i=0;
		while(st.hasMoreTokens())
			i=Integer.parseInt(st.nextToken());
		
		h1.floorCompleted(i);
		
		//HOSPITAL PRINT STATUS----------------------------------------------------
		System.out.println("\nGive Your Input");
		i1=br.readLine();
		st=new StringTokenizer(i1," ");
		i=0;
		int input4[]=new int[4];
		while(st.hasMoreTokens())
		{
			input4[i]=Integer.parseInt(st.nextToken());
			i++;
		}
		for(int j:input4)
			h1.printStatus(j);
		
	}

}
