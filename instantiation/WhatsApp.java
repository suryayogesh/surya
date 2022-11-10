package com.te.oops.instantiation;

public class WhatsApp {
	//states
	private String status;
	User user;
	WhatsApp() {
		
	} 
	{System.out.println("wellcome to my app");}
	
	WhatsApp(String status,User user ){
	this.status=status;
	this.user=user;

    }
	public String getStatus(int pin ) {
		if(user.pin==pin) {
		return status;
		
	}
		else
			return "incorrect";
	}
	public void setStatus(int pin,String status) {
		if (user.pin==pin) {
			this.status=status;
			System.out.println("status is updated");
			
		} else {
            System.out.println("incorrect pin");
		}
		
	}
	public static WhatsApp getWhatsapp(String status,String userName,int conNo,int pin ) {
		System.out.println(" account created");
		return new WhatsApp(status,new User(userName,conNo,pin) );
		
	}
	public void display() {
		user.displayUser();
		System.out.println(" the status is :"+ status);
	}
}
