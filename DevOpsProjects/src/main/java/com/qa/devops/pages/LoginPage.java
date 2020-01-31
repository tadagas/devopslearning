package com.qa.devops.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.devops.base.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {
		super();	
	}
	
	public void Initilazation() {
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * The PageFactory Class in Selenium is an extension to the Page Object design pattern. 
	 * It is used to initialize the elements of the Page Object or instantiate the Page Objects itself.
	 * 
	 */
	
		// Read all the web elements properties and its attribute values.
		// Page Factory OR: // @FindBy() - Annotation..
		@FindBy(name="q")
		WebElement name;
	
		@FindBy(xpath="//id[contains(text(),'contact_id')]")
		WebElement contact_id;
		
		
		
}
