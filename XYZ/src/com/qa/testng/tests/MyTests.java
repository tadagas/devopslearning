package com.qa.testng.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTests {

	@Test
	public void testpass() {
		Assert.assertTrue(false, null);
	}
	
	@Test
	public void testfail() {
		
		Assert.assertTrue(true);
	}
}
