package durga.java8feature;

import java.util.function.LongPredicate;

public class LongPredicateDemo {

	public static void main(String[] args) {

      int[] x= {10,14,15,20,25,30,40 ,55 ,11 ,23 ,17};
      
      LongPredicate  p = i -> i%2 ==0;
      
      for(int k : x) {
    	 if(p.test(k))
    	System.out.println("k "+k);
      }
      

	}

}
