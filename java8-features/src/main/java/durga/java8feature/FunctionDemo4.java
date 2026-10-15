package durga.java8feature;

import java.util.function.Function;

public class FunctionDemo4 {

	public static void main(String[] args) {
		
		// static method identity returns input itself
		Function<String , String> f= Function.identity();
		System.out.println(f.apply("Devendra"));
		

		
		

	}

}
