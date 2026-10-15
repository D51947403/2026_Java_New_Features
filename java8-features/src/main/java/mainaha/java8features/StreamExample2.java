package mainaha.java8features;

import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {

      Stream.iterate(1 , count -> count+1)
      .filter(number -> number%3 ==0).limit(6)
      .forEach(System.out::println);
      
      System.out.println("----------------");
      /*******************/
      Stream.iterate(30 , count -> count+3)
      .filter(number -> number%3 ==0).limit(6)
      .forEach(System.out::println);
    

	}

}
