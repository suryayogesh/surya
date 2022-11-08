package com.te.javabasic.abstraction;

public class CarTest {
	 public static void main(String[] args) {
		Car car=  CarFactory.getCar();
		Driver driver1= new Driver();
				driver1.driver(car);
	}
	

}
