package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeadlessBrowserTesting {

	public static void main(String[] args) {
		
		
		//ChromeDriver driver = new ChromeDriver();
		
		// htmlunitdriver is not available in selenium 3.0 version
		// htmlunitdriver -- to use this concept, we have to download htmlunitdriver JAR file..
		
		// 1. Execution is very fast and no browser is required to run the script.
		// 2. Actions class not suitable like drag and drop...
		// 3. Ghost driver-- Headless browser.
				// HtmlUnitDriver --Java 
		
		WebDriver driver= new HtmlUnitDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
		System.out.println("Before the url= "+driver.getTitle());
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.navigate().to("http://www.yahoo.com");
		System.out.println("after the url= "+driver.getTitle());
		
		driver.quit();
	}

	

}
