package com.wiley.dbConnect;

public class Employee {

		private int id;
		private String fname;
		private String lname;
		private double salary;
		private int deptId;
		public Employee(int id, String fname, String lname, double salary, int deptId) {
			super();
			this.id = id;
			this.fname = fname;
			this.lname = lname;
			this.salary = salary;
			this.deptId = deptId;
		}
		
		
		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getFname() {
			return fname;
		}


		public void setFname(String fname) {
			this.fname = fname;
		}


		public String getLname() {
			return lname;
		}


		public void setLname(String lname) {
			this.lname = lname;
		}


		public double getSalary() {
			return salary;
		}


		public void setSalary(double salary) {
			this.salary = salary;
		}


		public int getDeptId() {
			return deptId;
		}


		public void setDeptId(int deptId) {
			this.deptId = deptId;
		}


		@Override
		public String toString() {
			return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", salary=" + salary + ", deptId="
					+ deptId + "]\n";
		}
		
		
}
