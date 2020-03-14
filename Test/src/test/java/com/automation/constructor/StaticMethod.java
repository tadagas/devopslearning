package com.automation.constructor;

public class StaticMethod {

	static int num;
	   static String mystr;
	   static{
	      num = 97;
	      mystr = "Static keyword in Java";
	   }
	
	static void mymethod() {
		System.out.println("MyMethod");
	}
	
	
	public static void main(String[] args) {

		mymethod();
		
		System.out.println("Value of num of "+ num);
		System.out.println("Value of mystr" + mystr);

	}

}
