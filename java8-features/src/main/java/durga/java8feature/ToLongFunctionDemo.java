package durga.java8feature;

import java.util.function.ToLongFunction;

public class ToLongFunctionDemo {

	public static void main(String[] args) {

         ToLongFunction <Integer>  f = i -> i*8 ;
         
         System.out.println(f.applyAsLong(14));
         
         System.out.println(f.applyAsLong(56));
         
        
	}

}
