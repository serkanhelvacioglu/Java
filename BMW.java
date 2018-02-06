package pack1;

public class BMW extends Car {

	String model, color;
	
	public BMW(int engineSize, String FuelType,
			String transmission,int numDoors, int horsepower, 
			boolean convertible, String model, String color) {
		
		super(engineSize, FuelType, transmission, numDoors, 
				horsepower, convertible);
		this.model=model;
		this.color=color;
	}
	
	public void display(){
		super.display();
		System.out.println(this.model+"\n"+this.color);
		
	}


	
	public static void main(String[] args) {
		
		BMW newBMW = new BMW(1800,"Gas", "Auto", 5, 180, true, "2017", "Black");

		newBMW.display();
		
	}

}
