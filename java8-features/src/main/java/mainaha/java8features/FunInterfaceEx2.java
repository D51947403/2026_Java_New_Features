package mainaha.java8features;
/*****
 *  interface is a valid functional interface.
 * ***/
@FunctionalInterface
public interface FunInterfaceEx2 {

	public void firstWork();

    @Override
    public String toString();                //Overridden from Object class
 
    @Override
    public boolean equals(Object obj);        //Overridden from Object class
}
