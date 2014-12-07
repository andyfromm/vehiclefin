package VehiclePackage;

public abstract class Vehicle {
	
	public String Name;
	public String Color;
	public int Weight;
	public Person Owner;
	
	
	
	public Person transferOwnership(Person newOwner){
		return Owner = newOwner;	
	}
}
