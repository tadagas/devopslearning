package com.qa.page.learningcurve;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeTestOne {

	static WebDriver driver;
	
	@BeforeMethod
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.google.com");

	}
	
	@Test
	public void getTitle() {
		driver.getTitle();
	}
	
	@Test
	public void getPageSource() {
		driver.getPageSource();
	}
	@Test
	public void BrowserClose() {
		driver.close();
	}
	@Test
	public void driverInstanceClose() {
		driver.quit();
	}
	
	@AfterMethod
	public void sucessfullExecution() {
		
	}
}
