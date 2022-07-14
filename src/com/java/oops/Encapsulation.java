package com.java.oops;
import java.util.Scanner;

public class Encapsulation {
	
	public static void main(String[] args) {
		
		Employee Employee1 = new Employee();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter First Name : ");
		String name = s.next();
		
		System.out.println("Enter Last Name : ");
		String lName = s.next();
		
		System.out.println("Enter contact number");
		String number = s.next();		
		
		System.out.println("Enter Tech Stack : ");
		String stack = s.next();
		
		Employee1.setName(name);
		Employee1.setLastName(lName);
		Employee1.setNumber(number);
		Employee1.setTechStack(stack);
		
		System.out.println("Employee First Name is : " + Employee1.getName());
		System.out.println("Employee Last Name is : " + Employee1.getLastName());
		System.out.println("Employee Contact Number is : " + Employee1.getNumber());
		System.out.println("Employee Tech Stack is : " + Employee1.getTechStack());
	}
}

class Employee {
	private String name;
	private String lName ;
	private String Number;
	private String TechStack;
	
	public void setName(String a) {
		this.name = a;
	}
	public String getName() {
		return name;
	}
	public void setLastName(String a) {
		this.lName = a;
	}
	public String getLastName() {
		return lName;
	}
	public void setNumber(String a) {
		this.Number = a;
	}
	public String getNumber() {
		return Number;
	}
	public void setTechStack(String a) {
		this.TechStack = a;
	}
	public String getTechStack() {
		return TechStack;
	}
} 


