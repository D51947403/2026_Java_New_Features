package mainaha.java8features;

import java.util.function.Predicate;

public class PredicateInterfaceDemo {

	public static void main(String[] args) {
		predicateChaining(); 
	}

	public static void predicateDemo() {
		// Creating predicate
		Predicate<Integer> lesserthan = i -> (i < 18);

		// Calling Predicate method
		// test() abstract method is inside Predicate interface
		System.out.println("============");
		System.out.println(lesserthan.test(10));

		Predicate<Float> divisibleByNum = (n) -> 0 == ((float) 36 / n);

		System.out.println(divisibleByNum.test((float) 4));

	}

	public static void predicateChaining() {
		Predicate<Integer> greaterThanTen = (i) -> i > 10;

		// Creating predicate
		Predicate<Integer> lowerThanTwenty = (i) -> i < 20;
		boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
		System.out.println(result);

		// Calling Predicate method
		boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
		System.out.println(result2);
	}

}
