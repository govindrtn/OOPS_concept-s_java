package com.java.oops;

public class Interface {
	
	public static void main(String[] args) 
	  { 
	    MyClass1 c1 = new MyClass1();  
	     c1.function1(); 
	 
	    MyClass2 c2 = new MyClass2();  
	     c2.function2(); 
	   } 

}

 interface Outer 
{ 
  void function1(); 

 interface Inner 
 { 
   void function2(); 
  } 
} 
 
    class MyClass1 implements Outer 
   { 
     public void function1()
     { 
       System.out.println("function 1 is called"); 
     } 
   } 
    
    class MyClass2 implements Outer.Inner 
   { 
     public void function2()
     { 
       System.out.println("function 2 is called"); 
     } 
    } 
