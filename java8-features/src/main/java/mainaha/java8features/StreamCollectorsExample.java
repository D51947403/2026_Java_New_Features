package mainaha.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCollectorsExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Jon", "Ajeet", "Steve", "Ajeet", "Jon", "Ajeet");

		Map<String, Long> map = names.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	    System.out.println("Map "+map);
	
	  StudentData s1= new StudentData(100, "Aman", "Pune");
	  StudentData s2= new StudentData(101, "Aban", "Mumbai");
	  StudentData s3= new StudentData(102, "Acan", "Pune");
	  StudentData s4= new StudentData(103, "Adan", "Indore");
	  StudentData s5= new StudentData(104, "Aean", "Pune");
	  StudentData s6= new StudentData(105, "Afan", "Indore");
	  StudentData s7= new StudentData(106, "Agan", "Mumbai");
	  StudentData s8= new StudentData(107, "Ahan", "Indore");
	  
	  List<StudentData> studentList = new ArrayList<StudentData>();
	  studentList.add(s1);
	  studentList.add(s2);
	  studentList.add(s3);
	  studentList.add(s4);
	  studentList.add(s5);
	  studentList.add(s6);
	  studentList.add(s7);
	  studentList.add(s8);
	  //
	  Map<String, Long> studentCountByCity  = studentList.stream()
	            .collect(Collectors.groupingBy(
	            		StudentData::getCity,       // Classification function (Group by City)
	                    Collectors.counting()   // Downstream collector (Count elements in each group)
	                ));

      // 3. Print the result
      System.out.println("Student count by city:");
      studentCountByCity.forEach((city, count) -> 
          System.out.println(city + " : " + count)
      );  
	  
	}

}


class StudentData {
	int id ;
	String name ;
	String city ;
	protected StudentData(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
