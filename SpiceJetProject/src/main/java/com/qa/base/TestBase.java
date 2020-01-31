package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.qa.commonutils.TestUtils;
import com.qa.commonutils.WebEventListener;

public class TestBase {

	
	public static WebDriver driver;
	public static EventFiringWebDriver edriver;
	public static Properties prop;
	
	public TestBase() throws FileNotFoundException {
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
		
	public static void initialization() throws FileNotFoundException {
		String browsername= prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			ChromeDriver driver = new ChromeDriver();
		}
		
		edriver = new EventFiringWebDriver(driver);
		WebEventListener eventListner= new WebEventListener();
		
		edriver.register(eventListner);
		driver=edriver;
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.pageLoadTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.implicitlyWait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	
	
}
