package com.wiley.test1.canvasEvent;

public class Event {
	
	private String name, detail,type , organiser ;
	private int attendeesCount;
	private double projected_expense;
	public Event() {
		// TODO Auto-generated constructor stub
	}
	public Event(String name, String detail, String type, String organiser, int attendeesCount,
			double projected_expense) {
		super();
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.organiser = organiser;
		this.attendeesCount = attendeesCount;
		this.projected_expense = projected_expense;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOrganiser() {
		return organiser;
	}
	public void setOrganiser(String organiser) {
		this.organiser = organiser;
	}
	public int getAttendeesCount() {
		return attendeesCount;
	}
	public void setAttendeesCount(int attendeesCount) {
		this.attendeesCount = attendeesCount;
	}
	public double getProjected_expense() {
		return projected_expense;
	}
	public void setProjected_expense(double projected_expense) {
		this.projected_expense = projected_expense;
	}
	@Override
	public String toString() {
		return "Event [name=" + name + "\n detail=" + detail + "\n type=" + type + "\n organiser=" + organiser
				+ "\n attendeesCount=" + attendeesCount + "\n projected_expense=" + projected_expense + "]";
	}
	

}
