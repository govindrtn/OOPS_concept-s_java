package com.java.oops;
import java.util.Scanner;

public class Abstraction {
		public static void main(String[] args) {
				
				Addition add = new Addition();
				Subtraction sub = new Subtraction();
				Multiplication mul = new Multiplication();
				Division div = new Division();
				
				Scanner s = new Scanner(System.in);
				
				System.out.println("Enter first Number: ");
				int num1 = s.nextInt();
				
				System.out.println("Enter Second Number: ");
				int num2 = s.nextInt();
				
				System.out.println("First number is " + num1 +" Second Number is " + num2);
				add.calculate(num1,num2);
				sub.calculate(num1,num2 );
				mul.calculate(num1, num2 );
				div.calculate(num1, num2);
		}				
} 

		abstract class Myclass{
			
			abstract void calculate(int a ,int b);
		}

		 class Addition extends Myclass
		{
			void calculate(int a, int b) 
			{
				int x = a + b;	
				System.out.println("Addition of Two Numbers is : "+ x);
			}
			
		}

		 class Subtraction extends Myclass
		{
			void calculate(int a, int b) 
			{
				int x = a - b;	
				System.out.println("Subtraction of Two Numbers is : " + x);
			}
			
		}
		 class Multiplication extends Myclass
		{
			void calculate(int a, int b) 
			{
				int x = a * b;
				System.out.println(" Multiplication of Two Numbers is  : " + x);
			}
			
		}

		class Division extends Myclass
		{
			void calculate(int a, int b) 
			{
				int  x = a / b;
				System.out.println( "Division of two Number is : " + x);
			}
		}

			
