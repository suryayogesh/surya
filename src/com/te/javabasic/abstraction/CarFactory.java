package com.te.javabasic.abstraction;
import java.util. Scanner;
 
public class CarFactory {
	static Scanner scanner =new Scanner(System.in);
	 
	public static Car getCar() {
	     System.out.println( " Enter your car name");
	     String carName=scanner.next();
	     if (carName.equalsIgnoreCase("bmw")) {
	    	 return  new Bmw(); 
		}
	     else if (carName.equalsIgnoreCase("Audi")) {
	    	 return new Audi();
			
		} else {
			return null;

		}
		
	     
	     
	     
	     
	      
	      
		
	}

}
