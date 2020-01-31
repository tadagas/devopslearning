package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupAlert {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		// driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);

		driver.findElementByName("proceed").click();

		Thread.sleep(5000);
		// Java Alert
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		String str = alert.getText();

		// Check the error message
		if (str.equals("Please enter a valid user name")) {
			System.out.println("Correct error message");
		} else {
			System.out.println("Invalid error message");
		}
		alert.accept();
		driver.quit();

	}

}
