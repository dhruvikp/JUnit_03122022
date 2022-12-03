package com.simplilearn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class CalculatorTest {

	Calculator c;
	
	@BeforeEach
	public void init() {
		c = new Calculator();
	}
	
	@Test
	public void test_when_both_argument_positive() {
		// STEP 1: Prepare input
		int a = 1;
		int b = 1;
		
		// STEP 2: Invoke actual code to get actual output
		int actual = c.calculate(a, b);
	
		// STEP 3: Prepare expected
		int expected = 2;
		
		// STEP 4: Assert expected vs actual
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void test_when_one_is_positive_one_is_negative() {
		// STEP 1: Prepare input
		int a = 1;
		int b = -1;
		
		// STEP 2: Invoke actual code to get actual output
		int actual = c.calculate(a, b);
	
		// STEP 3: Prepare expected
		int expected = 0;
		
		// STEP 4: Assert expected vs actual
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void test_when_both_argument_negative() {
		// STEP 1: Prepare input
		int a = -1;
		int b = -1;
		
		// STEP 2: Invoke actual code to get actual output
		int actual = c.calculate(a, b);
	
		// STEP 3: Prepare expected
		int expected = -2;
		
		// STEP 4: Assert expected vs actual
		Assertions.assertEquals(expected, actual);
	}
	
}
