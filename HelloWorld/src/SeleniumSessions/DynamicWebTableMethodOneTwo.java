package SeleniumSessions;

import java.awt.TextArea;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;

public class DynamicWebTableMethodOneTwo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.orangehrm.com/open-source/demo/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@start-with(@id,'test_1_')]")).click();
		
		//Method -1
		String before_xpath="//input[@tabindex='19']/table/tr[";
		String After_xpath="]/td[2]/a";
		
		for (int i=4; i<=7; i++) {
			String name=driver.findElement(By.xpath(before_xpath +i+After_xpath)).getText();
			System.out.println(name);
			
			if(name.contains("test124")) {
				driver.findElement(By.xpath("//input[@tabindex='19']/table/tr[" +i+ "]/td[2]/a")).click();
				
			}
		}
		
		// Method 2 Customized xpath:
		
		driver.findElement(By.xpath("//a[contains(text(),'test2 test2')]/parent::td//preceding-sibiling::td/input[@name='contact_id']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'ui ui')]/parent::td//preceding-sibiling::td/input[@name='contact_id']")).click();
		
		
		String begin="//input[starts-with(text(),'test_')]";
		String end="//input[end-with(text(),'_test')]";
		
		for(int i=4; i<7;i++) {
			String tablevalue=driver.findElement(By.xpath("begin"+i+"end")).getText();
			System.out.println(tablevalue);
			if(tablevalue.equals("shiva")) {
				driver.findElement(By.id("//input[@tabindex='19']/table/tr[\" +i+ \"]/td[2]/a\")")).click();
			}
		}
		
		
		
	
		
		
		
		
				
		
	}

}
