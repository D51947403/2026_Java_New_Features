package mainaha.java8features;

@FunctionalInterface 
public interface MyInterface1 {
	void display();  
	
	// A non-abstract (or default) function 
    default void normalFun() 
    { 
       System.out.println("normalFun"); 
    } 
}
