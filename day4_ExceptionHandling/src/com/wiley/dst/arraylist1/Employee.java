package com.wiley.dst.arraylist1;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	public Employee() {}
	public Employee(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	@Override
	public int hashCode()
	{
		// generating dummy hashcode
		int hashcode=this.id+13;
		
		return hashcode; // for me both object are same
	}
	@Override
	public boolean equals(Object obj)
	{
		Employee e=(Employee)obj;
		if(this.id==e.getId())
			if(this.firstName.equals(e.getFirstName()))
				if(this.lastName.equals(e.getLastName()))
					return true;
		return false;
	}
	

}
