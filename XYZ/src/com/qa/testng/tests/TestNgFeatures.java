package com.qa.testng.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgFeatures {
	
	
	@BeforeSuite
	public void Setup() {
		System.out.println("Application Setup and configured on Azure Env");
	}
	
	@BeforeClass
	public void LaunchBrowse() {
		System.out.println("To launch the right browser");
	}
	
	@BeforeMethod
	public void LoginCred() {
		System.out.println("Enter login cred browser");
	}
	
	@BeforeTest
	public void AuthenticateApp() {
		System.out.println("Application landing page will display");
	}
	
	@Test(priority=0)
	public void validatedifferentSetofValues() {
		System.out.println("Different combination of test data");
	}
	
	@Test(priority=1)
	public void validatedifferentValues() {
		System.out.println("Different combination of test data");
	}
	
	@Test(priority=2,dependsOnMethods="validatedifferentValues")
	public void Calc() {
		System.out.println("Alert Message will display");
	}
	
	@Test(priority=3,groups="Calculation")
	public void Addition() {
		System.out.println("Different combination of test data");
	}
	
	@Test(priority=4,groups="Calculation")
	public void substraction() {
		System.out.println("Different combination of test data");
	}
	
	@Test(priority=5,groups="Calculation")
	public void Mutliplication() {
		System.out.println("Alert Message will display");
	}
	
	@Test(expectedExceptions=ArrayIndexOutOfBoundsException.class)
	public void Exception() {
			System.out.println("Alert Message will display");
		}
	  
	@AfterTest
	public void logoutApp() {
		System.out.println("logout the application");
	}
	
	@AfterMethod
	public void driverQuit() {
		System.out.println("driver quit");
	}
	
	@AfterClass
	public void ExecutionSucessfull() {
		System.out.println("Execution Completed Sucessfully");
	}
	
	@AfterSuite
	public void suiteexecutionOver() {
		System.out.println("Suite Execution Over");
	}
}
