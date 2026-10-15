package durga.java8feature;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateChaining {

	public static void main(String[] args) {

		ArrayList<Employee> empList = new ArrayList<Employee>();
		Employee e1 = new Employee("Devendra", "CEO", 80000, "Maihar");
		Employee e2 = new Employee("Ashok", "BA", 50000, "Maihar");
		Employee e3 = new Employee("Mohan", "Manager", 60000, "Satna");
		Employee e4 = new Employee("Amrit", "Chairman", 70000, "rewa");
		Employee e5 = new Employee("Narayan", "Manager", 30000, "Maihar");
		Employee e6 = new Employee("Rasmi", "Manager", 60000, "Satna");

		empList.add(e1);
		empList.add(e1);
		empList.add(e5);
		empList.add(e2);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e6);

		// System.out.println(empList);

		Predicate<Employee> p1 = emp -> emp.designation.equalsIgnoreCase("Manager");
		display(p1, empList);
		System.out.println("=====1");
		Predicate<Employee> p2 = emp -> emp.city.equalsIgnoreCase("Maihar");
		display(p2, empList);
		System.out.println("=====2");
		Predicate<Employee> p3 = emp -> emp.salary < 55000;
		display(p3, empList);
		System.out.println("=====3");
		Predicate<Employee> p4 = emp -> emp.city.equalsIgnoreCase("Satna");
		display(p4, empList);
		System.out.println("===and==");
		// Predicate chaining or joining 
		// All manager from Maihar
		display(p1.and(p4), empList);
		System.out.println("==or===");
		// Either manager or salary less than 55000
		display(p2.or(p3), empList);
		// Not from Satna 
		System.out.println("==not===");
		display(p4.negate(), empList); 
		// not manager
		System.out.println("==not again===");
		display(p1.negate(), empList); 
	}

	public static void display(Predicate<Employee> p, ArrayList<Employee> list) {
		for (Employee emp : list) {
			if (p.test(emp)) {
				System.out.println(emp);
			}
		}
	}
	

}
