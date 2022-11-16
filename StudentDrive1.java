package com.te.collection.list;

import java.util.*;

public class StudentDrive1 {
	static Scanner scanner = new Scanner(System.in);
	static boolean exit = true;
	static ArrayList<Student1> arrayList1;
	static Set<Student1> hashSet1;

	// static int id2;
	public static void main(String[] args) {
		StudentDrive1 drive1 = new StudentDrive1();

		hashSet1 = new HashSet<Student1>();

		do {
			System.out.println(" enter id no ,name, mark,age");
			int id2 = scanner.nextInt();

			scanner.next();
			String name2 = scanner.nextLine();
			int mark2 = scanner.nextInt();
			int age2 = scanner.nextInt();
			hashSet1.add(new Student1(id2, name2, mark2, age2));

			System.out.println("do you want to continue press yes or no");
			// scanner.next();
			String out = scanner.next();
			if (out.equalsIgnoreCase("no")) {
				exit = false;
			}

		} while (exit);
		System.out.println(hashSet1);
		arrayList1 = new ArrayList<Student1>(hashSet1);
		System.out.println("you have select sort by id ");
        Collections.sort(arrayList1, new Id2());
        for (Student1 student1 : arrayList1) {
			System.out.println(student1);

		}
//
//	public static void display() {
//
//		System.out.println("select type of sort\n1.by id\n2.by mark\n3.by age\n4.by name");
//		String type = scanner.next();
//		switch (type) {
//		case "1": {
//			System.out.println("you have select sort by id ");
//
//			Collections.sort(arrayList1, new Id2());
//
//			for (Student1 student1 : hashSet1) {
//				System.out.println(student1);
//			}
//
//			break;
	}
//		case "2": {
//			System.out.println("you have select sort by mark ");
//
//			Collections.sort(arrayList, new Mark());
//			for (Student student : hashSet) {
//				System.out.println(student);
//			}
//
//			break;
//		}
//		case "3": {
//			System.out.println("you have select sort by Age ");
//
//			Collections.sort(arrayList, new Age());
//			for (Student student : hashSet) {
//				System.out.println(student);
//			}
//
//			break;
//		}
//		case "4": {
//			System.out.println("you have select sort by Name ");
//
//			Collections.sort(arrayList, new Name());
//			for (Student student : hashSet) {
//				System.out.println(student);
//			}
//
//			break;
//		}
////			case 5: {
////				System.out.println("you have select exit ");
////                  exit=false;
////
////				break;
////			}
//		default:
//			// System.out.println("you have enter wrong number");
//			throw new StudentException("enter correct integer");

}
