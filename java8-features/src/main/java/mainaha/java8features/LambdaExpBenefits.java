package mainaha.java8features;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaExpBenefits {

	public static void main(String[] args) {
		// IntegerComparator.sortArry();
		//IntegerComparatorAnonymous.sortArry();
		IntegerComparatorLambda.sortArry();
	}

}

// comparator with separate class 
class IntegerComparator {
	public static void sortArry() {
		Integer[] numbers = { 23, 76, 89, 6, 90, 67 };
		System.out.println(Arrays.toString(numbers));
		Arrays.sort(numbers, new IntCompartor());
		System.out.println("after sort ");
		System.out.println(Arrays.toString(numbers));
	}

}

// sort in ascending order
// drawback : need to create separate java class
class IntCompartor implements Comparator<Integer> {
	@Override
	public int compare(Integer a, Integer b) {
		return a - b; // before if a( new obj )is less
	}
}

// comparator with anonymous class 
class IntegerComparatorAnonymous {
	public static void sortArry() {
		Integer[] numbers = { 23, 76, 89, 6, 90, 67 };
		System.out.println(Arrays.toString(numbers));
		// no need to write separate class file
		// Drawback : Code can not be accessed from outside class
		Arrays.sort(numbers, new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return a - b; // before if a( new obj )is less
			}
		});
		System.out.println("after sort ");
		System.out.println(Arrays.toString(numbers));
	}
}

//comparator with lambda expression 
class IntegerComparatorLambda {
	public static void sortArry() {
		Integer[] numbers = { 23, 76, 89, 6, 90, 67 };
		System.out.println(Arrays.toString(numbers));
		// no need to write separate class file
		// ascending order
		Arrays.sort(numbers,(a, b) -> a-b);
			
		System.out.println("after sort ascending ");
		System.out.println(Arrays.toString(numbers));
		// descending order
		Arrays.sort(numbers,(a, b) -> b-a);
		System.out.println("after sort descending ");
		System.out.println(Arrays.toString(numbers));
	}
}

