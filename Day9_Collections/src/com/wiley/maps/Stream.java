package com.wiley.maps;

public class Stream {

	String name;
	int duration;
	public Stream(String name, int duration) {
		super();
		this.name = name;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Stream [name=" + name + ", duration=" + duration + "]\n";
	}
	
}
