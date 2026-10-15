package durga.java8feature;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class EmployeeApp {

	public static void main(String[] args) {

     BiFunction<String, Double ,Employee>  empFun = (name , salary) ->  new Employee(name , salary);
     
     ArrayList<Employee>  empList = new ArrayList <Employee>();
     
     empList.add(empFun.apply("Sivraj Singh", 10203.00));
     empList.add(empFun.apply("Ashok Singh", 22203.00));
     empList.add(empFun.apply("Sivraj Patel", 55203.00));
     empList.add(empFun.apply("Manoj Bajpayee", 11103.00));
     empList.add(empFun.apply("Avantika lodhi", 10233.00));
     empList.add(empFun.apply("Devendra lodhi", 10000.00));
     
     BiConsumer<Employee , Double> consumer = (empObj , increment) -> empObj.salary = empObj.salary+increment ;
     
     for (Employee  empObj : empList) {
    	 consumer.accept(empObj, 1500.00);
     }
     for (Employee  empObj : empList) {
    	 System.out.println("Employee Name : "+ empObj.name+", Salary : "+empObj.salary );
     }
     
     
	}

}
