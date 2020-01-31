package com.qa.page;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBaseClass;
import com.qa.utils.UtilsClass;

import junit.framework.Assert;

public class GoogleHomePage extends TestBaseClass {
	
	public GoogleHomePage() {
		super();
	}
	
		//Initializing the page objects
		public void GoogleHomePage() {
			PageFactory.initElements(driver, this);
		}
		
		

		// Page Factory OR:
		// @FindBy() - Annotation..
		@FindBy(name="q")
		WebElement name;
		
		@FindBy(xpath="//input[@name='btnK']")
		WebElement search;
		
		@FindBy (xpath="//img[@id='hplogo']")
		WebElement logo;
		
		@FindBy (xpath="//a[contains(text(),'Gmail']")
		WebElement gmail;
		
		@FindBy (xpath="//a[@class='gb_g']")
		WebElement gmaillink;
		
		
		//Actions
		public static String urlTitle() {
			return driver.getTitle();
			
		}
		
		
		
		public void clickOnEmailLink() {
			//Actions action = new Actions(driver);
			//action.moveToElement(driver.findElement(By.xpath("//a[@class='gb_g']"))).build().perform();
			//action.click();
			driver.findElement(By.xpath("//a[@class='gb_g']")).click();
			String Str=driver.getTitle();
			System.out.println(Str);
			Assert.assertEquals(Str, "gmail.com");
			boolean b2 = driver.findElement(By.xpath("//img[@class='header-logo-gmail']")).isDisplayed();
			System.out.println(b2);
			driver.findElement(By.xpath("//a[contains(text(),'']")).click();
			
		}
		
		public void SearchText() throws FileNotFoundException {
			driver.manage().timeouts().pageLoadTimeout(UtilsClass.pageLoadTimeout, TimeUnit.SECONDS);
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
