package com.te.oops.instantiation;

public class User {
	// states
	String userName;
	int conNo;
	int pin;
	 User() {
	  
	}
	 User(String userName,int conNo,int pin){
	     this.userName=userName;
	     this.conNo=conNo;
	     this.pin=pin;

    }
	 // Behavior
	 public void displayUser() {
		 System.out.println(" User name is :"+ userName);
		 System.out.println("contact number is:"+conNo);
		
	}
}
