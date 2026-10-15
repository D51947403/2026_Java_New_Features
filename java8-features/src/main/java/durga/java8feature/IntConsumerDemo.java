package durga.java8feature;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
// Advantage : No autoboxing and UnAutoboxing required there for 
// Performance is better
public class IntConsumerDemo {

	public static void main(String[] args) {

		IntConsumer intconsumer = i -> System.out.println("Square is  " + i * i);
		intconsumer.accept(7);
		
		DoubleConsumer   dobConsumer =i -> System.out.println("Square is  " + i*10.33);
		dobConsumer.accept(6);
		
		LongConsumer   longConsumer = l -> System.out.println("Square is  " + l*16);
		longConsumer.accept(6478);
		      

	}

}
