package OOPConceptPart2;

public class BMW extends Car {

	
	// when same method is present in parent  class as well as in child class with the same number of arguments is called method-overriding.
	
	public void start() {  // method overridden
		System.out.println("BMW---: Start");
	}
	
	public void stop() {
		System.out.println("BMW---: Stop");
	}
	
	public void theftsafety(){
		System.out.println("BMW---: theftsafety");
	}
}
