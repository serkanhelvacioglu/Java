package pack1;

public class Vehicle {

	int engineSize;
	String fuelType;
	String transmission;
	
	public Vehicle(){
		
	}
	
	public Vehicle(int engineSize, String fuelType, String transmission) {
		this.engineSize = engineSize;
		this.fuelType = fuelType;
		this.transmission = transmission;
	}
	
	public void display(){
		
		System.out.println(this.engineSize+"\n"+this.fuelType+"\n"+this.transmission);
	}
	
	
}
