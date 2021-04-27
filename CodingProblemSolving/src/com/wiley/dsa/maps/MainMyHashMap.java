package com.wiley.dsa.maps;

public class MainMyHashMap {

	public static void main(String[] args) {

		MyHashMap map=new MyHashMap(7);
		map.insertHash(34);
		map.insertHash(18);
		map.insertHash(63);
		map.insertHash(41);
		
		map.display();
	}

}
