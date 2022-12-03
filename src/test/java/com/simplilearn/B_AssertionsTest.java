package com.simplilearn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class B_AssertionsTest {

	@Test
	public void test() {
		Assertions.assertEquals(1, 1);
		Assertions.assertTrue(5>3);
	
		String str = null;
		String str1 = "Dhruvik";
		
		Assertions.assertNull(str);
	
		Assertions.assertNotEquals(str, str1);
		
		String[] a1 = {"A","B"};
		String[] a2 = {"A","b"};
		
		Assertions.assertArrayEquals(a1, a2);
	}
}