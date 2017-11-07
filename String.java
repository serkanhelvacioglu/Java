package StringPack;

public class StringClass {
	public static void main(String[]args)
	{
		String word1="JAVA";
		String word2="cSharp";
		String word3="Object Oriented Programming";
		char[] array1=new char[4];
		
		System.out.println(word1.charAt(3));
		System.out.println(word1.contains("va"));
		System.out.println(word1.equals(word2));
		System.out.println(word1.indexOf("C"));
		System.out.println(word1.isEmpty());
		System.out.println(word1.lastIndexOf("A"));
		System.out.println(word1.length());
		System.out.println(word3.replace(" ", "-"));
		System.out.println(word3);
		System.out.println(word3.startsWith("Ob"));
		System.out.println(word1.substring(2));
		System.out.println(word1.substring(0, 3));
		
		System.out.println(word1.toCharArray());
			array1=word1.toCharArray();
			System.out.println(array1[0]);
			
		System.out.println(word1.toLowerCase());
		System.out.println(word2.toUpperCase());
		System.out.println();
	}

}
