package com.te.javabasic.abstraction;
public class Audi implements Car {

	

	@Override
	public void accelarate() {
		System.out.println(" accelarate in Audi ");
		
	}

	@Override
	public void breaks() {
		System.out.println(" breaks in Audi ");

    
	}

	@Override
	public void gear() {
		System.out.println(" gear in Audi ");


	}
	public void gps() {
		System.out.println("gps is enabled in Audi");
	}


}
