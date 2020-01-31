package com.test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

public class TestNgFeatures {

	//Soft Assert: Soft Assert collects errors during @Test. Soft Assert does not throw an exception when an assert fails and would continue with the next step after the assert statement. 
	//Hard Assert: Hard Assert throws an AssertExceptionimmediately when an assert statement fails and test suite continues with next @Test.
	
	@Test
	public void loginPage() {
		System.out.println("Sucess");
		int i=9/0;
	}
	
	@Test(dependsOnMethods="loginPage")
	public void HomePage() {
		System.out.println("HomePage-Sucess");
	}
	
	@Test(dependsOnMethods="loginPage")
	public void LogoutPage() {
		System.out.println("LogoutPage-Sucess");
		AssertJUnit.assertEquals(1,2);
		
	}
	
	
}
