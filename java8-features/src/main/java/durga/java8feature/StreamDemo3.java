package durga.java8feature;

import java.util.ArrayList;

public class StreamDemo3 {

	public static void main(String[] args) {
		ArrayList<Integer>  list = new ArrayList<Integer>();
		list.add(10);list.add(4);list.add(14);list.add(13);
		list.add(7);list.add(3);list.add(20);list.add(5);
		System.out.println("List "+list);
		
		// toArray 
		
		Integer[] arr =list.stream().toArray(Integer[]::new);
		
		System.out.println("to array list");
		for (Integer  i : arr) {
			System.out.print(i+" ");
		}

	}

}
