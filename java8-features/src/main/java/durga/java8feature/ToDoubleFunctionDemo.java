package durga.java8feature;

import java.util.function.ToDoubleFunction;
//Advantage : No autoboxing and UnAutoboxing required there for 
//Performance is better
public class ToDoubleFunctionDemo {

	public static void main(String[] args) {

         ToDoubleFunction <Integer>  f =  n -> n/5;
         
         System.out.println(f.applyAsDouble(253));
         
         System.out.println(f.applyAsDouble(23));
         
      
	}

}
