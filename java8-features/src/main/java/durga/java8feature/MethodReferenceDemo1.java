package durga.java8feature;

public class MethodReferenceDemo1 {

	public static void m2() {
		System.out.println("method reference m2");
	}
	
	public  void nonStatic() {
		System.out.println("method reference nonStatic");
	}
	
	public static void main(String[] args) {
		 // m1 and m2 argument must be same
		// static method reference
		InterfaceDemo1  f= MethodReferenceDemo1 :: m2 ;
		
		f.m1();
		MethodReferenceDemo1   obj= new MethodReferenceDemo1();
		// non static method reference
		InterfaceDemo2 f2= obj::nonStatic ;
		   f2.m2();
		   
		   InterfaceDemo2 f3= new MethodReferenceDemo1()::nonStatic ;
		   
		   f3.m2();
	}

}

@FunctionalInterface
interface  InterfaceDemo1{
	public void m1();
}

@FunctionalInterface
interface  InterfaceDemo2{
	public void m2();
}