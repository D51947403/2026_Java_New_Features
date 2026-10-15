package durga.java8feature;

import java.util.function.Function;

public class FunctionChaining2 {

	public static void main(String[] args) {

		Function<String, String> f1 = str -> str.toUpperCase();

		Function<String, String> f2 = str -> str.substring(0, 9);

		String name = "AishwaryaAbhi";

		System.out.println("1: " + f1.apply(name));

		System.out.println("2: " + f2.apply(name));
		// f1 and then f1
		System.out.println("3: " + f1.andThen(f2).apply(name));
		// f2 then f1
		System.out.println("4: " + f1.compose(f2).apply(name));
	}

}
