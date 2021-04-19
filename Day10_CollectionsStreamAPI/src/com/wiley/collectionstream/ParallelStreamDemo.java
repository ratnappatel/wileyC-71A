package com.wiley.collectionstream;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("Hi ! ","E","V","E","R","Y","O","N","E");
		
		list.parallelStream().forEach(System.out::print);
	}
	

}
