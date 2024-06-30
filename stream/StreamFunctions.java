package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = Arrays.asList(1,12,-4,-15,-6);
		
		//Retrieve the stream
		Stream<Integer> stream = intList.stream();
		

		
		//Filtered stream of positive numbers
		//stream = stream.filter((a) -> a > 0);
		stream.forEach(System.out::println);
	
		stream = intList.stream().filter((a) -> a > 0);
		
		
		//Reduce to maximum numbers
		Optional<Integer> result = stream.reduce((a,b) -> a>b ? a:b);
		
		if(result.isPresent())
			System.out.println("Maximum number is "+ result.get());
		else
			System.out.println("System is empty for given operation");
		
		//Filterate the even numbers
		stream = intList.stream().filter((a) -> a % 2 == 0);
		
		//Reduce to sum of even numbers
		if(result.isPresent())
			result = stream.reduce((a,b) -> a+b);
			System.out.println("Sum of all even Numbers : "+ result.get());
		//else
			System.out.println("Stream is empty for given operation");
	}

}
