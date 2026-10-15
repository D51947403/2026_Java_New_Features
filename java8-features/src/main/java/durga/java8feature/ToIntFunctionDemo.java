package durga.java8feature;

import java.util.function.ToIntFunction;
//Advantage : No autoboxing and UnAutoboxing required there for 
//Performance is better
public class ToIntFunctionDemo {

	public static void main(String[] args) {

         ToIntFunction <String>  lenFun = str -> str.length();
         
         System.out.println(lenFun.applyAsInt("Devendra"));
         
         System.out.println(lenFun.applyAsInt("Kumar"));
         
         System.out.println(lenFun.applyAsInt("Singraul"));
	}

}
