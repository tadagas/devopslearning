package TestPackage;

public class FinallyConcept {

	
	// https://www.youtube.com/watch?v=aqDiBybBRqM&list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx&index=19
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	
	public static void test1() {
		try {
			System.out.println("Inside the test1 method");
			throw new RuntimeException("test");
		}catch (Exception e) {
			System.out.println("Inside the catch block");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
	}
	
	
	public void test2() {
		try {
			System.out.println("Inside test2");
		}
		finally
		{
			System.out.println("Inside finally block for Test2");
		}
	}
	
	
	public static void division() {
		int i=10;
		try {
			System.out.println("Inside try block");
			int k=i/0;
		}
		//catch(ArithmeticException e) {
		catch(NullPointerException e) {
			System.out.println("Inside catch  block");
			System.out.println("divide by zero error");
		}
		finally {
			System.out.println("execute this code even after any exception");
		}
	}
}
