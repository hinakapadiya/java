package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> stream = Stream.of(10,20,30,40,50);
		System.out.println(stream.count());
		//stream.forEach(System.out::println);
		
		//creating array
		Integer[] values = new Integer[] {10,20,30,13,10};
		//Creating the stream from array
		stream = Arrays.stream(values);
		
		//map
		System.out.println("Square of "+Arrays.toString(values)+" is as follows: ");
		
		
		//First method
		//stream.map(num -> num* num).forEach(System.out::println);
		
		//Second Method
		stream = stream.map(n->n*n);
		stream.forEach(System.out::println);
		
		//limit
		System.out.println("first 2 elements are : ");
		Arrays.stream(values).limit(2).forEach(System.out::println);
		
		//skip
		System.out.println("Elements excepts first 4 : ");
		Arrays.stream(values).skip(4).forEach(System.out::println);
		
		//distinct
		System.out.println("Unique values are : ");
		Arrays.stream(values).distinct().forEach(System.out::println);
		
		//immutable list
		List<String> words = Arrays.asList("Hello","Anjali","Zala");
		
		//UpperCase
		
		//LOwerCase
		
		//collect --> Collectors --> Applicable in list and set
		
		Stream<String> stream1 = words.stream();
		System.out.println(words);
		
	
	}
}