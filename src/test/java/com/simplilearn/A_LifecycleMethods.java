package com.simplilearn;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class A_LifecycleMethods {

	@BeforeAll
	public static void initAll() {
		System.out.println("Before All Executed");
	}

	@BeforeEach
	public void init() {
		System.out.println("Before Each Executed..");
	}
	
	@Test
	public void test_case_1_whatever_name_you_want_to_give() {
		System.out.println("Test1 logic executed...");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2 logic executed...");
	}
	
	@AfterEach
	public void after() {
		System.out.println("After Each Executed..");
	}

	@AfterAll
	public static void afterAll() {
		System.out.println("After All Executed");
	}
}
