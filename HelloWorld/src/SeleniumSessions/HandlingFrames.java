package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.switchTo().frame(1);
		driver.switchTo().frame("");
		driver.switchTo().parentFrame().switchTo().frame("");
		
		


		
	}

}
