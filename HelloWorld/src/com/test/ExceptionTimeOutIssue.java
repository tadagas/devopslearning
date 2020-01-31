package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeOutIssue {

/*	@Test(timeOut=1000)
	public void InfiniteLoop() {
		int i=1;
		while(i==1) {
			System.out.println(i);
		}
	}
	*/
	@Test(expectedExceptions=NumberFormatException.class)
	public void Infinite() {
		String ix="ZZZZ";
		Integer.parseInt(ix);
		}
}
