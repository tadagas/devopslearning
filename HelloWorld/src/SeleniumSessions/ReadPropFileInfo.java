package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropFileInfo {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = null;
		Properties prep= new Properties();
		
		FileInputStream it= new FileInputStream("D:/1-Projects/IT-Int/Pending Tasks/HelloWorld/src/SeleniumSessions/config.properties");
		
		prep.load(it);
		System.out.println(prep.getProperty("url"));
		System.out.println(prep.getProperty("Application_url"));
		System.out.println(prep.getProperty("browser"));
		System.out.println(prep.getProperty("age"));
		System.out.println(prep.getProperty("name"));
		
		String browserName= prep.getProperty("browser");
		String urlname= prep.getProperty("url");
		
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
			System.out.println("Successfully launched");
		}else
		{
			System.out.println("Browser didnt Launched sucessfully");
		}
		driver.get(urlname);
		driver.findElement(By.id(prep.getProperty("first_id"))).sendKeys(prep.getProperty("First_Name"));
		driver.findElement(By.id(prep.getProperty("last_id"))).sendKeys(prep.getProperty("Last_Name"));
	
		driver.quit();
	}

}
