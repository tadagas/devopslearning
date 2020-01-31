package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://spicejet.com");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("highlight-addons"))).build().perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[contains(text='SpiceBiz']").click();
		
		Actions action1= new Actions(driver);
		action1.clickAndHold(driver.findElementByXPath("//input[@id='1'")).moveToElement(driver.findElementByXPath("")).release().build().perform();
		
		
		
		
		
	}

}


