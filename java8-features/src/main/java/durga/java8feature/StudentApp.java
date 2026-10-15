package durga.java8feature;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

       Predicate<Student> studnetPre = student -> student.marks >=60;
       //  (Input , Output)
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
		
		Consumer <Student>  studentCon = student ->{
			System.out.println("Name "+student.name);
			System.out.println("Marks "+student.marks);
			System.out.println("Grade "+gradeFun.apply(student));
			System.out.println("**********");
		};
		
		// displaying information for student having >= 60 marks
		for(Student  student : Student.getStudentList()) {
			if(studnetPre.test(student)) {
				studentCon.accept(student);
			}
		}
	}

}
