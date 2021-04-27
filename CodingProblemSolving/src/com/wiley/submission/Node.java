package com.wiley.submission;

public class Node {
	private int data;
	Node next;	
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	

@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

	
	public Node(int data){
		this.data = data;
		this.next =null;
	}
	
}
