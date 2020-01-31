package OOPConceptPart1;

public class StaticAndNonStaticMethod {

		//Global variable: the scope of global variable will be available across all the functions with some conditions. 
	
		String name="shiva"; 	// non static global variable
		static int age=35;				// static global variable
	
		public static void main(String[] args) {
			
			// How to call static methods and variable...			
			// 1. Direct calling
			sum();
			// 2. calling by classname
			StaticAndNonStaticMethod.sum();
			
			
			System.out.println(age);
			System.out.println("StaticAndNonStaticMethod.age");
			
			StaticAndNonStaticMethod obj= new StaticAndNonStaticMethod();

			// non static variable we can access using object reference. object is referring
			// Can I access static methods using object reference ? Yes
			// The static method sum() from the type StaticAndNonStaticMethod should be accessed in a static way
			// non static method access required a object reference
			// static method access does not required a object reference we can call directly and calling classname along with method :StaticAndNonStaticMethod.sum();
			
			obj.sendmail();
			obj.sum();
			
			
	}
		
		public void sendmail() {  // non static method
			System.out.println("sendmail");
		}

		public static void sum() {// static method
			System.out.println("sum method");
			
		}
}
