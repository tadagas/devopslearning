package com.test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	//Pre-conditions annotations-- starting with @before
	//Test- Actual tests..
	//Post Conditions.				end with @after

	@BeforeSuite
	public void Setup() {
		System.out.println("@BeforeSuite-Project setup");
	}
	
	@BeforeTest
	public void LaunchBrowser() {
		System.out.println("@BeforeTest-Launch the chrome browser");
	}
	
	@BeforeClass
	public void LogintoApp() {
		System.out.println("@BeforeClass-Login Into App");
	}
	
	@BeforeMethod
	public void HomePageForm() {
		System.out.println("@BeforeMethod-HomePageForm");
	}
	
	//Test cases -- starting with @After
	
	@Test(priority=0,groups="title")
	public void ApplicationLandingForm() {
		System.out.println("@Test(priority=0)-ApplicationLandingForm");
	}
	
	@Test(priority=1,groups="title")
	public void TestValidation() {
		System.out.println("@Test(priority=1)-TestValidation");
	}
	
	@Test(priority=2,groups="title")
	public void FieldTestValidation() {
		System.out.println("@Test(priority=2)-FieldTestValidation");
	}
	
	@Test(priority=3)
	public void LogoutWebApp() {
		System.out.println("@Test(priority=3)-LogoutWebApp successfully");
	}
	
	@AfterMethod
	public void SumOfValue() {
		System.out.println("@AfterMethod-Executed the tests successfully");
	}
	
	@AfterClass
	public void TestExecuted() {
		System.out.println("@AfterClass-Browser quit result");
	}
	
	@AfterTest
	public void Results() {
		System.out.println("@AfterTest-Successfully displayed App");
	}
	

	@AfterSuite
	public void testcomplete() {
		System.out.println("@AfterSuite-Test Complete");
	}
}
