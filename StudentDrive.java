package com.te.collection.list;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class StudentDrive {
	static Scanner scanner = new Scanner(System.in);
	static boolean exit = true;
	static boolean exit1 = true;
	static ArrayList<Student> arrayList;

	public static void main(String[] args) {

		arrayList = new ArrayList<Student>();
		Student student1 = new Student(1, "siva", 34, 25);
		Student student2 = new Student(4, "anath", 12, 20);
		Student student3 = new Student(5, "praveen", 8, 24);
		Student student4 = new Student(2, "arunachalam", 22, 99);
		Student student5 = new Student(3, "raj", 0, 25);
		arrayList.add(student1);
		arrayList.add(student2);
		arrayList.add(student3);
		arrayList.add(student4);
		arrayList.add(student5);
//		arrayList.add(new Student(2, "praveen", 12, 47));
//		arrayList.add(new Student(3, "anath", 8, 25));
//		arrayList.add(new Student(1, "siva", 32, 26));
//		arrayList.add(new Student(1, "arunachalam", 31, 27));
//		arrayList.add(new Student(1, "raj", 30, 29));
		System.out.println("before sorting by id");
		System.out.println(arrayList);
		try {
			display();
			display1();
		} catch (StudentException e) {
			System.out.println(e.getMessage());
			do {
			try {
				display();
			} catch (StudentException e2) {
				System.out.println(e.getMessage());
				System.out.println(" do you want to continue press yes or no");
				String exe=scanner.next();
				if(exe.equalsIgnoreCase("no")) {
					 exit1=false;
				}
				
			}
			}while(exit1);
			
		}

	}

	public static void display1() {
		do {
			System.out.println("do you want to continue enter yes or no ");
			// scanner.next();
			String string = scanner.next();
			if (string.equalsIgnoreCase("yes")) {

				display();

			} else if (string.equalsIgnoreCase("no")) {
				exit = false;
			} else {
				throw new StudentException("oops you have enter wrong key");
				// System.out.println("you have enter wrong key...");

			}

		} while (exit);
	}

	public static void display() {

		System.out.println("select type of sort\n1.by id\n2.by mark\n3.by age\n4.by name");
		String type = scanner.next();
		switch (type) {
		case "1": {
			System.out.println("you have select sort by id ");

			Collections.sort(arrayList, new Id());
			for (Student student : arrayList) {
				System.out.println(student);
			}

			break;
		}
		case "2": {
			System.out.println("you have select sort by mark ");

			Collections.sort(arrayList, new Mark());
			for (Student student : arrayList) {
				System.out.println(student);
			}

			break;
		}
		case "3": {
			System.out.println("you have select sort by Age ");

			Collections.sort(arrayList, new Age());
			for (Student student : arrayList) {
				System.out.println(student);
			}

			break;
		}
		case "4": {
			System.out.println("you have select sort by Name ");

			Collections.sort(arrayList, new Name());
			for (Student student : arrayList) {
				System.out.println(student);
			}

			break;
		}
//			case 5: {
//				System.out.println("you have select exit ");
//                  exit=false;
//
//				break;
//			}
		default:
			// System.out.println("you have enter wrong number");
			throw new StudentException("enter correct integer");

		}

	}

}