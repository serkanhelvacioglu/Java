package pack1;

public class Car extends Vehicle{
	
	int numDoors, horsepower;
	boolean convertible;
	
	public Car(int engineSize, String FuelType, 
			String transmission,int numDoors, int horsepower,
			boolean convertible) {
		
		super(engineSize, FuelType, transmission);
		this.numDoors = numDoors;
		this.horsepower = horsepower;
		this.convertible = convertible;
	}
	
	public void display(){
		super.display();
		System.out.println(this.numDoors+"\n"+this.horsepower+"\n"
							+this.convertible);
	}
	
	

}
