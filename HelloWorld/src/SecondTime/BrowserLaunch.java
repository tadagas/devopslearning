package SecondTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BrowserLaunch {


	public static void main(String[] args) throws InterruptedException {

		
	System.setProperty("webdriver.chrome.driver", "C:/Users/tadagas/Downloads/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().fullscreen();
	int str= driver.manage().window().hashCode();
	System.out.println(str);
	
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	
	String title=driver.getTitle();
	String url=driver.getCurrentUrl();
	
	System.out.println(title);
	System.out.println(url);
	
	Assert.assertEquals(title, "Google");
	Assert.assertEquals(url, "https://www.google.com/");
	
	System.out.println(driver.getPageSource());
	//driver.getKeyboard();
	Thread.sleep(5000);
	
	driver.get("https://www.spicejet.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
	Thread.sleep(1000);
	Select sel= new Select(driver.findElement(By.xpath("//div[@id='divpaxinfo']//following::select[@name='ctl00$mainContent$ddl_Adult']")));
	sel.selectByIndex(5);
	
	Select sel1= new Select(driver.findElement(By.xpath("//div[@id='divpaxinfo']//following::select[@name='ctl00$mainContent$ddl_Child']")));
	sel1.selectByIndex(5);
	
	Select sel2= new Select(driver.findElement(By.xpath("//div[@id='divpaxinfo']//following::select[@name='ctl00$mainContent$ddl_Infant']")));
	sel2.selectByIndex(1);
	
	//driver.close();
	//driver.quit();
	
	//WebDriver driver1= new SafariDriver();
	
	
	
	
	
	
	}

}
