package OOPConceptPart2;

public interface USBank {
	
	int balance=10;
	
	public void credit();
	
	public void debit();
	
	public void transfermoney();

	
	// only method declaration 
	// no method body--only method prototype
	// In interface, we can declare the variables. vars are by default static in nature.
	// vars value will not be changed.
	// no static method in interfaces
	// we can not create the object of interface
	// Interfaces is abstract in nature.

}
