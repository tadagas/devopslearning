package OOPConceptPart1;

public class FunctionInJava {
	
	// starting execution point.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//obj is the reference variable, referring to this object...
		//after creating a object, copy of all non static methods will be given to this object
		// below are the non static method.
		
		FunctionInJava obj= new FunctionInJava();
		obj.test();
		obj.division();
		obj.qa();
		obj.pqr();
		
		int l=obj.pqr();		
		System.out.println(l);
		
		String str=obj.qa();		
		System.out.println(str);
		
		int ss=obj.division();
		System.out.println(ss);		
	//	main method is void because- never returns a value. 

	}
	// four static method: pqr, test,selenium,division
	//In Java: functions and methods are same in java
	//main or main method
	// void does not return any values
	// return type= void
	//non static method:
	// functions and method: test()
	
	public void test() {
		System.out.println("test method");
		
	}
	// void does not return any value
	//return type : int
	public int pqr() {
		int p=10;
		int q=20;
		int r=30;
		System.out.println((p*q*r));
		return r;
	}
	//return type : String
	public String qa() {
		String s="selenium";
		return s;
	}
	//return type : int
	public int division() {
		int a=60;
		int b=60;
		int c=a/b;
		System.out.println(c);
		return c;
		
	}
		
	}



