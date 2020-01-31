package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibleText {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// IsDisplayed() method i Applicable for all the elements:
		boolean b1= driver.findElement(By.id("u_0_14")).isDisplayed();
		System.out.println(b1); // false
		
		driver.findElement(By.id("email")).sendKeys("shiva1903@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456");
		//driver.findElement(By.id("u_0_14")).click();
		boolean b2= driver.findElement(By.id("u_0_14")).isDisplayed();
		System.out.println(b2); // true
		
		// IsEnabled:
		boolean b3= driver.findElement(By.id("u_0_14")).isEnabled();
		System.out.println(b3); // true
		
		
		//IsSelected: checkbox, radio button , dropdown selected..
		driver.findElement(By.id("u_0_9")).click();
		boolean b23=driver.findElement(By.id("u_0_9")).isSelected();
		System.out.println(b23);
		
		driver.findElement(By.id("u_0_9")).click();
		boolean b33=driver.findElement(By.id("u_0_9")).isSelected();
		System.out.println(b33);
	}

}
