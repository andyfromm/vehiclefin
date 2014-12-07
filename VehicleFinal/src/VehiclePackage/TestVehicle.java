package VehiclePackage;

import java.util.UUID;

public class TestVehicle {
	
	public static void main (String[] args){
		
		Person a = new Person("Mike", "Smith",UUID.randomUUID());
		Car c = new Car();
		c.NumberOfDoors = 4;
		c.transferOwnership(a);
		Truck t = new Truck();
		t.transferOwnership(a);
		t.NumberOfAxels = 2;
		Person b = new Person("Henry", "Jones",UUID.randomUUID());
		t.transferOwnership(b);
		Motorcycle m = new Motorcycle();
		m.hasSideCar = false;
		
		
	}
	

}
