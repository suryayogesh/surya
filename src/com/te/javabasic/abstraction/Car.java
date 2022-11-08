package com.te.javabasic.abstraction;

public interface Car { 
	
	void accelarate();

	void breaks();

	void gear();
	
	default void gps(){
		
	}
    default void airbag(){
		
	}
}
