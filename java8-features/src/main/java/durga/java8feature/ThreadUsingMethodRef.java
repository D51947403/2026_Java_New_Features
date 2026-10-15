package durga.java8feature;

public class ThreadUsingMethodRef {

	public static void main(String[] args) {
  // run and childMethod argument must be same
		Runnable r = new ThreadUsingMethodRef()::childMethod;
		 
		Thread  t = new Thread (r);
		 t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}

	public void childMethod() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
		}
	}
}
