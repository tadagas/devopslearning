package com.qa.pages;



import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {
	

	public LoginPage() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}

	// Page Factory OR:
	// @FindBy() - Annotation..
	@FindBy(name="username")
	WebElement username;

	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@id='submit']")
	WebElement submit;
	


	//Initializing the page objects
	public void LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions
	public static String LoginPagegettitle() {
		return driver.getTitle();
		
	}

	public boolean logoCapture() {
		return submit.isDisplayed();
		
	}

	public FlighBookingPage LoginCredValues() throws FileNotFoundException {
		username.sendKeys("shiva");
		password.sendKeys("Admin123");
		submit.click();
		return new FlighBookingPage();
	}
}
