package com.wiley.returnType;

public class Employee 
{
	private int eid;
	private int managerId;
	private int departmentId;
	private int projectId;
	
	public Employee() 
	{
		//temp-id generated specified duration
	}
	public Employee(int eid) 
	{this.eid=eid;}
	
	public Employee(int managerId,int departmentId) 
	{
		this.managerId=managerId;
		this.departmentId=departmentId;
	}
	
	public Employee(int eid, int managerId, int departmentId, int projectId) {
		super();
		this.eid = eid;
		this.managerId = managerId;
		this.departmentId = departmentId;
		this.projectId = projectId;
	}
	
}
