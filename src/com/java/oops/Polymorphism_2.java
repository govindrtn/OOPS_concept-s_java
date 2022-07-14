package com.java.oops;

 class BaseClass{
	
	void func1() {
		System.out.println("fUNC1 CALLED");
	}
}
 class Derived extends BaseClass{

	void func1() {
		System.out.println("fUNC2 CALLED");
	}
}

public class Polymorphism_2 {
	
	public static void main(String[] args) {
		
		Derived d = new Derived();
		d.func1();
		
		 BaseClass b =  new  BaseClass();
		 b.func1();
	}	
}
