package com.java.oops;

public class Inheritance {

	public static void main(String[] args) {
		
		DrivedClass  myObj = new DrivedClass();
	
		myObj.method1();
		myObj.method2();
	}	
}

class Base {
	public void method1() {
		System.out.println("Base Class method called");
	}	
}

class DrivedClass extends Base{
	
	public void method2() {
		System.out.println("Drived class called");
	}
}
