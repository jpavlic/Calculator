package com.seventytimessevengroup.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.seventytimessevengroup.Calculator;

public class CalculatorTest {
	private final Calculator calculator = new Calculator();
	
	@Test
	public void addTwoNumbers() {
		calculator.add(1, 2);
		assertEquals(3, calculator.result());
	}
}
