package durga.java8feature;

import java.util.function.DoublePredicate;

public class DoublePredicateDemo {

	public static void main(String[] args) {
		 double[] x= {10.0,14.11,15,20.00,25.58,30.00,40.14 ,55.87 ,11.69 ,23.00 ,14.00};
	      
	      DoublePredicate  p = i -> i%2 ==0.0;
	      
	      for(double k : x) {
	    	 if(p.test(k))
	    	System.out.println("k "+k);
	      }
	      

	}

}
