package com.qa.testng.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GoogleSearchTextBox {

	WebDriver driver=null;
	
	@BeforeSuite
	public void Setup() {
		System.out.println("Application Setup and configured on Azure Env");
	}
	
	@BeforeClass
	public void ChromeBrowserLaunch() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/tadagas/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void MaximizeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test(priority=0)
	public void ApplicationLaunch() {
		
		driver.get("https://www.google.com/");
		System.out.println("To launch the Chrome Browser");
	}
	
	@Test(priority=1,groups="title")
	public void SearchForTheTitle() {
		String Applicationtitle=driver.getTitle();
		System.out.println("Application Title =" + Applicationtitle);
	}
	
	@Test(priority=2,groups="url")
	public void CurrentApplicatioUrl() {
		String currentApplicationUrl=driver.getCurrentUrl();
		System.out.println("Application Title=" + currentApplicationUrl);
	}
	
	@AfterMethod
	public void driverQuit() {
		System.out.println("driver quit");
	}
	
	@AfterClass
	public void ExecutionSucessfull() {
		driver.quit();
		System.out.println("Execution Completed Sucessfully");
	}
	
	@AfterSuite
	public void suiteexecutionOver() {
		System.out.println("Suite Execution Over");
	}
}

