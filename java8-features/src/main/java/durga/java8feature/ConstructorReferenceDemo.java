package durga.java8feature;

public class ConstructorReferenceDemo {

	public static void main(String[] args) {
		 // syntax for constructor reference
		InterFaceDemo  i = Sample :: new ;
		i.get();
	}
}

class Sample {
	Sample() {
		System.out.println("Sample constructor");
	}
}

@FunctionalInterface
interface InterFaceDemo {
	public Sample get();
}