package main.StepDefinations;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;


public class LoginStepDefination {

	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() {
		WebDriver driver= new ChromeDriver();
		driver.get("");
		WebElement loginButton=driver.findElement(By.name("button"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[].click();".loginButton);
		Assert.assertEquals(true, true);
		
	}
	
	@And("^some other precondition$")
	public void some_other_precondition() {
		
	}
	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes(String username, String password){
		driver.findElement(By.id("abc")).sendKeys(Keys.valueOf("abc"));
		
	}
	
	
	
}
