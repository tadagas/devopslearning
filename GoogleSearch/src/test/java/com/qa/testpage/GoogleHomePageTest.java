package com.qa.testpage;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBaseClass;
import com.qa.page.GoogleHomePage;
import com.qa.utils.UtilsClass;

public class GoogleHomePageTest extends TestBaseClass{


	GoogleHomePage googlehomepage;
	GoogleSearchResultPageTest googlesearchPage;
	UtilsClass utilsclass;
	
	public GoogleHomePageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void Setup() throws FileNotFoundException {
		initilazation();
		utilsclass= new UtilsClass();
		googlehomepage = new GoogleHomePage();
	}
	
	@Test(priority=1)
	public void GetTilePage() {
		String title=GoogleHomePage.urlTitle();
		Assert.assertEquals(title, "Google");
		
	}
	@Test(priority=2)
	public void logoCaptureUrl() {
	}
	
	
	@DataProvider
	public void getData(String sheetName) {
		
	}
	
	@Test(priority=3)
	public void clickOnEmailLink() {
		
	return;
	}
	
	
	@Test(priority=4)
	public void searchresult() throws FileNotFoundException {
		googlehomepage.SearchText();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	
}
