package SeleniumSessions;

import org.hamcrest.core.Is;

public class HtmlDomInterface {

	public static void main(String[] args) {
		// Dom objects are provided by specific browser.
		
		// DOM means Document object model
		// Html DOM is a API interface provided by browser.
		// when a web page is loaded, browser creates a DOM on the page
		
		// 3 types of DOM, 
		// HTML DOM,
		// XML DOM, 
		// Core DOM....
		
		// Selenium always interact with HTML Document model 
		// On HTML DOM:
		//			1. Properties
		//			2. Methods
		//			3. Events
		// Document -->
		// Root Element--> Element <Head>--> Element <Title>--> Text <"mytext">
		
		// DOM -W3C standard.
		// Platform--Interface--API's -- send the request service layer--> will fetch the data from DB layer.
		
		// All CRUD operations are performed using HTML DOM...
		
		// Each page have different DOM..
		
		
		System.out.println("Exception");
		// StaleElement exception. // not fresh...
		// reason could be element is removed, element got refresh, DOM got expired..args small section removed on coding.
		
		//	Due to that StaleElement exception will get.

		// 
		
		
		
		
	}

}
