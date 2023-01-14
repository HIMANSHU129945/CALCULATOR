package com.jsp;

public class Calculator_Impl implements Calculator{

	@Override
	public String add(int a, int b) {
		return "The Addition Of "+a+" & "+b+" Is: "+(a+b);
	}

	@Override
	public String sub(int a, int b) {
		return "The Difference Of "+a+" & "+b+" Is: "+(a-b);
	}

	@Override
	public String mul(int a, int b) {
		return "The Multiplication Of "+a+" & "+b+" Is: "+(a*b);
	}

	@Override
	public String div(int a, int b) {
		return "The Division Of "+a+" & "+b+" is: "+(a/b);
		
	}

	@Override
	public void errorDisplayMessage() {
		System.out.println("Thank You!!!!!!!!");
		
	}
	
	

}
