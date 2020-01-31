package com.qa.utils;

import java.io.FileNotFoundException;

import com.qa.base.TestBaseClass;

public class UtilsClass extends TestBaseClass {

	public static long pageLoadTimeout=20;
	public static long implicitlyWait=10;
	
	public UtilsClass() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void switchToFrame() {
		driver.switchTo().frame("Test-XYZ");
		
	}
}
