package durga.java8feature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithLambda {

	public static void main(String[] args) {

		EmpTest e1 = new EmpTest(1, "aTestName", "dLastName", 34 ,1000);
		EmpTest e2 = new EmpTest(2, "nTestName", "pLastName", 30 ,2000 );
		EmpTest e3 = new EmpTest(3, "kTestName", "sLastName", 31 ,3546);
		EmpTest e4 = new EmpTest(4, "dTestName", "zLastName", 28 ,6578);
		EmpTest e5 = new EmpTest(5, "dTestName", "zLastName", 23 ,6578);
		EmpTest e6 = new EmpTest(6, "dTestName", "zLastName", 26 ,6578);
		EmpTest e7 = new EmpTest(7, "kTestName", "zLastName", 40 ,6578);
		EmpTest e8 = new EmpTest(8, "kTestName", "zLastName", 27 ,6578);
		
	        List<EmpTest> empList = new ArrayList<EmpTest>();
	        empList.add(e2);
	        empList.add(e3);
	        empList.add(e1);
	        empList.add(e4);
	        empList.add(e5);
	        empList.add(e6);
	        empList.add(e7);
	        empList.add(e8);
	        
	        System.out.println("1 "+empList);
	        
	    //    sortUsingLambda( empList);
	      //Sorting on multiple fields; Group by.
	        Comparator<EmpTest> groupByComparator = Comparator.comparing(EmpTest::getFirstName)
	        		.thenComparing(EmpTest::getAge);
	        empList.sort(groupByComparator);
	     System.out.println("4"+empList);
	}
	
	private static void sortUsingLambda(List<EmpTest> empList){
		 //Sort all employees by first name
        empList.sort(Comparator.comparing(e -> e.getFirstName()));
        //or 
      //OR you can use below
        empList.sort(Comparator.comparing(EmpTest::getFirstName));
        System.out.println("2 "+empList);
        
      //Sort all employees by first name in reverse order
        Comparator<EmpTest> comparator = Comparator.comparing(e -> e.getFirstName());
        empList.sort(comparator.reversed());
        
        System.out.println("3 "+empList);
	}

}

class EmpTest {
	
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private float salary;

	public EmpTest(int id, String firstName, String lastName, int age, float salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public float getSalary() {
		return salary;
	}



	public void setSalary(float salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "EmpTest [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", salary=" + salary + "]";
	}

}