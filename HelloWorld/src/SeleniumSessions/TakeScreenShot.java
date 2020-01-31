package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TakeScreenShot {

	private static final OutputType Output = null;

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

		driver.manage().window().maximize();
		String str = driver.getCurrentUrl();
		System.out.println(str);
		
		File src1=driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("D:/1-Projects/IT-Int/Pending Tasks/HelloWorld/src/SeleniumSessions/google12.png"));
	}
		public void screenshot() throws IOException {
			WebDriver driver1 = null;
			
		//To take a screen shot and store the file on src object reference.
		//File src= new File(toString());
		//Now copy the screen shot to desired location using copyFile//Method.
		//FileUtils.copyFile(src, new File("D:/1-Projects/IT-Int/Pending Tasks/HelloWorld/src/SeleniumSessions/google1.png"));
		//driver.quit();
	}

}
