package com.te.collection.list;

import java.util.Comparator;

public class Id implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.id-o2.id;
	}

	
	

}
