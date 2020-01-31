package OOPConceptPart1;

public class LocalVsGlobalVariable {

	//Global variable can be access throught the program.
	// In order to access global variables need to have object reference
	String name="shiva";
	int age=35;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=20; // i is local varible for main method
		System.out.println(i);
		LocalVsGlobalVariable obj= new LocalVsGlobalVariable();
		
		System.out.println(obj.name);
		System.out.println(obj.age);
	}
	
	public void sum() {
		
		int i=20;  // l is local variable for local method
		int c=10;
		int age=35;  // this variable within this method and its local method ...
		int tot=c+i;
		System.out.println(tot);
		
		LocalVsGlobalVariable obj1= new LocalVsGlobalVariable();
		
		System.out.println(obj1.name);
		System.out.println(obj1.age);
	}
	

}
