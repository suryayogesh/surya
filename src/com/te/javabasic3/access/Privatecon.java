package com.te.javabasic3.access;

public class Privatecon {
	  int a;

	private Privatecon( int a) {
		this.a=a;
		
	}
	public static Privatecon getDetail(int a ) {
		
		return new Privatecon(a);
		
	}
}
