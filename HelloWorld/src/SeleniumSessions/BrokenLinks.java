package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.apache.http.HttpClientConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.URL;

public class BrokenLinks {

	// ReVisit this code: https://www.youtube.com/watch?v=f_8yUC52g34&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=29
	private static final java.net.HttpURLConnection HttpURLConnection = null;

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// links are associated a
		// img are associated to img

		driver.findElements(By.tagName("a"));
		driver.findElements(By.tagName("img"));

		// Get all the list of links and images on browser
		List<WebElement> linklists = driver.findElements(By.tagName("a"));
		linklists.addAll(driver.findElements(By.tagName("img")));
		System.out.println(linklists.size());
		
		
		// Iterative linklist: execlude all the links/images - which doesnt have any href attribute
		
		List<WebElement> activelinks= new ArrayList<WebElement>();
		
		for (int j=0; j<linklists.size(); j++) {
			if(linklists.get(j).getAttribute("href")!=null) {
				System.out.println(activelinks.size());
				
			}
		}
		
		for (int i = 1; i < linklists.size(); i++) {
			System.out.println(linklists.get(i).getText());
			activelinks.add(linklists.get(i));
			
		}
		
		for (int k=0; k<activelinks.size(); k++){
			
/*			try {
				java.net.HttpURLConnection connection = HttpURLConnection new URL().openConnection();
				
				connection.connect();

				connection.getResponseMessage();
				connection.disconnect();
			}*/
		}

	}

}
