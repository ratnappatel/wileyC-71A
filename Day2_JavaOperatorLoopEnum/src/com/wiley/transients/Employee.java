package com.wiley.transients;

import java.io.Serializable;

public class Employee  implements Serializable
{
	
	private int id;
	private String name;
	private double salary;
	private String desc;
	private  String nickName;
	public Employee(int id, String name, double salary, String desc,String nickName) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.desc = desc;
		this.nickName=nickName;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", desc=" + desc + ", nickName="
				+ nickName + "]";
	}
	
}
