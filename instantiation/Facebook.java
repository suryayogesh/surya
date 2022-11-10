package com.te.oops.instantiation;

public class Facebook {
	//states
	private  String status1;
	User1 user;
	 Facebook() {
		// TODO Auto-generated constructor stub
	}
	{System.out.println("wellcome to my app");}
	 Facebook(String status1){
	    this.status1=status1;
	

    }
	 public void insertUser(User1 user) {
		 this.user=user;
	 }
	public String getStatus( ) {
		
		return status1;
		
	}
	public void creatAcc(User1 user) {
		  this.user=user;
	}
			
		
	public static Facebook getFacebook(String status1 ) {
	
		return new Facebook(status1 );
		
	}
	public void display() {
		
		System.out.println(" the status is :"+ status1);
		if( user!=null) {
		user.displayUser();
		}
	}
}
