package com.te.collection.list;

public class Student{
	int id;
	String name;
	int mark;
	int age;
	
	
	public Student(int id, String name, int mark, int age) {
		this.id = id;
		this.name = name;
		this.mark = mark;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mark=" + mark + ", age=" + age + "]";
	}

}