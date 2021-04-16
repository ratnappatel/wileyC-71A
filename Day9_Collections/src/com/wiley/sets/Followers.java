package com.wiley.sets;

public class Followers implements Comparable<Followers>
{

	private int id;
	private String name;
	private String hobby;
	public Followers(int id, String name, String hobby) {
		super();
		this.id = id;
		this.name = name;
		this.hobby = hobby;
	}
	
	
	  public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHobby() {
		return hobby;
	}


	public void setHobby(String hobby) {
		this.hobby = hobby;
	}


	@Override public String toString() { return "Followers [id=" + id + ", name="
	  + name + ", hobby=" + hobby + "]\n"; }

	@Override
	public int hashCode() {
		final int prime = 31;
		return id*prime;
	}

	@Override
	public boolean equals(Object obj) {
		
		Followers f=(Followers)obj;
		boolean flag=false;
		if(this.id==f.getId() )
			if(this.name.equals(f.getName()))
				if(this.hobby.equals(f.getHobby()))
					flag=true;
				else
					flag=false;
		return flag;
	}


	@Override
	public int compareTo(Followers o) {
		return this.id-o.getId();
	}
	 
	
	

}
