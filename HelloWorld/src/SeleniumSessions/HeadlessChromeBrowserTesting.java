package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeBrowserTesting {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options= new ChromeOptions();
		//options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
		
		

	}

}
