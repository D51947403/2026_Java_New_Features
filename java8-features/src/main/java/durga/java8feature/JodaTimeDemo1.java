package durga.java8feature;

import java.time.LocalDate;
import java.time.LocalTime;

public class JodaTimeDemo1 {

	public static void main(String[] args) {

		LocalDate currentDate = LocalDate.now();// Date Object
		System.out.println("currentDate : " + currentDate);
		System.out.println("Day : " + currentDate.getDayOfMonth());
		System.out.println("month : " + currentDate.getMonthValue());
		System.out.println("year : " + currentDate.getYear());
		LocalTime currentTime = LocalTime.now(); // Time Object
		System.out.println("currentTiem : " + currentTime);
		System.out.println("hour : " + currentTime.getHour());
		System.out.println("minute : " + currentTime.getMinute());
		System.out.println("seconds : " + currentTime.getSecond());
		System.out.println("nono seconds : " + currentTime.getNano());
	}

}
