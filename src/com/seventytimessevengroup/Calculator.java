package com.seventytimessevengroup;

public class Calculator {
	private int result;

	public Calculator() {
	}
	
	public void add(int firstNumber, int secondNumber) {
		result = firstNumber + secondNumber;
	}
	
	public int result() {
		return result;
	}
}
