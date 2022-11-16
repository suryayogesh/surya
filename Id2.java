package com.te.collection.list;

import java.util.Comparator;

public class Id2 implements Comparator<Student1> {

	@Override
	public int compare(Student1 o1, Student1 o2) {
		
		return o1.id-o2.id;
	}
	


}
