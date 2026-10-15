package durga.java8feature;

import java.util.ArrayList;

public class Employee {
	String name;
	String designation;
	double salary;
	String city;

	protected Employee(String name, String designation, double salary, String city) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

	protected Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;

	}

	@Override
	public String toString() {
		String s = String.format("( %s,%s,%.3f,%s )", name, designation, salary, city);
		return s;
	}

	public static ArrayList<Employee> getEmployeeList() {
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
		return empList;

	}
}
