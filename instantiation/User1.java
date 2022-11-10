package com.te.oops.instantiation;

public class User1 {
	// states
	String userName;
	int conNo;
	int pin;
	 User1() {
	  
	}
	 {System.out.println("account is created");}
	 User1(String userName,int conNo,int pin){
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
