package mainaha.java8features;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneTimeApiDemo {
	
	// Function to get Zoned Date and Time 
	public static void ZonedTimeAndDate() 
	{ 
	    // to get the current zone 
	    ZonedDateTime currentZone = ZonedDateTime.now();  
	    System.out.println("the current zone is "+ currentZone.getZone());  
	  
	    // getting time zone of specific place 
	    // we use withZoneSameInstant(): it is 
	    // used to return a copy of this date-time  
	    // with a different time-zone,   
	    // retaining the instant. 
	    ZoneId tokyo = ZoneId.of("Asia/Tokyo"); 
	    
	     System.out.println(tokyo);
	     
	    ZonedDateTime tokyoZone = currentZone.withZoneSameInstant(tokyo); 
	                    
	    System.out.println("tokyo time zone is " +  tokyoZone); 
	  
	    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
	      
	    String formatedDateTime = tokyoZone.format(format);  
	  
	    System.out.println("formatted tokyo time zone "+ formatedDateTime); 
	      
	}
	
	
	public static void main(String[] args) {
		ZonedTimeAndDate();
	}

}
