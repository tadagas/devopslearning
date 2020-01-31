package SecondTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/tadagas/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		int str= driver.manage().window().hashCode();
		System.out.println(str);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.switchTo().frame("//iframe[@id='destination_publishing_iframe_spicejet_0']");
		driver.findElement(By.xpath("//select[@name='ctl00_mainContent_ddl_destinationStation1']")).sendKeys("BNG");
		
	}

}
