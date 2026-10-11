package mainaha.java7.features;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TryCatchEnhanceMent {

	public static void main(String[] args) throws IOException {

		
         try {
        	 System.out.println("done");
        	 int k =9/0 ;
        	 // catch with multiple exceptions 
         }catch (ArithmeticException  | NullPointerException  | ClassCastException ex) {
        	 ex.printStackTrace();
         }

         File src =new File ("abc.txt");
              src.createNewFile();
         File dest = new File("xyz.txt"); 
         // try with resources 
         try(InputStream in = new FileInputStream(src);
           OutputStream out = new FileOutputStream(dest)){
        	 System.out.println("try with resource example");
        	 
         }
         
	}

}
