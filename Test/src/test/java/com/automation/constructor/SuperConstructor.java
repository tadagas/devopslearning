package com.automation.constructor;

public class SuperConstructor {

	
		SuperConstructor(){
			System.out.println("MyParentClass Constructor");
		   }
		}
		 class MyChildClass extends SuperConstructor{
			MyChildClass() {
			System.out.println("MyChildClass Constructor");
		   }
		   public static void main(String args[]) {
			new MyChildClass();
		   }

}
		
		
		

