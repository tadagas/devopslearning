package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDownSelection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.orangehrm.com/open-source/demo/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//Drop down selection
		//driver.findElementById("Form_submitRequest_Country").sendKeys("India");
		driver.findElementById("Form_submitRequest_Industry").sendKeys("Aerospace");
		driver.findElementById("Form_submitRequest_NoOfEmployees").sendKeys("0 - 10");
		
		Select sel= new Select(driver.findElementById("Form_submitRequest_Country"));
		sel.selectByVisibleText("Iceland");
		sel.selectByValue("India");
		
		driver.findElementByName("FirstName").sendKeys("shiva");
		driver.findElementByName("LastName").sendKeys("kumar");
		driver.findElementByName("CompanyName").sendKeys("spiderlogic");
		driver.findElementByName("Email").sendKeys("stadaga@spiderlogic.com");
		driver.findElementByName("JobTitle").sendKeys("JobTitle");
		driver.findElement(By.linkText("Accept Cookies")).click();
		driver.findElementById("Form_submitRequest_action_submitRequest").click();
		Thread.sleep(2000);
		//findElementByXPath("//input[@name='action_submitRequest' and @id='Form_submitRequest_action_submitRequest']").click();
		
		//driver.findElementById("Form_submitRequest_action_submitRequest").click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
/*		//Select sel= new Select(driver.findElementById("Form_submitRequest_Country"));
		//sel.selectByVisibleText("India");
		driver.findElementById("FirstName").sendKeys("shiva");
		driver.findElementById("LastName").sendKeys("kumar");
		driver.findElementById("CompanyName").sendKeys("kumar");
		driver.findElementById("email").sendKeys("stadaga@spiderlogic.com");
		driver.findElementById("JobTitle").sendKeys("Consultant");
		//driver.findElementById("Form_submitRequest_Industry").sendKeys("Aerospace");
		driver.findElementById("ppaFormSbtBtn").click();
		
		driver.findElementById("Form_submitRequest_Country").sendKeys("India");
		//Select sel= new Select(driver.findElementById("Form_submitRequest_Country"));
		//sel.selectByVisibleText("India");
		//WebDriverWait wait=new WebDriverWait(driver.findElementById("ppaFormSbtBtn"));
		//
		//String eTitle = "Demo Guru99 Page";
		//String aTitle = "" ;
		//driver.manage().timeouts().e
	
		if(url.equals("https://www.orangehrm.com/open-source/demo/")) {
			System.out.println("title is coreect");
		}else
		{
			System.out.println("title is in-coreect");
		}
	*/	
		
		driver.quit();
		
	}

}
