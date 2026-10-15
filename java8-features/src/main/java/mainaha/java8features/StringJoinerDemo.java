package mainaha.java8features;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {

		joinStringByDelimeter();
		addingPrefixSuffix();
		mergingTwoString ();
		setEmptyValueExample();
		
	}
/***
 * Joining strings by specifying delimiter
 */
	static void joinStringByDelimeter() {
		
		// Passing Hyphen(-) as delimiter
		StringJoiner   myString = new StringJoiner("-");
		
		  // Joining multiple strings by using add() method of StringJoiner class
		myString.add("Ram");
		myString.add("Shyam");
		myString.add("Radha");
		myString.add("Mohan");
		myString.add("Ramesh");
		System.out.println("Resultant String is \n "+myString);
		
	}
	/**
	 * Adding prefix and suffix to the output String
	 */
	static void addingPrefixSuffix() {
		
		/* Passing comma(-) as delimiter and opening bracket
    	 * "(" as prefix and closing bracket ")" as suffix
    	 */
        StringJoiner mystring = new StringJoiner("-", "(", ")");
        
     // Joining multiple strings by using add() method  
        mystring.add("Negan");  
        mystring.add("Rick");  
        mystring.add("Maggie");  
        mystring.add("Daryl");
        
        // Displaying the output String
        System.out.println(mystring);  
		
	}
	/**
	 * Merging two StringJoiner objects
	 */
	static void mergingTwoString() {
		
		/* Passing comma(,) as delimiter and opening bracket
		 * "(" as prefix and closing bracket ")" as suffix
		 */
		StringJoiner mystring = new StringJoiner(",", "(", ")");    

		mystring.add("Negan");  
		mystring.add("Rick");  
		mystring.add("Maggie");  
		mystring.add("Daryl");  

		System.out.println("First String: "+mystring);
		
		/* Passing hyphen(-) as delimiter and string "pre"
		 * as prefix and string "suff" as suffix
		 */
		StringJoiner myanotherstring = new StringJoiner("-", "[", "]");    

		myanotherstring.add("Sansa");  
		myanotherstring.add("Imp");  
		myanotherstring.add("Jon");  
		myanotherstring.add("Ned"); 

		System.out.println("Second String: "+myanotherstring);
		/* Merging both the strings  
		 * The important point to note here is that the output string will be 
		 * having the delimiter prefix and suffix of the first string (the string
		 * which is calling the merge method of StringJoiner)
		 */
		StringJoiner mergedString = mystring.merge(myanotherstring);   
		System.out.println(mergedString);  
		System.out.println("--------");
		StringJoiner mergeStr=myanotherstring.merge(mystring);
		System.out.println(mergeStr);
		
		
	}
	
	public static void setEmptyValueExample() {
		//Comma(,) as delimiter
		StringJoiner  strJoin= new StringJoiner(",");
		 /* Using setEmptyValue() method, we can set the default value
         * of a StringJoiner instance, so if the StringJoiner is empty
         * and we print the value of it, this default value will be
         * displayed
         */
		strJoin.setEmptyValue("This is default value");
		
		  /* We have not added any string to StringJoiner yet so
         * this should display the default value of StringJoiner
         */
        System.out.println("Default String: "+strJoin);  
        // adding empty value
        strJoin.add("");
        System.out.println("added empty element : "+strJoin); 
        strJoin.add(null);
        System.out.println("added empty element and null value: "+strJoin);
        // Adding strings to StringJoiner  
        strJoin.add("Apple");  
        strJoin.add("Banana"); 
        strJoin.add("Orange");
        strJoin.add("Kiwi");
        strJoin.add("Grapes");
        System.out.println("--------");
        System.out.println(strJoin);  
        int length = strJoin.length();  
        System.out.println("Length of the StringJoiner: "+length);  
        
        /* The toString() method is used for converting a StringJoiner
         *  instance to a String. 
         */
        String str = strJoin.toString();  
        System.out.println(str);
	}
}
