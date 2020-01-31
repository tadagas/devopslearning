package SecondTime;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseMovementAction {

	public static void main(String[] args) throws InterruptedException, Throwable {
		System.setProperty("webdriver.chrome.driver", "C:/Users/tadagas/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		int str= driver.manage().window().hashCode();
		System.out.println(str);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		File filesrc= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(filesrc, new File("D:/1-Projects/IT-Int/Pending Tasks/HelloWorld/screenshot"));
		
		Actions action= new Actions(driver);
				action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Add-Ons')]"))).build().perform();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//a[contains(text(),'International Connection Baggage')]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//a[contains(text(),'Book')]")).click();
				Thread.sleep(5000);
				Actions action1= new Actions(driver);
				action1.moveToElement(driver.findElement(By.xpath("//a[@title='Hotels']"))).build().perform();
				action1.click();
				Thread.sleep(5000);
				driver.findElement(By.id("ctl00_mainContent_txtOriginStation1_MST")).sendKeys("Mangalore");
				Thread.sleep(5000);
				
		
		
	}

}
