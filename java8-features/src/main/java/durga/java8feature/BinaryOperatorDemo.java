package durga.java8feature;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
	
	public static void main (String args[]) {
		BinaryOperator<String> f= (s1, s2)-> s1+s2 ;
	}

}