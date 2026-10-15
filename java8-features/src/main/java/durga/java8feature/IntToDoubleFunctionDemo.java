package durga.java8feature;

import java.util.function.IntToDoubleFunction;

public class IntToDoubleFunctionDemo {

	public static void main(String[] args) {

          IntToDoubleFunction  f = i -> Math.sqrt(i);
          
          System.out.println(f.applyAsDouble(5));
          
          System.out.println(f.applyAsDouble(7));
          
          System.out.println(f.applyAsDouble(8));

	}

}
