package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;





public class HandleWindowPopup {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Handling window pop-up for child and parent window on the browser. 
		Set<String> handler= driver.getWindowHandles();
		 
		Iterator<String> it= handler.iterator();
		
		String ParentWindow=it.next();
		System.out.println("ParentWindow ID" + ParentWindow);
		
		String ChildWindow=it.next();
		System.out.println("ParentWindow ID" + ChildWindow);
		
		driver.switchTo().window(ChildWindow);
		System.out.println("" + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(ParentWindow);
		System.out.println("" + driver.getTitle());
		driver.close();
		
		driver.quit();
	}

}
