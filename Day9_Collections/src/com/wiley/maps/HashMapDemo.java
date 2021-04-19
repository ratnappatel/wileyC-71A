package com.wiley.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * create an application to display no of character and their occurences in given string.
 */
public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String,Integer> dic=new HashMap<String,Integer>();
		
		dic.put("Suma", 123748);
		dic.put("Pooja",16385);
		dic.put("Anila", 6454747);
		
		System.out.println(dic);
		
		
		Set<Map.Entry<String,Integer>> entry=dic.entrySet();
		
		Iterator itr=entry.iterator();
		while(itr.hasNext())
		{
			Map.Entry mr=(Map.Entry)itr.next();
			System.out.println(mr.getKey()+"'s Phone no is : "+mr.getValue());
		}
		
		
		System.out.println("======================================================");
		
		
		Set<String> keys=dic.keySet();
		Iterator<String> it=keys.iterator();
		while(it.hasNext())
		{
			String key=it.next();
			System.out.println(dic.get(key)+" is a phone No of "+key);
		}
		
		dic.put("Suma",78787);
		
		System.out.println(dic);
		
		
	}
}
