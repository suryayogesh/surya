package com.te.javabasic.abstraction;

public class Bmw  implements Car {

	@Override
	public void accelarate() {
		// TODO Auto-generated method stub
		System.out.println(" accelarate in Bmw ");
		
	}

	@Override
	public void breaks() {
		// TODO Auto-generated method stub
		System.out.println(" breaks in Bmw ");
		
	}

	@Override
	public void gear() {
		// TODO Auto-generated method stub
		System.out.println(" gear in Bmw");
		
	}
	@Override
	public void airbag() {
		
		System.out.println("gps is enabled in Bmw");
	}

	

}
