package mainaha.java8features;

import java.util.ArrayList;

public class LambdaExpTes1 {

	public static void main(String[] args) {
		 // lambda expression to implement above 
        // functional interface. This interface 
        // by default implements abstractFun() 
        FuncInterface fobj = (int x)->System.out.println(2*x); 
  
        // This calls above lambda expression and prints 10. 
        fobj.abstractFun(5); 
        System.out.println("------------");
        printVal();
        System.out.println("------------");
        
        fobj.normalFun();
        

	}
	
	 public static void printVal () 
	    { 
	        // Creating an ArrayList with elements 
	        // {1, 2, 3, 4} 
	        ArrayList<Integer> arrL = new ArrayList<Integer>(); 
	        arrL.add(1); 
	        arrL.add(2); 
	        arrL.add(3); 
	        arrL.add(4); 
	  
	        // Using lambda expression to print all elements 
	        // of arrL 
	        arrL.forEach(n -> System.out.println(n)); 
	  
	        // Using lambda expression to print even elements 
	        // of arrL 
	        arrL.forEach(n -> { if (n%2 == 0) System.out.println(n); }); 
	    } 

}
