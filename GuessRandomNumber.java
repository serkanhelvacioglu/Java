package pack2;

import java.util.Random;

import java.util.Scanner;

public class Random_User {

	
	
	
	
		public static void main(String[]args){
			
			Random rnd=new Random();
			
			int number=rnd.nextInt(20)+1;
			
			int count=0;
			
			
			Scanner scan=new Scanner(System.in);
			
			int user_input;
			
			while(count<5)
			{
				System.out.println("Enter a number");
				user_input=scan.nextInt();
				
				if(user_input>number)
				{
					System.out.println("Enter a smaller number");
				}
				else if(user_input<number)
				{
					System.out.println("Enter a bigger number");
				}
				else if(user_input==number)
				{
					System.out.println("Correct Number!!"); 
					break;	
				}
				
			}
			
			}
			
			
		}
		
		
		

