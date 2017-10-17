package pack1;

import java.util.Random;

public class Arrays {
	
	
		public static void list(int[] array, int length){
			
			for(int i=0; i<5;i++)
			{
				System.out.print(array[i]+" ");
			}
			System.out.println();
		}
	
		public static void main(String[] args)
		{
			/*int[] array1=new int[5];
			int[] array2={3,5,7,8,2};
			
			int length=array1.length;	//Gives length of array assign to length*/
			
			int[] array1=new int[5];
			int[] array2=new int[5];
			int[] result=new int[5];
			
			Random rnd=new Random();
			
			for(int i=0;i<5;i++)
			{
				
				array1[i]=rnd.nextInt(11)+10;
				array2[i]=rnd.nextInt(11)+10;
				result[i]=array1[i]+array2[i];
				
			}
			
			
			list(array1,array1.length);
			list(array2,array2.length);	//İnstead of below for
			list(result,result.length);
			
			/*for(int i=0; i<5;i++)
			{
				System.out.print(array1[i]+" ");
			}
			System.out.println();
			for(int i=0; i<5;i++)
			{
				System.out.print(array1[i]+" ");
			}
			System.out.println();
			
			for(int i=0; i<5;i++)
			{
				System.out.print(array2[i]+" ");
			}
			System.out.println();
			
			for(int i=0; i<5;i++)
			{
				System.out.print(result[i]+" ");
			}*/
			
		}

}
