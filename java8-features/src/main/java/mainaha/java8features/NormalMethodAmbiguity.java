package mainaha.java8features;


interface LeftA {
	public void m1();
	
}
 
 
 interface RightA {
	 public void m1();
}
 
public class NormalMethodAmbiguity implements LeftA , RightA{

	public static void main(String[] args) {
		new NormalMethodAmbiguity().m1();// runs simply implementation logic

	}

	@Override
	public void m1() {
	
		System.out.println("Test child");
	}

}

