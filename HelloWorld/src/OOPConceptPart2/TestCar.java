package OOPConceptPart2;

public class TestCar {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// same method is present in parent class as well as in child class with same name and same number of arguments , 
		//its called overriding
		
		// static polymorphism -- or -- compile time polymorphism 
		BMW b= new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftsafety();
		
		
		Car c= new Car();
		c.start();
		c.stop();
		c.refuel();

		VehicleClass v= new VehicleClass();
		v.enginee();
		
	}


}
