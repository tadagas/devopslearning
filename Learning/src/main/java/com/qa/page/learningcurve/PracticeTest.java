package com.qa.page.learningcurve;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest {

	WebDriver driver;
	
	public static void main(String[] args) {
		
		
	}
		public void SetUp(){
		System.setProperty("WebDriver.chrome driver", "D:/1-Projects/IT-Int/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		System.out.println("print");
		
	}
		
		public void openNewTab() {
			  ((JavascriptExecutor) driver).executeScript("window.open('about:blank','_blank');");
			 }
		
		public void testOpenGmail() {
				openNewTab();
			  driver.get("http://www.gmail.com");
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 }

	
}
