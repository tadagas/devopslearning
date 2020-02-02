package SecondTime;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/tadagas/Downloads/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		// Take screen shot
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);   
		FileHandler.copy(source, new File("D:/Study/PendingTasks/HelloWorld/test-output/1.png"));
		
		// Handle window pop-up on Browser 
		
		WindowHandle window = new WindowHandle();
		window.
		driver.switchTo().parentFrame();
		
		
		
		
		
		
		
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
