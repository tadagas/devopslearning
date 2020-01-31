package com.qa.devops.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import com.qa.devops.utils.CommonUtils;

import org.openqa.selenium.WebDriver;

	
	

public class BaseClass {

	
	public static WebDriver driver;
	public static Properties prop;
	
	public void properties() throws IOException {
		Properties prop = new Properties();
		FileInputStream inputfile = new FileInputStream("D:\\1-Projects\\IT-Int\\Pending Tasks\\DevOpsProjects\\src\\main\\java\\com\\qa\\devops\\config\\configproperties");
		try {
			prop.load(inputfile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		}
	
	public void initilazationOnBrowser() {
		ChromeDriver driver= new ChromeDriver();
		String browsername= prop.getProperty("browser");
		if(browsername.equals("chrome")){
			System.out.println("Chrome");
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(CommonUtils.pageloadtimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(CommonUtils.implicitwait, TimeUnit.SECONDS);
		driver.get("url");
	}
}


