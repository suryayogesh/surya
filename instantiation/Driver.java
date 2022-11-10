package com.te.oops.instantiation;

import java.util.*;

public class Driver {
	static Scanner scanner= new Scanner(System.in);
	static WhatsApp app;
	public static void main(String[] args)throws Exception {
		boolean repeat=true;
		do {
			System.out.println("\n\n\n1.creataccount\n2.set status\n3. display status\n4.about\n5.exit");
			int choice=scanner.nextInt();
			switch (choice) 
			{
			case 1:{
				
				System.out.println("1- enter status, \n2-user name,\n3-phone number\n4-pin ");
				scanner.nextLine();
				String status=scanner.nextLine();
				String userName=scanner.nextLine();
				int conNo=scanner.nextInt();
				int pin=scanner.nextInt();
				
				app=WhatsApp.getWhatsapp(status,userName,conNo,pin);
				
				break;}
			case 2:{
				System.out.println("enter the pin ");
				int pin =scanner.nextInt();
				System.out.println("enter new status");
				scanner.nextLine();
				String status=scanner.nextLine();
				app.setStatus(pin, status);
				break;}
			case 3:{ 
				System.out.println("enter the pin");
				int pin=scanner.nextInt();
				System.out.println(app.getStatus(pin));
				break;}
			case 4:{
				app.display();
				break;}
			case 5:{
				repeat=false;
				System.out.println("thanks for visiting  ");
				break;}
			}	
		}
		while (repeat);
		
	}

}
