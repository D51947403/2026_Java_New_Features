package durga.java8feature;

import java.time.LocalDateTime;
import java.time.Month;

public class JodaTimeDemo3 {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(1995, Month.MAY, 27, 10, 32);
		System.out.println("dt "+dt);
		System.out.println("After 6 months :  "+dt.plusMonths(6));
		System.out.println("befor 6 months :  "+dt.minusMonths(6));
		
		System.out.println( dt.minusDays(4));
		System.out.println( dt.minusHours(2));
		
		System.out.println( dt.plusWeeks(2));
	}

}
