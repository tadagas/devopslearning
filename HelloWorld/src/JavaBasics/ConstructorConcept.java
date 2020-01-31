package JavaBasics;

public class ConstructorConcept {

	// Constructor class will be used in TestBaseClass Constructor (POM)
	// LoginPage is base class constructor to initialize the property

	// Constructor is a class type:
	// constructor does not include static and void
	// Constructor does not a function.
	// constructor can not return any value.
	// Can we overload the constructor (method overload) with different parameter.

	public ConstructorConcept() {
		System.out.println("Default Constructor");
	}

	public ConstructorConcept(int b) {
		System.out.println("Test= " + b);

	}

	public ConstructorConcept(int c, int x) {
		System.out.println("Test= " + x);
		System.out.println("Test= " + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(20, 30);

		System.out.println("default constructor" + obj);
		System.out.println("default constructor" + obj1);
		System.out.println("default constructor" + obj2);

	}

}
