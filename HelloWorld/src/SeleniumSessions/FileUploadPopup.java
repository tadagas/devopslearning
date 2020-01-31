package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {

		// Java script pop-up -- Java Alert API(accept, dismiss)
		// File upload pop-up -- type-file, sendKeys(path)
		// Browser Window pop-up and advertisement pop-up window.(WindowHandler API -
		// getWindowHandler())

		ChromeDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://html.com/input-type-file/");

		// driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		// driver.findElementByXPath("//a[@class='pm-cta pm-allow']").click();

		// type='file' required.

		driver.findElementById("fileupload").sendKeys("C:/Users/tadagas/Desktop/COURT CASES.txt");
		driver.findElementById("submit").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[@class='pm-cta pm-allow']").click();
	}

}
