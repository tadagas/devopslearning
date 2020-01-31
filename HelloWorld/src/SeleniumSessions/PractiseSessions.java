package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PractiseSessions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.navigate().to("https://www.spicejet.com/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("highlight-book")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("Mangaluru (IXE)");
		
		//	Select sel1=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")));
		//sel1.selectByIndex(1);
		//	Thread.sleep(3000);
		//	sel1.selectByValue("ATQ");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("Vishakhapatnam (VTZ)");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).sendKeys("3");
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_ddl_Child")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_Child")).sendKeys("1");
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_ddl_Infant")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_Infant")).sendKeys("1");
		Thread.sleep(3000);
		Select sel1=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		sel1.selectByValue("USD");
		//driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).sendKeys("INR");
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
	}
}
