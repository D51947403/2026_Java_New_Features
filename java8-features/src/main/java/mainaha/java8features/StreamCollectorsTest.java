package mainaha.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollectorsTest {

	public static void main(String[] args) {


		 List<Student> studentlist = new ArrayList<Student>();   
		 
		//Adding Students      
	      studentlist.add(new Student(11,"Jon",22));      
	      studentlist.add(new Student(22,"Steve",18));        
	      studentlist.add(new Student(33,"Lucy",22));        
	      studentlist.add(new Student(44,"Sansa",23));         
	      studentlist.add(new Student(55,"Maggie",18));         
	      
	      //Fetching student names as List  
	      
	      List<String> namesList = studentlist.stream().map(n -> n.name).collect(Collectors.toList());
	      
	      System.out.println("namesList "+namesList);   
	      
	    //Fetching student data as a Set      
	      
	      Set<Student> studentSet = studentlist.stream().filter(n -> n.id >22).collect(Collectors.toSet());
	      
	      //Iterating Set       
	      studentSet.forEach(student -> System.out.println("name "+student.name+" id "
	      		+ ""+student.id+" age "+student.age));
	     

	    //Getting the average Age 
	      Double avgAge = studentlist.stream()   
	          .collect(Collectors.averagingInt(s->s.age));  
	      System.out.println("Average Age of Students is: "+avgAge);
	     
	}

}
