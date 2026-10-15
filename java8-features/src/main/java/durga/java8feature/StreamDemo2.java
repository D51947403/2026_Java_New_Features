package durga.java8feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {

	public static void main(String[] args) {
		// How to create stream object ?
		//Stream   stream = CollectionObject.stream();
		List<String> list = new ArrayList <String>();
		list.add("Devendra"); list.add("Kumar");list.add("Singraul");
		list.add("Mainahan"); list.add("Bharahut");list.add("Unchehara");
		list.add("Satna"); list.add("Madhya Pradesh");list.add("Bharat");
		System.out.println("list  "+list);
		// filter 
		List<String>  char8PlusList = list.stream().filter( s -> s.length() >= 8).collect(Collectors.toList());
		System.out.println("char8PlusList "+char8PlusList);
		// map
		List<String>  uppercaseList = list.stream().map( s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println("uppercaseList "+uppercaseList);
		// count 
		long  char8PlusCount = list.stream().filter( s -> s.length() >= 8).count();
		System.out.println("char8PlusCount "+char8PlusCount);
		System.out.println("====");
		// forEach with lambda expression
		list.stream().forEach(s -> System.out.println(s));
		System.out.println("***********");
		// forEach with method reference
		list.stream().forEach(System.out ::println);
	}

}
