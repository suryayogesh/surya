package com.te.collection.list;

public class ArrayListDemo {
      public static void main(String[] args) {
    	  ArryaListPrograms arryaListPrograms=new ArryaListPrograms(10);
    	  arryaListPrograms.add(10);  
    	  arryaListPrograms.add(10);  
    	  arryaListPrograms.add(10);  
    	  arryaListPrograms.add(10);  
    	  arryaListPrograms.add(10);  
    	  arryaListPrograms.add(10);  
    	  arryaListPrograms.add(10);  
    	   
		System.out.println(arryaListPrograms.size());
		for (int i = 0; i < arryaListPrograms.size(); i++) {
			System.out.println(arryaListPrograms.get(i));
		}
	}
      
       
}
