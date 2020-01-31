package com.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearchTest {


	WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://www.google.com/");
		

	}

	@Test(priority=1)
	public void SearchKeyword() {
		String title=driver.getTitle();
		System.out.println("Google is successfull-"+ title);
	
	}
	
	@Test(priority=2)
	public void Boolean() {
		String title1=driver.getTitle();
		Assert.assertEquals(title1, "Google");
		System.out.println("Google is successfull-"+ title1);
	}
	
	@Test(priority=3)
	public void String() {
		String boolean1=driver.getCurrentUrl();
		System.out.println("Google is successfull-");
		Assert.assertEquals(boolean1, "https://www.google.com/?gws_rd=ssl");
	}
	
	@Test(priority=4)
	public void String1() {
		System.out.println("Google is successfull-");
	}
	
	//@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();

	}
}
