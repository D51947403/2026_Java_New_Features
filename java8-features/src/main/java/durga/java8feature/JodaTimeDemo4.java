package durga.java8feature;

import java.time.LocalDate;
import java.time.Period;

public class JodaTimeDemo4 {

	public static void main(String[] args) {
	LocalDate birthDay = LocalDate.of(1990, 07, 20);
	
	LocalDate today = LocalDate.now();
	
	LocalDate deathDay = LocalDate.of(1990+60 ,7 ,20);
	
	Period   myAge =Period.between(birthDay, today);
	
	System.out.printf("My age is :  %d years , %d months , %d days" ,myAge.getYears() ,
			myAge.getMonths() , myAge.getDays());
	System.out.println();
	
	Period   remainingAge =Period.between(today, deathDay);
	
	System.out.printf("My remaining Age is :  %d years , %d months , %d days" ,remainingAge.getYears() ,
			remainingAge.getMonths() , remainingAge.getDays());
	System.out.println();
	
	int remainingDays = remainingAge.getYears()*365 +remainingAge.getMonths()*30+remainingAge.getDays();
	System.out.println("remainingDays : "+remainingDays);

	}

}
