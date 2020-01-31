package SeleniumSessions;

import java.util.*;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchUsingDynamicXpath {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Dynamic Search:
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java");
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
			System.out.println(list.size());
			
			for (int i=0; i<list.size(); i++) {
				System.out.println(list.get(i).getText());
				if(list.get(i).getText().contains("javascript")) {
					list.get(i).click();
					break;
				}
			
			}
	}
	
}	

