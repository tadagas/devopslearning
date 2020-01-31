package Inheritance;

import OOPConceptPart2.BMW;
import OOPConceptPart2.Car;
import OOPConceptPart2.VehicleClass;

public class TestClassCar {
	
	//In java will allow only multi level inheritance, not the multiple inheritance

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarClass obj= new CarClass();
		obj.start();
		obj.stop();
		obj.refuel();
		
		// static polymorphism -- or -- compile time polymorphism 
		MarutiClass m= new MarutiClass();
		m.start();
		m.stop();
		m.refuel();
		m.theftsafety();
		
		
		Car c= new Car();
		c.start();
		c.stop();
		c.refuel();

		VehicleClass v= new VehicleClass();
		v.enginee();
	}

}
