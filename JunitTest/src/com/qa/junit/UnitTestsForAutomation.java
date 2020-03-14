package com.qa.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTestsForAutomation {

	@Test
	public void testOne() {
		System.out.println("Test Pass");
	}
	
	

	@Test
	public void testTwo() {
		int a=10;
		int b=20;
		if(a<b) {
			System.out.println("Test Pass");	
		}
		
	}
	
	

}
