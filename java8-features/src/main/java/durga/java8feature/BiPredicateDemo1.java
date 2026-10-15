package durga.java8feature;

import java.util.function.BiPredicate;

public class BiPredicateDemo1 {

	public static void main(String[] args) {
       // To check if sum is even or not 
       BiPredicate<Integer , Integer>  p = (a ,b ) -> (a+b)% 2==0 ;
       System.out.println(p.test(20 ,14)); // true
       System.out.println(p.test(21 ,50)); // false
       
	}

}
