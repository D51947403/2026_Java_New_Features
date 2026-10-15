package durga.java8feature;

import java.util.ArrayList;
import java.util.List;

public class Student {
	String name;
	int marks;
	int rollNo ;

	Student(String n, int m) {
		this.name = n;
		this.marks = m;
	}
	Student ( int rollNo , String name ){
		this.name = name ;
		this.rollNo = rollNo;
	}
	

	public static List<Student> getStudentList() {

		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Devendra", 82));
		studentList.add(new Student("Madhuri", 63));
		studentList.add(new Student("Arun", 67));
		studentList.add(new Student("Ankit", 61));
		studentList.add(new Student("Ravan", 55));
		studentList.add(new Student("Ajneesh", 38));
		studentList.add(new Student("Kausal", 11));

		return studentList;
	}
}
