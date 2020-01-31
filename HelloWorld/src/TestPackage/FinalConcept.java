package TestPackage;

public class FinalConcept {
	
	public void finalize() {
		System.out.println("Finalize the method");
		
	}
	//final is a keyword  (example final int a=10;
	//finally is a block (example using try catch and finally exception)
	//finalize is a method (example public void finalize())
	
	// Garbage collection System.gc(); gc
	// garbage collection will come under memory.. kill all the objects
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalConcept f1= new FinalConcept();
		FinalConcept f2= new FinalConcept();
		
		f1=null;
		f2=null;
		System.gc();
	}

}
