package Pack1;

import java.util.Random;

public class Array2 {
	
	public static void main(String[] args) 
	{
		Random rnd = new Random();
		
		int total=0;
		
		int[] totalArr=new int[4];
		
		int [] [] array1= new int[4][4];
		
		for(int i=0; i<4;i++)
		{
			for(int j=0; j<4; j++)
			{
				array1[i][j]=rnd.nextInt(9)+1;
			}
		}
		for (int i=0; i<4;i++)
		{
			System.out.print(i+1+".Line ");
			for(int j=0; j<4; j++)
			{
				System.out.print(array1[i][j]+"  ");		//Shows the array elements
				total+=array1[i][j];
				
			}
			System.out.println("Total: "+total);
			total=0;
		}
		System.out.print("Total: ");
		
		for(int i=0; i<4;i++)
		{
			for(int j=0; j<4;j++)
				{
					totalArr[i]+=array1[j][i];
				}
			System.out.print(totalArr[i]+" ");
			total=0;
			
		}
	}

}
