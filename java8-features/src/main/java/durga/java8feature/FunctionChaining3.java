package durga.java8feature;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionChaining3 {

	public static void main(String[] args) {
		Function<String, String> f1 = str -> str.substring(0, 8);
		Function<String, String> f2 = str -> str.toLowerCase();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter user name ");
		String user = sc.next();
		System.out.println("Enter password");
		String pass = sc.next();
		// Validating only first 8 character for user name
		if (f1.andThen(f2).apply(user).equals("devendra") && pass.equals("java123")) {
			System.out.println("Hi ! Devendra");
		} else {
			System.out.println("Invalid user.");
		}

	}

}
