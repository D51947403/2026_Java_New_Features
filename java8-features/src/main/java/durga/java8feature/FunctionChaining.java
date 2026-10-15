package durga.java8feature;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {

		Function<Integer, Integer> f1 = i -> i+i;

		Function<Integer, Integer> f2 = i -> i*i*i;
		
		int name = 2;
		
		System.out.println("1: "+f1.apply(name));
		
		System.out.println("2: "+f2.apply(name));
		// f1 and then f1
		System.out.println("3: "+f1.andThen(f2).apply(name));
		// f2 then f1
		System.out.println("4: "+f1.compose(f2).apply(name));
	}

}
