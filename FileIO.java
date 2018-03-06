package pack1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		ArrayList<String> cities=new ArrayList<String>();
		cities.add("Istanbul");
		cities.add("Ankara");
		cities.add("Izmir");
		cities.add("Bursa");
		
		File file1=new File("E:\\users\\serkanhelvacioglu\\desktop\\java.txt");
				
		file1.createNewFile();
		
		FileWriter fwriter=new FileWriter(file1);
		
		fwriter.write("JAVA Programming 2");

		fwriter.flush();
		
		for(String city: cities)
		{
			fwriter.write(city+"\n");
		}
		

		fwriter.close();

		Scanner scan=new Scanner(file1);
		
		while(scan.hasNextLine())
		{
			System.out.println(scan.nextLine());
			
		}

	}

}
