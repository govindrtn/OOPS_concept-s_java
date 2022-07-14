package com.java.oops;

public class Polymorphism {
	
	
//	CompileTime polymorPhism 

	void sum (int x, int y) {
		int z = x + y;
		System.out.println(z);
	}
	void sum(int x , int y ,int z ) {
		int r = x + y + z;
		System.out.println(r);
	}
	
	public static void main(String[] args) {
		

		Polymorphism  myObj = new Polymorphism();
		
		myObj.sum(4, 4);
		myObj.sum(3, 3, 3);

	}
	
}