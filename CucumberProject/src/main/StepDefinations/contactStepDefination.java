package main.StepDefinations;

import java.awt.List;
import java.io.*;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

public class contactStepDefination {

	public WebDriver driver;
	
	//Data table with maps : for Parameterization of test cases.
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() {
		driver = new ChromeDriver();
		driver.get("");
		WebElement loginButton=driver.findElement(By.name("button"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[].click();".loginButton);
		Assert.assertEquals(true, true);
		
	}
	
	@And("^some other precondition$")
	public void some_other_precondition(DataTable credentials) {
		List<String> data =credentials.row();
		driver.findElement(By.id("userid")).sendkeys(data.get(0).get(0));
		driver.findElement(By.id("userid")).sendkeys(data.get(0).get(1));
		driver.findElement(By.id("userid")).sendkeys(data.get(0).get(2));
		driver.findElement(By.id("userid")).sendkeys(data.get(0).get(3));
		
	}
	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes(String username, String password){
		List<List<String>> contactdata =contactdata.raw();
		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("abc")).sendKeys(Keys.valueOf("abc"));
		driver.findElement(By.id("abc")).sendKeys(Keys.valueOf("abc"));
		driver.findElement(By.id("abc")).sendKeys(Keys.valueOf("abc"));
		
	}
	
	@Then("^I validate the inputs$")
	public void i_validate_the_inputs(String username, String password,DataTable contactdata){
		
		
		for(Map<String, String>contact : contactdata.asMaps(String.class, String.class));{
			driver.findElement(By.id("name")).click();
			driver.findElement(By.id("abc")).sendKeys(Keys.valueOf("abc"));
			driver.findElement(By.id("abc")).sendKeys(Keys.valueOf("abc"));
			driver.findElement(By.id("abc")).sendKeys(Keys.valueOf("abc"));
			driver.findElement(By.id("submit")).click();
			
			//Move to element on new deal page or main menu items.
			Actions action= new Actions(driver);
			action.moveToElement(driver.findElement(By.id("deals"))).build().perform();
			driver.findElement(By.xpath("//class(contains[id,'xyz']")).click();
			
			
			
		}
	}
}
