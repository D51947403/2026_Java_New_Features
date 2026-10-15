package durga.java8feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortingDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(4);
		list.add(14);
		list.add(13);
		list.add(7);
		list.add(3);
		list.add(20);
		list.add(5);
		System.out.println("List " + list);
		// Default natural sorting order
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println("sortedList : " + sortedList);

		// Reverse sorting order
		List<Integer> reverseSortedList = list.stream().sorted((i1, i2) -> i2.compareTo(i1))
				.collect(Collectors.toList());
		System.out.println("reverseSortedList : " + reverseSortedList);

		// get minimum
		Integer minVal = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("minVal : " + minVal);

		// get maximum
		Integer maxVal = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("maxVal : " + maxVal);
	}

}
