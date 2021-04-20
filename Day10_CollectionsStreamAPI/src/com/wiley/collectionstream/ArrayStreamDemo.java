package com.wiley.collectionstream;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class ArrayStreamDemo {

	public static void main(String[] args) {

			Integer []arr= {34,12,67,89,45,91,12,67,89,45}; // named array in memory 
			
			Stream<Integer> stream1=Arrays.stream(arr); // set /list map
			
			Stream<Integer> stream2=Stream.of(23,45,67,89,100); // anonymous array object created by jvm 
			
			//System.out.println("No of elements in arr : "+stream1.count());
			
			//List<Integer> list=stream1.distinct().filter(e->e%2==0).collect(Collectors.toList());
			
			Set<Integer> nos=stream1.collect(Collectors.toSet());
			stream1.filter(i->i%2==0).forEach(System.out::println);
			
			
			System.out.println(nos);
			//forEach(e->System.out.println(e));
			
	}

}
