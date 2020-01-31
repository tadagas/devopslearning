package SeleniumSessions;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseSessionTwo {

	public static void main(String[] args) throws InterruptedException {
		
	ChromeDriver driver = new ChromeDriver();
	
	
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("http://www.google.com");
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java");
	Thread.sleep(2000);
	
	List<WebElement> link=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	//descendent means child of li...
	
	System.out.println(link.size());
	for(int j = 0;j<link.size(); j++) {
	String t1=link.get(j).getText();
	System.out.println(t1);
	
	
	if(t1.equals("java tutorial")) {
		link.get(j).click();
		break;
	}
	}
	
	String window = null;
	driver.switchTo().window(window);
	
	Set<String> windows = driver.getWindowHandles(); 
	System.out.println(windows); 
	System.out.println("a1"); 
	for (String window1 : windows) {
		
	}

	
	driver.navigate().to("https://wipflidev.crm.dynamics.com/");
	
	
	List<WebElement> links=driver.findElementsByTagName("a");
	System.out.println(links.size());
	
	for(int i=0; i<links.size(); i++) {
		String anchor= links.get(i).getText();
		System.out.println(anchor);
	}
	
	driver.manage().window().maximize();
	String url=driver.getCurrentUrl();
	System.out.println(url);
	String title=driver.getTitle();
	System.out.println(title);
	driver.findElement(By.id("i0116")).sendKeys("stadaga@spiderlogic.com");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	boolean el=driver.findElement(By.xpath("//input[@id='idSIButton9']//parent::div[@class='inline-block']")).isEnabled();
	el=true;
	System.out.println(el);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='idSIButton9']//parent::div[@class='inline-block']")).click();

	// Handling the Java pop-up window.
	// on Alert can not initiate the object...
	Alert alert = driver.switchTo().alert();
	alert.sendKeys("stadaga@spiderlogic.com");
	alert.sendKeys("Rajappa90!");
	alert.accept();
	Thread.sleep(2000);
	
	
	

	//input[@id='idSIButton9']//parent::div[@class='inline-block']//preceding::div[@class='']
	//Alert alert= driver.findElement(By.id(id))
	
		
	}

}
