package com.jsp;

import java.util.Scanner;

public class Main_Class {
	
	static int a;
	static int b;
	static Scanner sc=new Scanner(System.in);
	
	static void acceptInput() {
		System.out.println("Enter First Number");
		a=sc.nextInt();
		System.out.println("Enter Second Number");
		b=sc.nextInt();
	}
	
	public static void main(String[] args) {
		Calculator_Impl cal=new Calculator_Impl();
		
		while(true) {
			System.out.println("Welcome To Calculator");
			System.out.println("Choose An Option\n1: Addition\n2: Substraction\n3: Multiplication\n4: Division\n5: Exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				acceptInput();
				System.out.println(cal.add(a, b));
				break;
			case 2:
				acceptInput();
				System.out.println(cal.sub(a, b));
				break;
			case 3:
				acceptInput();
				System.out.println(cal.mul(a, b));
				break;
			case 4:
				acceptInput();
				if(b != 0)
				{
					System.out.println(cal.div(a, b));
				}
				else {
					try {
						System.out.println(10/0);
					}
					catch(ArithmeticException ae)
					{
						System.out.println("Invalid Denominator");
					}
				}
				break;
			case 5:
				cal.errorDisplayMessage();
				System.exit(0);
				break;
			default:
				try {
					throw new InvalidChoiceException("Invalid Choice");
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			System.out.println();
		}
			
	}

}
