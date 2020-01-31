package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class BootStrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		//Mandtory Options
		// 1. Chrome version should be greather than 59 on mac and 60 on windows
		// 2. window-size=1400,800
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.navigate().to("https://www.jquery-az.com/");
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
		WebElement linkByText = driver.findElement(By.linkText("Web Elements"));
		linkByText.click();
		System.out.println(linkByText.getSize());
		List<WebElement> list= driver.findElements(By.xpath("//ul[@id='menu-top-header-menu-1']//child::li[@id='menu-item-7092']//ul[@class='sub-menu']//child::li[a]"));
		//List<WebElement> list= driver.findElements(By.xpath("//ul[@id='menu-top-header-menu-1']//child::li[@id='menu-item-7092']//child::ul//child::li"));
		
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i).getText());
		
		driver.findElement(By.xpath("//ul[@id='menu-top-header-menu-1']//following::a[@href='/tag/animations/']")).click();
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//ul[@id='menu-top-header-menu-1']//following::a[@href='/tag/animations/']"))).click();
	Thread.sleep(5000);
		
		
	}
}
