package mainaha.java8features;

import java.util.function.BiFunction;

public class MethodRefExample implements MyInterface1 {

	  public void myMethod(){  
			System.out.println("Instance Method");  
		    }  
	  @Override
	  public void display() {
		  System.out.println("display method");
		  
	  }
	public static void main(String[] args) {
		MethodRefExample obj = new MethodRefExample();
		// Method reference using the object of the class
		
		MyInterface1 ref = obj::myMethod;  
		// Calling the method of functional interface  
				ref.display();  
				
				//Using lambda function
		MyInterface1 ref2= () -> System.out.println("Hello instance");
		
		ref2.display();
		
		
		MyInterface1 ref3 = obj::display;  
		
		ref3.display();
		
		ref.normalFun();
		
		ref2.normalFun();
		
		ref3.normalFun();
		
		/*********Static method reference*******/
		BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;  
		
		int pr = product.apply(11, 5);
		System.out.println("Product of given number is: "+pr);  
		
		/*********constructor  reference*******/
		
		MyInterfaceTest conref= Hello ::new ;
		
		conref.displayTest("Hello Test");
		
	}

}

class Multiplication{  
	   public static int multiply(int a, int b){  
		return a*b;  
	   }  
	}  


@FunctionalInterface 
interface MyInterfaceTest{  
    Hello displayTest(String say);  
} 

class Hello{  
    public Hello(String say){  
        System.out.print(say);  
    } 
}
