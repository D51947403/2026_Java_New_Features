package durga.java8feature;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo1 {

	public static void main(String[] args) {

		Supplier<Date> currDateSup = () -> new Date();

		System.out.println("date " + currDateSup.get());
		
		Supplier<String> nameSup = () ->{
			  String [] strArr  = {"Devendra" ,"Kumar","Singraul" ,"Manju" ,"Manoj"};
			  int x = (int) (Math.random() * 4);
			  System.out.println("Element no : "+x);
			  return strArr[x];
		    };
		    
		    System.out.println(nameSup.get());
		    System.out.println(nameSup.get());
		    
	}

}
