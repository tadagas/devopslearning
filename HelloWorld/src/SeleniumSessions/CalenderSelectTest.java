package SeleniumSessions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderSelectTest {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		//https://www.youtube.com/watch?v=Rjs9qLRP9tM&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=18
		//https://www.youtube.com/watch?v=oND1ETJEbSc&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=19
		// With the help of dynamic webtable xpath concept.
		//Iterate the entire calender grid by row and column.
		// Match the value and select the day..
		// Handle NoSuchElementException in case of 31st day
		
		// Date Selection:
		String date="";
		String datearr[]= date.split("-");
		String day=datearr[0];
		String month=datearr[1];
		String year=datearr[2];

	/*	Select select = new Select(driver.findElement(By.name("")));
		((Object) select).selectbyvisibletext(month);
		for(int rownum=2; rowmum<=7; rownum++) {
			for(int colNum=1;colNum=totalWeekDays; ColNum++)
				
				String dayval=driver.findElement(By.xpath("")).getText();
			*/
				
		}
		 
	}


