package com.automation.constructor;

public class ExampleTwo {

	int empId;  
	   String empName;  
		    
	   //parameterized constructor with two parameters
	   ExampleTwo(int id, String name){  
	       this.empId = id;  
	       this.empName = name;  
	   }  
	   void info(){
	        System.out.println("Id: "+empId+" Name: "+empName);
	   }  
		   
	   public static void main(String args[]){  
		   ExampleTwo obj1 = new ExampleTwo(10245,"Chaitanya");  
		   ExampleTwo obj2 = new ExampleTwo(92232,"Negan");  
		   obj1.info();  
		   obj2.info();  
	   }  
}
