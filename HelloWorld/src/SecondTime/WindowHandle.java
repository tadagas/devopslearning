package SecondTime;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/tadagas/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.tagName("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[1]/b/a")).click();
		String WindowHandle=driver.getWindowHandle();
		Set<String> AllWindows=driver.getWindowHandles();
		System.out.println(AllWindows);
		
	//	Iterator<String> it=WindowHandle.iterator();
		
	//			String parent= it.next();
		System.out.println(WindowHandle);
		
	}
	
	private static Iterator<String> Iterator1() {
		// TODO Auto-generated method stub
		return null;
	}

}
