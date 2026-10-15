package durga.java8feature;

import java.util.function.Consumer;

public class ConsumerDemo1 {

	public static void main(String[] args) {

		Consumer<String> c = str -> System.out.println(str);

		c.accept("devendra");
		c.accept("Mainahan");
	}

}
