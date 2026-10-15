package mainaha.java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class StringToDate {

	public static void main(String[] args) {
		StringToDateJava8();
	}

	public static void StringToDateJava8() {
		
		String armisticeDate = "2016-04-04";
		LocalDate aLD = LocalDate.parse(armisticeDate);
		System.out.println("Date: " + aLD);

		String armisticeDateTime = "2016-04-04T11:50";

		LocalDateTime aLDT = LocalDateTime.parse(armisticeDateTime);
		System.out.println("Date/Time: " + aLDT);
	}

}
