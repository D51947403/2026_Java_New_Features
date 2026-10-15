package durga.java8feature;

import java.util.stream.Stream;

public class StreamDemo4 {

	public static void main(String[] args) {
		Stream<Integer>   str = Stream.of(9,99,999,9999,99999,9999999);
		
		str.forEach(System.out::println);
		
		System.out.println("======");
		
		Double [] doubleArray = {10.32, 14.47, 47.74,58.41,69.47,48.00,42.00};
		
		Stream   strDouble = Stream.of(doubleArray);
		
		strDouble.forEach(System.out::println);
	}

}
