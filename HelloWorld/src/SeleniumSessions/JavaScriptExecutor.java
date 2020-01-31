package SeleniumSessions;

import java.io.File;
import java.nio.channels.InterruptedByTimeoutException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		// https://www.youtube.com/watch?v=Dpx1Q62QpFU&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=14
		// QTP Highlight the element. using flash we can over come this problem...

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.navigate().to("http://www.freecrm.com");
		
		//WebElement loginbtn = driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("shiva");
		
		//flash(loginbtn, driver);
		
		File src=driver.getScreenshotAs(OutputType.FILE);
		
	}

	public static void flash(WebElement element, WebDriver driver) {
		JavaScriptExecutor js = ((JavaScriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 10; i++) {
		//	changeColor("rgb(0,200.0")",element.driver); // red green blue"
		//	changeColor(bgcolor, element, driver);
		}

	}

	public static void changeColor(String color, WebElement element, WebDriver driver) throws InterruptedException {
		JavaScriptExecutor js = ((JavaScriptExecutor) driver);
		((JavascriptExecutor) js).executeScript("arguments[0].style.backgroundColor= ='" + color + "'", element);
		try {
			Thread.sleep(2000);

		} catch (InterruptedException e) {

		}

	}

}
