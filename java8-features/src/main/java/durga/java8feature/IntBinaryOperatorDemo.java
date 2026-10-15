package durga.java8feature;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorDemo {
	
	public static void main(String args[]) {
		IntBinaryOperator f = (i1, i2) -> i1 + i2;
		
		System.out.println(f.applyAsInt(14, 20));
		
	}
	
	
}
