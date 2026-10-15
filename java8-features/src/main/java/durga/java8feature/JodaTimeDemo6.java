package durga.java8feature;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JodaTimeDemo6 {

	public static void main(String[] args) {
		ZoneId  zone = ZoneId.systemDefault();
		System.out.println("zone : "+zone);
		
	//	ZoneId la = ZoneId.of("Asia/Calcutta");
		ZonedDateTime   ztIndia = ZonedDateTime.now(zone);
		System.out.println(ztIndia);
		
		ZoneId la = ZoneId.of("America/Los_Angeles");
		
		ZonedDateTime   ztAmerica = ZonedDateTime.now(la);
		
		System.out.println(ztAmerica);

	}

}
