package durga.java8feature;

import java.util.function.IntFunction;

public class IntFunctionDemo1 {

	public static void main(String[] args) {

     IntFunction<Integer> funSquare = i -> i*i ;
     
     System.out.println(funSquare.apply(7));
     
     System.out.println(funSquare.apply(4));

	}

}
