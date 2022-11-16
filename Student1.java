package com.te.collection.list;

public class Student1 {
	int id;
	String name;
	int mark;
	int age;
	
	
	public Student1(int id, String name, int mark, int age) {
	    
		
		
	    this.id = id;
		this.name = name;
		this.mark = mark;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Student id=" + id + ", name=" + name + ", mark=" + mark + ", age=" + age ;
	}


	@Override
	public int hashCode() {
		return this.id;
	}


	@Override
	public boolean equals(Object obj) {
		
		if(id ==this.id) {
			try {
			throw new Student1Exception("id number should not be duplicated");
			} catch (Student1Exception e) {
				System.out.println(e.getMessage());
			}
			return true;
		}
		return false;
	}
	
}