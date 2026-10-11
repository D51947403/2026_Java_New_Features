package mainaha.java7.features;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// String 
public class SwitchWithString {

	public static void main(String[] args) {

		// before jdk 7
		Map<String, List<String>> anagram1 = new HashMap<String, List<String>>();

		// Improved Type Inference for Generic Instance Creation after
		Map<String, List<String>> anagrams2 = new HashMap<>();

		System.out.println("sunday");
	}

	public static void getWeekDay(String day) {
		day = day.toUpperCase();
		switch (day) {
		case "SUNDAY":
			System.out.println("Sunday");
			break;
		case "MONDAY":
			System.out.println("Monday");
			break;
		case "TUESDAY":
			System.out.println("Tuesday");
			break;
		case "WEDNESDAY":
			System.out.println("Wednesday");
			break;
		case "THURSDAY":
			System.out.println("Thursday");
			break;
		case "FRIDAY":
			System.out.println("Frieday");
			break;
		case "SATURDAY":
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid Value");
			break;

		}
	}

	// before java 7
	public static void printAll(@SuppressWarnings("unchecked") List<String>... lists) {
		for (List<String> list : lists) {
			System.out.println(list);
		}
	}

	// after jdk7
	@SafeVarargs
	public static void printAll2(List<String>... lists) {
		for (List<String> list : lists) {
			System.out.println(list);
		}
	}
}
