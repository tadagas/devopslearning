package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWait {

	private static WebDriver keyboard;

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Actions action= new Actions(driver);
		Actions action1= new Actions(keyboard);
		action.click(driver.findElementById("//a[@id=\"highlight-addons\"]")).click();
		
		//action.clickAndHold(driver.findElementById("//a[@id=\"highlight-addons\"]")).moveToElement(driver.findElementById("//a[contains(text(),'SpiceBiz')]")).click();
		
		
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("xyz")) {
			System.out.println("title is coreect");
		}
		System.out.println("Test Execution is sucessful");
		
	}

}
