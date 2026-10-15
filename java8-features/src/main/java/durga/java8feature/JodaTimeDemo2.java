package durga.java8feature;

import java.time.LocalDateTime;

public class JodaTimeDemo2 {

	public static void main(String[] args) {

		LocalDateTime dt = LocalDateTime.now();

		System.out.println("currentDateTime " + dt);
		
		System.out.println(" Day " + dt.getDayOfMonth());
		System.out.println(" Month " + dt.getMonthValue());
		System.out.println(" year " + dt.getDayOfYear());
		
		System.out.println(" nano " + dt.getNano());
		System.out.println(" second " + dt.getSecond());
		System.out.println(" minute " + dt.getMinute());
		System.out.println(" hour " + dt.getHour());
	}

}
