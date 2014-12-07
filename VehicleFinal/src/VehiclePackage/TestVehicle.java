package VehiclePackage;

import java.util.UUID;

public class TestVehicle {
	
	public static void main (String[] args){
		
		Person a = new Person("Andy", "Fromm",UUID.randomUUID());
		
		Car car = new Car();
		car.doors = 4;
		car.owner(a);
		Truck truck = new Truck();
		truck.owner(a);
		truck.axels = 2;
		Person b = new Person("Mark", "McFadden",UUID.randomUUID());
		truck.owner(b);
		Motorcycle motor = new Motorcycle();
		motor.hasSideCar = false;
		
		
	}
	

}
