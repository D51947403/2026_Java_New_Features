package durga.java8feature;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {

		UnaryOperator<Integer> f = i -> i * i;
		System.out.println(f.apply(15));
	}

}
