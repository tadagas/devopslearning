package com.qa.page.learningcurve;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPracticeTwo {

static WebDriver driver;
	
	@BeforeMethod
	public void BrowserSetUp() {
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.google.com");

	}
	@Test
	public void NavigateToOtherUrl() {
		driver.navigate().to("http://www.gmail.com");
	}
	
	@Test
	public void OpenNewTab() {
		
	}
	
	@Test
	public void getTitle() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}
	
	@Test
	public void getPageSource() {
		m
		
		
		
		
		
		
		\7
		String source=driver.getPageSource();
		System.out.println(source);
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

