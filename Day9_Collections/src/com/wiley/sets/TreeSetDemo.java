package com.wiley.sets;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		// unique + sorted
		TreeSet<Character> tset=new TreeSet<Character>();
		tset.add('G');
		tset.add('R');
		tset.add('P');
		tset.add('Y');
		tset.add('W');
		tset.add('P');
		tset.add('G');
		
		System.out.println(tset);
	}

}
