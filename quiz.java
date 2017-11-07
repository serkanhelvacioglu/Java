package StringPack;

import java.util.Scanner;

public class quiz {
	
	public static void main(String[] args) 
	{
		
	   	
	   	
	   	Scanner scan= new Scanner(System.in);
	   	
	   	String word1 = scan.nextLine();
	   	String word2 = scan.nextLine();
	   	String common="";
	   	
	   	for(int i=0; i<word1.length()-1;i++)
	   	{
	   		for(int j=0;j<word2.length()-1;j++)
	   		{
	   			if(word1.charAt(i)==word2.charAt(j))
	   			{
	   				
	   				
	   			if(word2.charAt(j)!=common.charAt(common.indexOf(word2.charAt(j))))
	   					{
	   				common+=word2.charAt(j);
	   				System.out.println(common);
	   				
	   					}
	   				
	   			}
	   			
	   			
	   		}
	   		
	   	}
	   	
		
	}

}
