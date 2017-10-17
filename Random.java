package pack2;

import java.util.Random;



public class Random_User {

	
	
	
	
		public static void main(String[]args){
			
			Random rnd=new Random();
			
			String Evens="";
			String Odds="";
			
			int number;
			
			for(int i=0; i<20; i++ )
			{
				number=rnd.nextInt(20)+1;
				
				if(number%2>0)
				{
					Odds+=number+" ";
					
				}
				else{
					
					Evens+=number+" ";
				}
			}
			
			System.out.println("Evens: "+Evens);
			System.out.println("Odds: "+Odds);
			
		}
		
		
		
}
