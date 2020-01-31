package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathMaster {

	public static void main(String[] args) {
	
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='gb_g']")).click();
	
		
	
		driver.findElement(By.name("q")).sendKeys("Lord SHIVA");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("btnK")).sendKeys("Lord SHIVA");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='gb_D']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='gb_4 gb_5 gb_ae gb_Wc']")).click();

		System.out.println("Test Successfully executed");
		
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Lord SHIVA");
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		list.size();
	
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.size());
			
			String gettext=list.get(i).getText();
			System.out.println(gettext);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			if(list.get(i).getText().contains("lord shiva images")) {
				System.out.println(list.get(i).getText());
				list.get(i).click();
				break;
			
		
		}
			
			
			
		}
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.navigate().to("https://www.spicejet.com/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("highlight-book")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
		driver.findElement(By.xpath("//a[@value='IXE']")).sendKeys("Mangaluru (IXE)");
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")).click();
		driver.findElement(By.xpath("//a[@value='VTZ']")).sendKeys("Vishakhapatnam (VTZ)");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	//	custom.
		Select sel = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		sel.selectByValue("");
	}
}

