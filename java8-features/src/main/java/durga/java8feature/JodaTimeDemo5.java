package durga.java8feature;

import java.time.Year;
import java.util.Scanner;

public class JodaTimeDemo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year : ");
		int n = sc.nextInt();
		Year year = Year.of(n);
		if(year.isLeap()) {
			
			System.out.println("This is leap year");
		}else {
			System.out.println("This is not leap year");
		}
	}

}
