package com.qa.testcasepages;



import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.FlighBookingPage;
import com.qa.pages.LoginPage;

public class LoginTest extends TestBase{

	LoginPage loginPage;
	FlighBookingPage flighBookingPage;
	
	public LoginTestPage() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void Setup() throws FileNotFoundException {
		initialization();
		LoginPage loginpage= new LoginPage();
	}
	
	@Test(priority=1)
	public void GetTilePage() {
		String title=LoginPage.LoginPagegettitle();
		Assert.assertEquals(title, "Test Correct");
		
	}
	@Test(priority=2)
	public void LoginTest() {
		flighBookingPage=LoginCredValues(prop.getProperty("username"),prop.getProperty("password"));
	}
	

	

	private FlighBookingPage LoginCredValues(String property, String property2) {
		// TODO Auto-generated method stub
		return null;
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

