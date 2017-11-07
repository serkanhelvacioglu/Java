package StringPack;

import java.util.Scanner;

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter a string");
		String input = scan.nextLine();
		
		String LowerCase_input=input.toLowerCase();
		String reverse_input="";
		
		for(int i=LowerCase_input.length()-1;i>=0;i--)
		{
			reverse_input+=LowerCase_input.charAt(i);
		}
		
		if(LowerCase_input.equals(reverse_input))
		{
			System.out.println(LowerCase_input+" "+reverse_input+" "+"True");
		}
		else
		{
			System.out.println(LowerCase_input+" "+reverse_input+"False");
		}
	}

}
