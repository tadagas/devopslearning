package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LaunchBrowserUrl {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/open-source/demo/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);		
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("xyz")) {
			System.out.println("title is coreect");
		}
		
		//WebDriverWait wait=new WebDriverWait(driver.findElementById("ppaFormSbtBtn"));
		//
		//String eTitle = "Demo Guru99 Page";
		//String aTitle = "" ;
		//driver.manage().timeouts().e
	
		
		driver.findElementById("firstname").sendKeys("shiva");
		driver.findElementById("lastname").sendKeys("kumar");		
		driver.findElementById("email").sendKeys("stadaga@spiderlogic.com");
		driver.findElementById("PASSWORD").sendKeys("shamith1310!");
		driver.findElementByName("checkbox-default").click();
		driver.findElementById("ppaFormSbtBtn").click();
		
		
		try {
			driver.wait(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
		
	}

}
