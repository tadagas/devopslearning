package com.automation.TestPages;

public class ConstructorsInJava {
	
	String name;
	//The constructor in constructor
	public void ConstructorsInJava(){
		
		this.name="shiva";
	}
	
	public static void main(String[] args) {
		
		ConstructorsInJava obj = new ConstructorsInJava();
		System.out.println("Constructor class :" + obj.name);
	}

}
