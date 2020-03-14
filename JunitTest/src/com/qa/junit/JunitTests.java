package com.qa.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JunitTests {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testSetup() {
	String str= "I am done with Junit setup";
	assertEquals("I am done with Junit setup",str);
	}

	@Test
	public void testOne() {
		System.out.println("Test One");
	}
	
	@Test
	public void testTwo() {
		System.out.println("Test Two");
	}
	
	@Test
	public void testThree() {
		System.out.println("Test Three");
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
}
