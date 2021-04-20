package com.wiley.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SimplePredicateDemo {

	public static void main(String[] args) {

			List<Integer> list=Arrays.asList(80,45,46,78,91,39,27,40,51,62,78);
			
			Predicate<Integer> isEven= i-> i%2==0;
			Predicate<Integer> isFac5 = i-> i%5 ==0;
			
			list.stream().filter(isEven).forEach(System.out::println);
	}

}
