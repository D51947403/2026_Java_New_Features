package mainaha.java8features;

interface MyFunInterface1{
	
	public int addMethod(int a ,int b);
	
	default void helloTest() {
		System.out.println("helloTest");
	}
	
	default void helloTest2() {
		System.out.println("helloTest2");
	}
	
	public static void say() {
		System.out.println("say");
	}
	
	public static void say2() {
		System.out.println("say2");
	}
	
}

interface MyFunInterface2{
	
	public int substractNum (int a , int b);
	
}

public class FunInterfaceEx3 {

	public static void main(String[] args) {

		
		/**
		 * Lambda function 
		 * No name i.e. anonymous function
		 * No modifier
		 * No return type
		 * 
		 */
		
		MyFunInterface1   funRef= (a ,b) -> a+b;
		
		// Calling normal abstract method of functional interface
		System.out.println("Sum is "+funRef.addMethod(7, 8) );
		
		// Calling default method  of functional interface
		funRef.helloTest();
		
		funRef.helloTest2();
		// Calling static method  of functional interface
		MyFunInterface1.say();
		MyFunInterface1.say2();
		
		// Second functional inter face 
		MyFunInterface2   refObj2=(a , b) -> a-b ;
		
		int result = refObj2.substractNum(10, 7);
		System.out.println("result "+result);

	}

}
