package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class Webdriverlaunch {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		// To launch chrome webdriver
		// To launch greckdriver

		/*
		 * FirefoxDriver driver = new FirefoxDriver();
		 * 
		 * driver.get("http://www.google.com"); driver.manage().window().maximize();
		 * String str = driver.getCurrentUrl(); System.out.println(str);
		 */
		// Exception is expected... since grecko driver.exe file path is missing:
		// Exception in thread "main" java.lang.IllegalStateException: The path to the
		// driver executable must be set by the webdriver.gecko.driver system property;
		// for more information, see https://github.com/mozilla/geckodriver.
		// The latest version can be downloaded from
		// https://github.com/mozilla/geckodriver/releases

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

		
		
		
		
		driver.manage().window().maximize();
		String str = driver.getCurrentUrl();
		System.out.println(str);
		driver.navigate().to("http://www.yahoo.com");
		String secondurl = driver.getCurrentUrl();
		System.out.println(secondurl);
		Assert.assertEquals(secondurl, "https://in.yahoo.com/?p=us");
		System.out.println("First Webdriver program");
		String source = driver.getPageSource();
		System.out.println(source);
		if (secondurl.equals("https://in.yahoo.com/?p=us")) {
			System.out.println("Correct title");
		} else {
			System.out.println("Incorrect title");
		}
		driver.quit();

	}

}
