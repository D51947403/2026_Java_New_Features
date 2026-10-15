package durga.java8feature;

import java.util.function.Function;

public class FunctionDemo1 {

	public static void main(String[] args) {
		
		Function<String , Integer> f= str-> str.length();
		
		int len = f.apply("Devendra");
		
		System.out.println("Length "+len);
		
		System.out.println(f.apply("Kumar"));
		
		System.out.println(f.apply("Singraul"));
		
		Function<Integer , Integer> squareOfNum = i -> i*i;
		
		System.out.println("5*5 ="+squareOfNum.apply(5));
		
		System.out.println("20*20 ="+squareOfNum.apply(20));
		
		// Remove Space 
		Function<String , String> removeSpace= str -> str.replaceAll(" ", "");	
		String str ="Durga software solution Pune";
		System.out.println(removeSpace.apply(str));
		
		// Count  space
		Function<String , Integer> spaceCount=s -> s.length() - s.replaceAll(" ", "").length();
		System.out.println("space count "+spaceCount.apply(str));
		
		
		

	}

}
