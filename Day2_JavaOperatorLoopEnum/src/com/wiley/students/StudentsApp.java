package com.wiley.students;

import java.util.Scanner;

//Array , looping constructs, if -constructs 

public class StudentsApp 
{
	
	Student students[]=new Student[3];
	int size=0,rollno,marks;
	String name,subject;
	Student s;
	Scanner sc;
	public  StudentsApp()
	{
		sc=new Scanner(System.in);
	}
	public void addStudent(int rollno,String name,String subject,int marks)
	{
		if(size>=3)
		{
			for(int i=0;i<students.length;i++)
			{
				if(students[i].getRollno()==0)
				{
					students[i].setRollno(rollno);
					students[i].setName(name);
					students[i].setSubject(subject);
					students[i].setMarks(marks);
					break;
				}
				else
					System.out.println("You can not add more elements to array....");
			}
		}
		else
		{
			s=new Student(rollno, name, subject, marks);
			students[size]=s;
			size++;
		}
			
	}
	
	public void updateStudent(int rollno,String subject,int marks)
	{
		for(Student s:students)
		{
			if(s.getRollno()==rollno)
			{
				s.setMarks(marks);
				s.setSubject(subject);
			}
		}
	}
	
	public void getAllStudent()
	{
		for(int i=0;i<students.length;i++)
			System.out.println(students[i]);
	}
	
	public void getStudent(int rollno)
	{
		for(int i=0;i<students.length;i++)
		{
			if(students[i].getRollno()==rollno)
				System.out.println(students[i]);
			break;
		}
	}
	
	public void removeStudent(int rollno)
	{
		for(Student s:students)
			if(s.getRollno()==rollno)
				{
					s.setRollno(0);
					s.setName("");
					s.setSubject("");
					s.setMarks(0);
				}
	}
	
	public void input(int operation)
	{
		if(operation == 1)
		{
			System.out.println("Enter Student Details : rollno ,name , subject , marks");
			rollno=sc.nextInt();
			name=sc.next();
			subject=sc.next();
			marks=sc.nextInt();
			addStudent(rollno,name,subject,marks);
			getStudent(rollno);
		}
		else if(operation == 2)
		{
			System.out.println("Enter Student Details : rollno , subject , marks");
			rollno=sc.nextInt();
			subject=sc.next();
			marks=sc.nextInt();
			updateStudent(rollno, subject, marks);
			getStudent(rollno);
		}
		else if(operation == 3)
		{
			System.out.println("Enter Rollno of a student to remove Details..");
			rollno=sc.nextInt();
			removeStudent(rollno);
			getAllStudent();
		}
		else if(operation == 5)
		{
			System.out.println("Enter Rollno of a student to get Details..");
			rollno=sc.nextInt();
			getStudent(rollno);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input="";
		int ch;
		
		StudentsApp app=new StudentsApp();
		do
		{
			System.out.println("1. Add New Student Details");
			System.out.println("2. Update Student Details");
			System.out.println("3. Remove Student Details");
			System.out.println("4. Get All Student Details");
			System.out.println("5. Get Student's Details");
			ch=sc.nextInt();
			
			switch(ch)
			{
				case 1:
					app.input(1);			
					break;
				case 2:
						app.input(2);
						break;
				case 3:
						app.input(3);
						break;
				case 4:
						app.getAllStudent();
						break;
				case 5:
					app.input(5);
					break;
				default:
					System.out.println("Invalid Choice..");
						
			}
			
			System.out.println("Do you like to Perform more Operation ?(yes/no)");
			input=sc.next();
		}while(input.equalsIgnoreCase("yes"));

	}

}
