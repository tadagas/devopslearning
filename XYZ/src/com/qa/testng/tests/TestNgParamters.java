package com.qa.testng.tests;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;



public class TestNgParamters {
	
	WebDriver driver;

	/*	
	<parameter name="url" value="http://www.yahoo.com/"/>
	<parameter name="emailId" value="http://www.yahoo.com/"/>
	
	<classes>
		<class name="TestNgParamters"/>
	</classes>
*/
	@Test
	@Parameters({"url","emailId"})
	public void GmailLogin(String url, String emailID) {
		driver= new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("")).clear();
		driver.findElement(By.xpath("")).sendKeys(emailID);
		driver.findElement(By.xpath("")).click();
		
		
	}
}
