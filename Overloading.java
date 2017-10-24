package pack1;

public class OverloadingExample {

	
	
	public void calculation(int x){
		System.out.println("The Result: "+(x*x));
	}
	
	public void calculation(int x,int y){
		System.out.println("The Result: "+(x*y));
	}
	
	
	
	
	public static void main(String[] args) {
		OverloadingExample obj1 = new OverloadingExample();
		obj1.calculation(5);
		obj1.calculation(7, 2);
		

	}

}
