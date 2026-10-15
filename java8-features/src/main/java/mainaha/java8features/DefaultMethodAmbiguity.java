package mainaha.java8features;


 interface Left {
	default void m1() {
		System.out.println("Left M1");
		System.out.println("Left 11");
	}
}
 
 
 interface Right {
	default void m1() {
		System.out.println("Right M1");
		System.out.println("Right 11");
	}
}


public class DefaultMethodAmbiguity implements Left , Right {
	
	/**Which one should be called 
	 * To avoid ambiguity override method m1
	 * @param args
	 */
	
	// 1st way
	/*
	 * @Override public void m1() { System.out.println("My own implementation"); }
	 */
	
	// 2nd way
	@Override
	public void m1() {
		System.out.println("My own implementation");
     Left.super.m1();
     Right.super.m1();
	}

	public static void main(String[] args) {
		
		DefaultMethodAmbiguity  obj = new DefaultMethodAmbiguity();
		
		obj.m1();
	}

}
