package com.qa.testng.tests;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.apache.commons.io.input.ProxyReader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.annotations.Test;

public class PDFileReader {
//https://www.youtube.com/watch?v=jeN9WeTowGg&ab_channel=NaveenAutomationLabs
	@Test
	public void pedfile() throws IOException {
		Properties prop= new Properties();
		//prop.load(is);
		URL url= new URL("https://investeasy.nipponindiamf.com/Online/Pan%20Statements/2901202013301925091.pdf");
		InputStream is =url.openStream();
		BufferedInputStream fileParse= new BufferedInputStream(is);
		PDDocument document=null;
	
		document= PDDocument.load(fileParse);
		String pdfContent= new PDFTextStripper().getText(document);
		System.out.println(pdfContent);
	}
	
}
