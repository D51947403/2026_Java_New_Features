package durga.java8feature;

import java.util.ArrayList;
import java.util.function.Function;

public class FunctionDemo2 {

	public static void main(String[] args) {

		Function<Student, String> gradeFun = student -> {
			int marks = student.marks;
			
			if (marks >= 80) {
				return "Distinction";

			} else if (marks >= 60) {
				return "First";
			} else if (marks >= 50) {
				return "Second";
			} else if (marks >= 35) {
				return "Third";
			} else {
				return "Failed";
			}

		};

		
		ArrayList <Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student("Devendra" ,82 ));
		studentList.add(new Student("Madhuri" , 63 ));
		studentList.add(new Student("Ravan" ,55 ));
		studentList.add(new Student("Ajneesh" ,38 ));
		studentList.add(new Student("Kausal" ,11 ));
		
		for (Student std:studentList ) {
			System.out.println(gradeFun.apply(std));
		}
		
		
	}

}
