package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTests {

	
	@Test
	public void sum(int a, int b) {
		a=10;
		b=20;
		int total=a+b;
		System.out.println(total);
		Assert.assertEquals(total, a+b);
	}
	
	@Test
	public void sum1(int c, int d) {
		c=10;
		d=20;
		int total=c+d;
		System.out.println(total);
		Assert.assertEquals(total, c+d);
	}

}
