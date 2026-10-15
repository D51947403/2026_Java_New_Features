package mainaha.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamConcatExample {

	public static void main(String[] args) {
          //List1
		List<String> addressList =  Arrays.asList("Satna" ,"Jabalpur" ,"Rewa");
		// List2 
		List<String> nameList=Arrays.asList("Devendra" , "Abhishek" ,"Mithlesh");
		
		//creating two streams from the two lists and concatenating them into one
		  Stream <String> opStream =Stream.concat(addressList.stream() , nameList.stream());
		//displaying the elements of the concatenated stream
		
		  opStream.forEach(str -> System.out.print(str+" "));
		  
		  System.out.println("\n");
		  
		//creating two streams from the two lists and concatenating them into one
		  Stream <String> opStream2 =Stream.concat( nameList.stream() , addressList.stream());
		  
		  opStream2.forEach(str -> System.out.print(str+" "));
	}

}
