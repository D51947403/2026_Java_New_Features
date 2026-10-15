package durga.java8feature;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorDemo {

	public static void main(String[] args) {

		IntUnaryOperator f= i-> i*i;
		
		System.out.println(f.applyAsInt(14));
		
		System.out.println(f.applyAsInt(7));

	}

}
