package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitExplicit {

	public static void main(String[] args) {
		WebDriver d = null;
		
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Create webdriverwait object
		WebDriverWait w = new WebDriverWait(d, 20);

		// Add the expected condition.
		WebElement e = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

	}

}
