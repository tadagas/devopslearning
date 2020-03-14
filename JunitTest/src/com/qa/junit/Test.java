package com.qa.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

class Test {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("SetupBeforeClass starts");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass after");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Setup starts");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Tead down starts");
	}

	@org.junit.jupiter.api.Test
	void test() {
		fail("Not yet implemented");
	}

}
