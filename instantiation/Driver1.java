package com.te.oops.instantiation;

import java.util.*;

public class Driver1 {
	static Scanner scanner= new Scanner(System.in);
	static Facebook app;
	public static void main(String[] args)throws Exception {
		boolean repeat=true;
		do {
			System.out.println("\n\n\n1.post status\n2. display status\n3.about\n4.creat user\n5.exit");
			int choice=scanner.nextInt();
			switch (choice) 
			{
			case 1:{
				
				System.out.println("1- enter status");
				scanner.nextLine();
				
				app=Facebook.getFacebook("hi im aggrication");
				
				break;}
			case 2:{ 
				System.out.println(app.getStatus());
				break;}
			case 3:{
				app.display();
				break;}
			case 4:{app.creatAcc(new User1 ("arunachalam",1234567,123));
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
