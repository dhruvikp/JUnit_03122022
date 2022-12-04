package com.simplilearn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@DisplayName("Repeated test class")
public class E_RepeatedTest {
	Calculator c;

	@BeforeEach
	void init() {
		System.out.println("init invoked");
		c = new Calculator();
	}
	
	//@RepeatedTest(100)
	@Test
	@DisplayName("Repeated tests")
	public void test() {
		Assertions.assertEquals(2, c.calculate(1, 1));
	}
	
}
