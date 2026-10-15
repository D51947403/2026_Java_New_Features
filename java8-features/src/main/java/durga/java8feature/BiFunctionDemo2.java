package durga.java8feature;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunctionDemo2 {

	public static void main(String[] args) {

       BiFunction <Integer,String ,Student>  studentFun =(  rollNo , name ) -> new Student ( rollNo , name );
       
       ArrayList<Student>  studentList = new ArrayList<Student>();
       
       studentList.add(studentFun.apply(101, "Devendra"));
       studentList.add(studentFun.apply(102, "Ashok"));
       studentList.add(studentFun.apply(104, "Mahendra"));
       studentList.add(studentFun.apply(106, "Poonam"));
       studentList.add(studentFun.apply(111, "Nagendra"));
       studentList.add(studentFun.apply(109, "Suresh"));
       
       System.out.println("Student details ");
       for (Student  student : studentList) {
    	   System.out.println(student.name +" : "+student.rollNo);
       }
      

	}

}
