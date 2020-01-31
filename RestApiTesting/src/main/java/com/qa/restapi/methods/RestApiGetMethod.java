package com.qa.restapi.methods;

import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestApiGetMethod {

	// 1. GET METHODS
	
	public void GetMethod(String url) {
		
	CloseableHttpClient httpclient= new CloseableHttpClient();
	HttpGet httpget = new HttpGet(url);
	httpclient.execute(httpget);
	CloseableHttpResponse closeableHttpClient = httpclient.execute(httpget);
	int Status=closeableHttpClient.getStatusLine().getStatusCode();
	System.out.println(Status);
	
	String responseString = EntityUtils.toString(closeableHttpClient.getEntity(), "UTF-8");
	
	JSONObject responseJson = new JSONObject(responseString);
	System.out.println(responseJson);
	
	Header[] headerArray = CloseableHttpResponse.getAllHeaders();
	
	
	
	
	
		
		
	}
}
