package com.qa.testng.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgDataProvider {

	WebDriver driver;
	
	
	@BeforeMethod
	public void Setup() {
		System.out.println("Application Setup and configured on Azure Env");
	}
	//https://www.youtube.com/watch?v=uatGjMOapK8&list=PLFGoYjJG_fqp25buwscrsKA5q8qsLsuUy&index=4&ab_channel=NaveenAutomationLabs
	@Test(dataProvider="getdata")
	@Parameters({"url","emailId"})
	public void GmailLogin() {
		driver= new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
	}
		@DataProvider
		public void getdata(String username, String password) {
		driver.findElement(By.name("")).clear();
		driver.findElement(By.xpath("")).sendKeys();
		driver.findElement(By.xpath("")).click();
		
	}
		
		@DataProvider
		public void getTestdataexcel(){
			
		}
		
		public ListIterator<Object> getTestdata(){
			ArrayList<Object> testdata=Testutil.getDataFromExcel();
			return testdata.listIterator();
			
		}
		
}
