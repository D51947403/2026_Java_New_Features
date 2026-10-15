package durga.java8feature;

import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String[] args) {

		Predicate<String> p = Predicate.isEqual("DURGASOFT");
		System.out.println(p.test("DURGA"));// false
		System.out.println(p.test("DEVENDRA"));// false
		System.out.println(p.test("DURGASOFT"));// true
		
		Employee2 e1 = new Employee2("Devendra", "CEO", 80000, "Maihar");
		Employee2 e2 = new Employee2("Devendra", "CEO", 80000, "Maihar");
		
		Predicate<Employee2> p1 = Predicate.isEqual( e1 );
		System.out.println(p1.test(e2));// false
		System.out.println(p1.test(e1));// true checked object element not as per value
	}

}
