package SeleniumSessions;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Screen;

public class YoutubeImageClass {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.navigate().to("https://www.youtube.com/");
		String title=driver.getTitle();
		System.out.println(title);

		//create the object of screen class -sikuli
		Screen s= new Screen();
		//https://www.youtube.com/watch?v=OtQAMoXYqes&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=22
		//Settings:
		//IN How to use Selenium with Sikuli (Automate Flash Objects)
	/*	Pattern autoSettings= new Pattern(youtube_settings.png);
		s.wait(autoSettings, 2000);
		s.click();
		s.click();
		*/
	}

}
