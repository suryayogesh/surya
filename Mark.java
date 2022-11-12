package com.te.collection.list;

import java.util.Comparator;

public class Mark implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.mark-o2.mark;
	}


}
