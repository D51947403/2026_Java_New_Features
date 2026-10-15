package durga.java8feature;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {

       BiFunction <Integer,Integer,Integer>  productFun = (a , b) -> a*b ;
       
       System.out.println(productFun.apply(10, 12)); //120
       
       System.out.println(productFun.apply(24 , 4)); //96
       
       System.out.println(productFun.apply(15, 15)); // 225

	}

}
