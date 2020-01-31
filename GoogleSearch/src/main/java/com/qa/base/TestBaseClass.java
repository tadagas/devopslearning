package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.utils.UtilsClass;

public class TestBaseClass {

	public static WebDriver driver;
	public static Properties prop;
	
	public void prop() {
		try {
			Properties prop= new Properties();
			FileInputStream it= new FileInputStream("D:/1-Projects/IT-Int/Pending Tasks/HelloWorld/src/SeleniumSessions/config.properties");
			prop.load(it);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
		
	}
	
	public void initilazation() {
		//String browsername= prop.getProperty("browser");
		//if(browsername.equals("chrome")) {
			 driver = new ChromeDriver();
		//}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(UtilsClass.pageLoadTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(UtilsClass.implicitlyWait, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		
	}
}
