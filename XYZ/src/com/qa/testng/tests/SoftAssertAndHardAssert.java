package com.qa.testng.tests;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertAndHardAssert {

	
	//Hard assertion: hard validation: if the hard assertion geting failed, Immediately test case will be marked as failed & test will be terminated.
	//Soft Assert: soft validation: if the soft assertion getting failed, test will be marked as failed and it will execute next line/step and complete whole test case execution.
	
	
	private SoftAssert softAssert;

	@Test
	public void test1() {
		System.out.println("Open Browser");
		// Hard Assert example : Assert.assertEquals(true,true); 
		// it will execute all rest of the lines of code..
		Assert.assertEquals(true,true);
		System.out.println("HardAssert is PASS");
		System.out.println("HardAssert is PASS");
		
		//Assert.assertEquals(true,false); //Hard Assert will fail
		softAssert.assertEquals(true,false,"Soft Assert execution sucessfully");
		System.out.println("Executed Sucessfully0");
		softAssert.assertEquals(true,false,"Soft Assert execution sucessfully");
		
		System.out.println("Executed Sucessfully1");
		softAssert.assertEquals(true,false,"Soft Assert execution sucessfully");
		System.out.println("Executed Sucessfully2");
		softAssert.assertAll();
		
	}

	
}
