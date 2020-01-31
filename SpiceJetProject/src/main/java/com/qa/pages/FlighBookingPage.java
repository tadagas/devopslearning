package com.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class FlighBookingPage extends TestBase {

	@FindBy(xpath = "//td[contains(text(),'shiva k')]")
	WebElement Loginuserlabel;

	@FindBy(xpath = "//a[contains(text(),'Task')]")
	WebElement tasks;

	public FlighBookingPage() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}

	// Initializing the page objects
	public void FlighBookingPage() {
		PageFactory.initElements(driver, this);

	}
	
	public String VerifyTheTitle() {
		return driver.getTitle();
		
	}

}
