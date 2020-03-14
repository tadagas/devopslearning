package com.automation.constructor;
import com.automation.TestPages.ConstructorsInJava;

public class ExampleOne {
	
	String name;
	//The constructor in constructor
	public void ConstructorsInJava(){
		
		this.name="shiva";
	}
	
	public static void main(String[] args) {
		
		ExampleOne obj = new ExampleOne();
		System.out.println("Constructor class :" + obj.name);
	}

}

