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
			
			
			int[] array1=new int[5];
			int[] array2=new int[5];
			String str="";
			
			Random rnd=new Random();
			
			for(int i=0;i<5;i++)
			{
				
				array1[i]=rnd.nextInt(11)+10;
				array2[i]=rnd.nextInt(11)+10;
				
				
			}
			
			
			list(array1,array1.length);
			list(array2,array2.length);	//İnstead of below for
			
			
			
			int i,j;
			
			for(i=0;i<5;i++)
			{
				
				for (j=0;j<5;j++)
				{
					if (array1[i]==array2[j])
					{
						
						System.out.print(array1[i]+" ");
						str+=array1[i]+" ";
						
					}
				}
			}
			
			System.out.println(str);
		}

}
