package com.te.javabasic2.access;



public class Access {
	public  void name() {
		System.out.println(" public method ");
		
	}

	protected void test1() {
		System.out.println(" protected method ");
	}

	private void test2() {
		System.out.println("private method");
	}
	 void test3() {
		System.out.println(" default method ");
	}
	 public static void main(String[] args) {
			System.out.println(" main method  ");
			Access  access=new Access();
			    
			    access.name();
				access.test1();
				access.test2();
				access.test3();
			    
		}
}
