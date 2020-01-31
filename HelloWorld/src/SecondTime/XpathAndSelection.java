package SecondTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathAndSelection {

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
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(1000);
		Select sel= new Select(driver.findElement(By.xpath("//div[@id='divpaxinfo']//following::select[@name='ctl00$mainContent$ddl_Adult']")));
		sel.selectByIndex(5);
		
		Select sel1= new Select(driver.findElement(By.xpath("//div[@id='divpaxinfo']//following::select[@name='ctl00$mainContent$ddl_Child']")));
		sel1.selectByIndex(2);
		
		Select sel2= new Select(driver.findElement(By.xpath("//div[@id='divpaxinfo']//following::select[@name='ctl00$mainContent$ddl_Infant']")));
		sel2.selectByIndex(1);
		
		
		//Date picker is pending
		String day="18";
		String month="10";
		String year="2020";
		String text="-";
		
		driver.quit();
		
		
		
	}

}
