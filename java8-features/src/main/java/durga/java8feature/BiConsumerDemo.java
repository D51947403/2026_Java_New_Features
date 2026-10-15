package durga.java8feature;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		// Consumer for concatenation Operation
		BiConsumer<String, String> conConsumer = (str1, str2) -> System.out.println(str1.concat(str2));

		conConsumer.accept("Devendra", "Singraul");

		conConsumer.accept("Bharat", "India");

		conConsumer.accept("Well", "Pound");
	}

}
