package SecondTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/tadagas/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		int str= driver.manage().window().hashCode();
		System.out.println(str);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		Thread.sleep(2000);
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		driver.findElement(By.name("login")).sendKeys("shiva1903");
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		
		Thread.sleep(5000);
		Alert aler= driver.switchTo().alert();
		//System.out.println(alert1.getText());
		aler.accept();
		
		driver.quit();
	}

}
