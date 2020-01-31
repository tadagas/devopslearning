package com.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.base.TestBaseClass;

public class GoogleSearchResultPage extends TestBaseClass {


	// Page Factory OR:
	// @FindBy() - Annotation..
	@FindBy(name="searchtext")
	WebElement username;
	
	@FindBy(xpath="//input[@id='submit']")
	WebElement submit;
	

	public void SearchResult() {
		return;
	}
}
