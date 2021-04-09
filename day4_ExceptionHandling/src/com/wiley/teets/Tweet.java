package com.wiley.teets;

public class Tweet {
	private int id;
	private String conent;
	public Tweet() {}
	public Tweet(int id, String conent) {
		super();
		this.id = id;
		this.conent = conent;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getConent() {
		return conent;
	}
	public void setConent(String conent) {
		this.conent = conent;
	}
	@Override
	public String toString() {
		return "Tweet [id=" + id + ", conent=" + conent + "]";
	}
	

}
