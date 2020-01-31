package JavaBasics;

import java.io.ObjectOutputStream.PutField;

public class ConstructorWithThisKeyword {
	// class variable (Global variable
	String name;
	int age;
	//String name1;
	
	public ConstructorWithThisKeyword(String name, int age) {
		// this is a keyword will be used in case of local varible name mapped aganist global variable. 
		// After declaring here it will become an local variable
		// in case if you not use the constructor class, then no need to use this keyword.
		this.name=name;  //Global variable this.name and local variable is name;
		this.age=age;
		//name1=name;
		System.out.println();
		
		//name=name;
		System.out.println();
		System.out.println(name);
		System.out.println(age);
	}


	public static void main(String[] args) {
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("shashi",35);
		
		
	}

}
