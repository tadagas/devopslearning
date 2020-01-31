package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationFromSourceToDestination {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

		driver.manage().window().maximize();
		String str = driver.getCurrentUrl();
		System.out.println(str);
		driver.navigate().to("http://www.yahoo.com");
		String secondurl = driver.getCurrentUrl();
		
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.navigate().forward();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.navigate().back();
		driver.navigate().refresh();
		System.out.println("Test Execution Sucessfull");
		
		driver.quit();
	}

}
