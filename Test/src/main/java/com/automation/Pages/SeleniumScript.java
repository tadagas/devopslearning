package com.automation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumScript {

	public static void main(String[] args) {


		WebDriver driver= new ChromeDriver();
		
		driver.get("https://mail.google.com");
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		
		
	}

}
