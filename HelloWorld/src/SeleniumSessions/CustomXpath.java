package SeleniumSessions;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class CustomXpath {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		
		driver.findElement(By.xpath("//a[@class='gb_g']")).click();
		String Str=driver.getTitle();
		System.out.println(Str);
		//Assert.assertEquals(Str, "Gmail - Email from Google");
		boolean b2 = driver.findElement(By.xpath("//img[@class='header-logo-gmail']")).isDisplayed();
		System.out.println(b2);
		//boolean b21 = driver.findElement(By.xpath("//img[@class='header-logo-gmail']")).isDisplayed();
		//System.out.println(b21);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@ga-event-label='nav']")).click();
		
		
		
		//Different xpath:
		//driver.findElementByXPath("//input[@id='twotabsearchtextbox']").sendKeys("Mobile");
		//driver.findElementByXPath("//input[@class='nav-input']").sendKeys("Mobile-OnePlus");
		//driver.findElementByXPath("//input[@name='field-keywords']").sendKeys("Mobile-OnePlus7");
		//driver.findElementByXPath("//input[@tabindex='19']").sendKeys("Mobile-OnePlus7 pro");
		//driver.findElementByXPath("//input[@type='text']").sendKeys("Mobile-OnePlus");
		//driver.findElementByXPath("//input[contains(@id,'twotabsearchtextbox')]").sendKeys("Mobile-OnePlusone"); 
		
		//Dynamic ids
		driver.findElementByXPath("//input[starts_with(@id,'test_')]").sendKeys("test");
		driver.findElementByXPath("//input[ends-with(@id,'_test_t')]").sendKeys("test");
		
		System.out.println("Xpath is correct and navigate to current node");
		
		// for Links using xpath:
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		
		List<WebElement> buttons= driver.findElements(By.tagName("buttons"));
		//buttons.size();
		System.out.println(buttons.size());
	
		List<WebElement> input= driver.findElements(By.tagName("input"));
		//input.size();
		System.out.println(input.size());
		
		List<WebElement> linklist= driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		
		for(int i=0; i<=linklist.size(); i++) {
			String gettext=linklist.get(i).getText();
			System.out.println(gettext);
		}
		
		driver.quit();
	}

}
