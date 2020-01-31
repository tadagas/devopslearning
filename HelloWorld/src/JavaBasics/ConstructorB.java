package JavaBasics;

public class ConstructorB extends ConstructorA {

	// super keyword always written in child class constructor. To call parent class
	// constructor.
	// super keyword is used to call same class constructor and first statement of
	// the class.

	public ConstructorB() {
		super();
		// System.out.println("Child class Constructor");

	}

	public ConstructorB(int i) {
		super(i);
		// System.out.println("Child class Constructor");

	}

	public ConstructorB(int a, int j) {
		super(a, j);
		// System.out.println("Child class Constructor");

	}

	public static void main(String args[]) {
		ConstructorB obj = new ConstructorB();
		ConstructorB obj1 = new ConstructorB(11);
		ConstructorB obj2 = new ConstructorB(10, 20);

	}
}
