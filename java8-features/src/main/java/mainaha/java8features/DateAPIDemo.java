package mainaha.java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateAPIDemo {

	public static void main(String[] args) {
		
		LocalDateTimeApi();
		
	}
	
	public static void LocalDateTimeApi() {
		// this is immutable class ........no new key word is there
		// date format : yyyy-mm-dd ...iso pattern
		  LocalDate date = LocalDate.now(); 
		  System.out.println("the current date is "+ date);  
		  
		// the current time 
		    LocalTime time = LocalTime.now(); 
		    System.out.println("the current time is "+  time); 
		  
		 // will give us the current time and date 
		LocalDateTime  current = LocalDateTime.now();    
		System.out.println("the current date time is "+  current); 
		
		 // to print in a particular format 
	    DateTimeFormatter format =  
	      DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");   
	    
	    String formatedDateTime = current.format(format);   
	     
	    System.out.println("in foramatted manner "+ formatedDateTime); 
	   
	    // printing months days and seconds 
	    Month month = current.getMonth(); 
	    int day = current.getDayOfMonth(); 
	    int seconds = current.getSecond(); 
	    System.out.println("Month : "+month+" day : "+   day+" seconds : "+seconds);
	    
	    // printing some specified date 
	    LocalDate date2 = LocalDate.of(1950,1,26); 
	    System.out.println("the repulic day :"+date2); 
	    
	 // printing date with current time. 
	    //Returns a copy of this LocalDateTime with the day-of-month altered. 
	    LocalDateTime specificDate1 = current.withDayOfMonth(24); 
	    System.out.println("specfic date 1 with current time : "+specificDate1);
	    LocalDateTime specificDate2 = current.withYear(2016); 
	    System.out.println("specfic date 2 with current time : "+specificDate2);
	    LocalDateTime specificDate3 = current.withYear(2017).withDayOfMonth(5) ;
	    System.out.println("specfic date 3 with current time : "+specificDate3);
		    
	}

}
