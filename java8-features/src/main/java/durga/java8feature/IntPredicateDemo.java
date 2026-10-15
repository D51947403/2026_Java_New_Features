package durga.java8feature;

import java.util.function.IntPredicate;

public class IntPredicateDemo {

	public static void main(String[] args) {

      int[] x= {10,14,15,20,25, 30};
      
      IntPredicate  p = i -> i%2 ==0;
      
      for(int k : x) {
    	 if(p.test(k))
    	System.out.println("k "+k);
      }
      

	}

}
