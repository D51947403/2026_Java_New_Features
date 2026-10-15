package durga.java8feature;

import java.util.function.Supplier;

public class SupplierOTP {

	public static void main(String[] args) {

		Supplier<String> otpSup = () -> {
			String otp = "";
			for (int i = 0; i < 6; i++) {
				otp = otp + (int)( Math.random() * 10);
			}
			return otp;
		};
		System.out.println("otp " + otpSup.get());
		System.out.println("otp " + otpSup.get());
		System.out.println("otp " + otpSup.get());
		
		// Password Rules 
		// length should be 8 
		// 2,4,4,8  places only digit
		// 1,3,5,7 Upper case Alphabet and special character (@#$%&^*!)
		
		String symbol ="ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$%&^*!";
		
		Supplier<Character> charSup =() -> symbol.charAt((int)(Math.random()*34) );
		
		Supplier<Integer>  intSup = () -> (int)(Math.random()*10 );
		
		Supplier<String> passwordSup =() -> {
			String pwd ="";
			for (int i=1 ; i<=8 ;i++) {
				if(i%2 ==0) {
					pwd=pwd+intSup.get();
				}else {
					pwd=pwd+charSup.get();
				}
			}
			return pwd ;
		};
		System.out.println("Password " + passwordSup.get());
		System.out.println("Password " + passwordSup.get());
		System.out.println("Password " + passwordSup.get());
		
	}

}
