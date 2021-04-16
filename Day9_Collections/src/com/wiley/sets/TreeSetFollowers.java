package com.wiley.sets;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetFollowers {

	public static void main(String[] args) {
		
		FollowersComparatorByHobby hobby=new FollowersComparatorByHobby();
		TreeSet<Followers> tset=new TreeSet<Followers>(hobby);
		//natural data type without overriding its comparison methods
		
		tset.add(new Followers(23,"Abdul","Music"));
		tset.add(new Followers(45,"Iliyaz","Dance"));
		tset.add(new Followers(87,"Vaibhav","Yoga"));
		tset.add(new Followers(23,"Abdul","Music"));
		tset.add(new Followers(36,"Manoj","Music"));
		tset.add(new Followers(26,"Nimisha","Dance"));
		tset.add(new Followers(91,"Ruchira","Yoga"));
		
		System.out.println("Followers by Hobby ");
		System.out.println(tset);
	}
}
// only prefer properties which are unique in nature can be used as sorting logic
class FollowersComparatorByHobby implements Comparator<Followers>
{
	@Override
	public int compare(Followers arg0, Followers arg1) {
		
		//return arg0.getName().compareTo(arg1.getName());
		//return arg0.getId()-arg1.getId();
		int r=0;
		if(arg0.getHobby().equals(arg1.getHobby()))
		{
			r=arg0.getHobby().compareTo(arg1.getHobby());
			if(r==0)
				r=-1;
		}
			
		return r;
	}
	
}