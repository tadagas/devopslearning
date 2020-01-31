package com.qa.commonutils;

import java.io.FileNotFoundException;

import com.qa.base.TestBase;

public class TestUtils extends TestBase {

	

	public static long pageLoadTimeout=20;
	public static long implicitlyWait=10;
	
	public TestUtils() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void switchToFrame() {
		driver.switchTo().frame("Test-XYZ");
		
	}
}
