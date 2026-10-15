package mainaha.java8features;

import java.util.function.IntBinaryOperator;

public class PreDefinedFunInterface {

	public static void main(String[] args) {

      // lambda expression
		IntBinaryOperator  sum = (a , b) -> a+b ;
		
		IntBinaryOperator  sub=(a , b) -> a-b ;
		
		IntBinaryOperator multi = (a, b) -> a*b ;
		
		IntBinaryOperator  div = (a , b) -> a/b;
		
		System.out.println( sum.applyAsInt(14, 15));
		
		System.out.println( sub.applyAsInt(14, 15));
		
		System.out.println( multi.applyAsInt(14, 15));
		
		System.out.println( div.applyAsInt(14, 2));

	}

}
