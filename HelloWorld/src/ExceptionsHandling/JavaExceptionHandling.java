package ExceptionsHandling;

public class JavaExceptionHandling {
	int a=10;
	
	//Exception in thread "main" java.lang.ArithmeticException: / by zero
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//int i=9/0;
		//System.out.println(i); // after running the script getting below exception.	
		//Exception in thread "main" java.lang.ArithmeticException: / by zero

		Exception obj =new Exception();
		
		//obj=null;
		//System.out.println(obj.a);// After running the program am getting below script:
		//at ExceptionsHandling.JavaExceptionHandling.main(JavaExceptionHandling.java:17)
		
		//1. try catch block
		//2.  
		try {
			int i1= 9/0; // this code will throw an exception		
			}
		catch(ArithmeticException e) {
			e.printStackTrace();
			
		}
		System.out.println("ABC");
	}

}
