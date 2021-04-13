package com.wiley.returnType;


//factory method design pattern
public class EmployeeFactory implements EmployeeInterface {
	Employee e;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getEmployee(int args) {
		if(args==4)
			e=new Employee(190,121,90,86);
		else if(args==2)
			e=new Employee(128,50);
		else if(args==1)
			e=new Employee(110);
		else
			e=new Employee();
		return null;
	}

}
