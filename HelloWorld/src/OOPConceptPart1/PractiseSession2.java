package OOPConceptPart1;

public class PractiseSession2 {
	
	 String name ="File"; // non static Global variable
	 static int age='1';  // static global variable
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PractiseSession2 object= new PractiseSession2();
		object.add();
		object.sum();
		
		String a="100";
		System.out.println(a+20);
		
		//data conversion String to int
		int i= Integer.parseInt(a);
		System.out.println(i+20);
		
		//Int, Double, Character, Boolean 
		//Wrapper class
		//data conversion String to double
		String y="12.5550";
		double d= Double.parseDouble(y);
		System.out.println(y+20);
		
		//String to boolean
		
		String k="true";
		boolean b=Boolean.parseBoolean(k);
		System.out.println(b);
		
		
		//Int to String conversion
		int jc=300;
		System.out.println(jc+200);
		
		String s=String.valueOf(jc);
		System.out.println(s+20);
		
		// Below code will display the exception: Exception in thread "main" java.lang.NumberFormatException: For input string: "100a"
		//String ja="100a";
		//int ic= Integer.parseInt(ja); 
		
		

	}

	public void sum() {
		int a=10;
		int b=20;
	}
	
	public void add() {
		int c=50;
		int d=50;
		
	}
	
	public void str() {
		int f=100;
		int g=200;
		int total=f-g;
	}
	
		//method overloading with different parameters:
		public void sum(int a, int z) {
			System.out.println("total = "+ (a+z));
		}
		
		public void sum(int a, int b,double c) {
			
		}
		
		//static and non static method
		
		public static void sum1(){
			
		}
}
