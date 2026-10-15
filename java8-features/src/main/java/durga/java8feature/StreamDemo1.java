package durga.java8feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {

	public static void main(String[] args) {
		ArrayList<Integer>  list = new ArrayList<Integer>();
		list.add(10);list.add(4);list.add(14);list.add(13);
		list.add(7);list.add(3);list.add(20);list.add(5);
		System.out.println("List "+list);
		// filter example
		List<Integer>  evenList =  list.stream().filter(i->i%2==0).collect(Collectors.toList()); 	
		System.out.println("evenList "+evenList);
		// map example
		List<Integer> productBy2List = list.stream().map(i -> i*2).collect(Collectors.toList());
		System.out.println("productBy2List "+productBy2List);
		// toArray 
		
		Integer[] arr =list.stream().toArray(Integer[]::new);
		
		System.out.println("to array list");
		for (Integer  i : arr) {
			System.out.print(i+" ");
		}
	}

}
