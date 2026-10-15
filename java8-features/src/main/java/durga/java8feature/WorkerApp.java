package durga.java8feature;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.function.BiFunction;

public class WorkerApp {

	public  static void main(String[] args) {
		
		 BiFunction <Worker ,TimeSheet , Double> salaryFun = (worker ,timesheet ) -> worker.dailyWages*timesheet.workingDays ;
		 
		  HashMap<Worker , TimeSheet>  workerMap = new HashMap <Worker ,TimeSheet>();
		  
		  workerMap.put(new Worker(11 ,"Devendra" ,500.00), new TimeSheet(11 , 20));
		  workerMap.put(new Worker(12 ,"Manish" ,500.00), new TimeSheet(12 , 10));  
		  workerMap.put(new Worker(13 ,"Shivraj Singh" ,500.00), new TimeSheet(13 , 30));
		  workerMap.put(new Worker(14 ,"Ashok Gahlot" ,500.00), new TimeSheet(14 , 26));
		  workerMap.put(new Worker(15 ,"Vasundhara Raje" ,500.00), new TimeSheet(15 , 25));
		  workerMap.put(new Worker(16 ,"Nirmala Sitaraman" ,500.00), new TimeSheet(16 , 18));
		  workerMap.put(new Worker(17 ,"Kailash Vijaywargiya" ,500.00), new TimeSheet(17 , 12));
		  workerMap.put(new Worker(18 ,"Jyotiraditya Scindhiya" ,500.00), new TimeSheet(18 , 23));
		 
		  
         // Printing salary of worker
		  for (Entry<Worker, TimeSheet> workerEntry: workerMap.entrySet()) {
			  System.out.println( "Salary of "+workerEntry.getKey().workerName+" : " +salaryFun.apply( workerEntry.getKey(), workerEntry.getValue()));
		  }
		  
	}

}
