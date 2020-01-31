package com.qa.testcasepages;

import java.io.FileNotFoundException;

import org.testng.annotations.BeforeMethod;

import com.qa.base.TestBase;
import com.qa.commonutils.TestUtils;
import com.qa.pages.FlighBookingPage;
import com.qa.pages.LoginPage;

public class FlighBookingTest extends TestBase{

	LoginPage loginPage;
	FlighBookingPage flightalandingpage;
	TestUtils utils;
	public FlighBookingTest() throws FileNotFoundException {
		super();
	}
		@BeforeMethod
		public void Setup() throws FileNotFoundException {
			initialization();
			loginPage = new LoginPage();
			utils.switchToFrame();
			flightalandingpage=LoginCredValues.login();
	}
	

	
	
	
}
