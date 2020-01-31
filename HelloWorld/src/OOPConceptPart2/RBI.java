package OOPConceptPart2;

public class RBI implements USBank, UKBank { // We are achieving multiple inheritance 
	
	// if a class is implementing any interface, then its mandatory to define/override all the methods of interface.
	// overriding from RBI Bank
	
	public void credit() {
	System.out.println("credit Info");
	}
	
	public void debit() {
		System.out.println("debit Info");
	}
	
	public void transfermoney() {
		System.out.println("Transfermoney Info");
	}

	public void educationloan() {
		System.out.println("educationloan Info");
	}

	public void carloan() {
		System.out.println("carloan Info");
	}

	

}
