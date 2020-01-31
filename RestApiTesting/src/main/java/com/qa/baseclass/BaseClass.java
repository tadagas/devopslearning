package com.qa.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {

public static Properties prop;
	
	public void properties() throws IOException {
		Properties prop = new Properties();
		FileInputStream inputfile = new FileInputStream("D:/1-Projects/IT-Int/Pending Tasks/RestApiTesting/src/main/java/com/qa/config/Config.properties");
		try {
			prop.load(inputfile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		}
}
