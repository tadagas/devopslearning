package com.qa.testng.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

@Test
public class TestNgAnnotations {
	

	
	@Test(priority=1, dependsOnMethods="Sum")
	public void validatedifferentValues() {
		System.out.println("Different combination of test data");
	}
	
	@Test(priority=1, dependsOnMethods="Sum")
	public void SumOne() {
		System.out.println("Different combination of test data");
	}
	public void Sum() {
		System.out.println("Different combination of test data");
	}
	
	@Test(priority=1, dependsOnMethods="Sum")
	public void SumTwo() {
		System.out.println("Different combination of test data");
	}
	
	@Test(priority=1, dataProvider="")
	public void SumTwo(int a, int b) {
		System.out.println("Different combination of test data");
	}
	
}
