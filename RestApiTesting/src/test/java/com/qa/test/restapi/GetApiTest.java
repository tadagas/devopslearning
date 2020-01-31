package com.qa.test.restapi;

import org.testng.annotations.BeforeMethod;

import com.qa.baseclass.BaseClass;

public class GetApiTest extends BaseClass {

	BaseClass baseclass;
	
	@BeforeMethod
	public void Setup() {
	
		baseclass = new BaseClass();
		
		String apiurl=prop.getProperty("apiurl");
		String serviceurl=prop.getProperty("serviceurl");
		String url= serviceurl+apiurl;
		
		GetMethod getmethod= new GetMethod();
		
		
		
	}
}
