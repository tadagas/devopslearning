package OOPConceptPart1;

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverLoading obj= new MethodOverLoading();
		obj.sum(100);
		obj.sum(10, 20);
		
	}
	// we can can overload main method.
	public static void main(int a) {
		
	}
	
	public static void main(String a) {
		
	}
	//you can create method inside a method
	//Non static method
	//method overloading-- when the method name is same with different arguments or input parameters within the same class..(different data types) methods overloading.
	//Duplicate method: same method name with same number of arguments are not allowed

	public void sum(int w) {
		System.out.println(w);
		
	}
	
	public void sum(double w) {  // same method name with different data types are allowed..
		System.out.println(w);
		
	}
	
	public void sum(int a,int b,int c, int d) {
		
	}
	
	//method overloading with different parameters:
	public void sum(int a, int z) {
		System.out.println("total = "+ (a+z));
	}
	
	public void sum(int a, int b,int c) {
		
	}
	
	
}

