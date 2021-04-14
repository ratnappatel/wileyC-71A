package com.wiley.dst.arraylist1;

public class EmployeeArrayListDemo {

	public static void main(String[] args) {
		MyArrayList emps=new MyArrayList(); // 10
		emps.add(new Employee(1,"ratna","patel"));
		emps.add(new Employee(2,"sapna","das"));
		emps.add(new Employee(3,"gargesh","shah"));
		emps.add(new Employee(4,"pinakin","patel"));
		emps.add(new Employee(5,"ketan","joshi"));

		System.out.println("=======================================================");
		System.out.println("No. of Elements in List are :"+emps.size());
		//emps.print();
		
		emps.print();
		
		 
		/* try { emps.remove(2); } catch (Exception e) { System.out.println(e); }
		 * System.out.println(emps);
		 * 
		 * System.out.println("\n"+emps.get(4));
		 */
		
		  try { emps.remove(new Employee(4,"pinakin","patel")); } catch (Exception e) {
		  System.out.println(e); }
		  System.out.println("After Removing Employee with id 4");
		  System.out.println(emps);
		  
		  System.out.println(
		  "\n**********************************************************************\n")
		  ; Employee employees[]=emps.toArray();
		  
		  for(Employee e:employees) System.out.println(e);
		 
		
		emps.add(4,new Employee(4,"Uttam","Patel"));
		System.out.println("\n---------------------------------------------------------------------------\n");
		System.out.println(emps);
		
		
		emps.set(3,new Employee(13,"Mayur","Patel"));
		System.out.println("\n---------------------------------------------------------------------------\n");
		System.out.println(emps);
	}

}
