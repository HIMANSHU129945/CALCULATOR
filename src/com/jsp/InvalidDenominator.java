package com.jsp;

public class InvalidDenominator extends RuntimeException{
	private String message;

	public InvalidDenominator(String message) {
		super();
		this.message = message;
	}
	
	public String getMessage() {
		return "Invalid Denominator";
	}

}
