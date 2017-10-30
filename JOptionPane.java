package pack1;

import java.util.Random;

import javax.swing.JOptionPane;


public class Array2 {

	
	public static void main(String[] args) {

		
		int range;
		int dimension;
		
		range=Integer.parseInt(JOptionPane.showInputDialog(
				null,
				"Enter the range of random numbers",
				"JAVA", 
				JOptionPane.QUESTION_MESSAGE));
		
		
		dimension=Integer.parseInt(JOptionPane.showInputDialog(
				null,
				"Enter dimension number",
				"JAVA", 
				JOptionPane.QUESTION_MESSAGE));
		
		
		
		
		
		Random rnd = new Random();
		int total=0;
		
		int [] array_total = new int [dimension];
		int [][] array1 = new int [dimension][dimension];
		
		for(int i=0; i<dimension; i++){
			for(int j=0; j<dimension; j++){
				
				array1[i][j]= rnd.nextInt(range)+1;
				
			}
			
		}
		String output="";
		
		for(int i = 0; i<dimension; i++){
			output+=(i+1)+".Line ";
			for(int j=0; j<dimension; j++){
				
				output+=array1[i][j]+"  ";
				array_total[i]+=array1[j][i];
				total+=array1[i][j];
			}
			output+="Total: "+total+"\n";
			total=0;
		}
		output+="Total: ";
		for(int i=0; i<dimension; i++){
			output+=array_total[i]+" ";
		}
		output+="\n";
		
		
		JOptionPane.showMessageDialog(null, output,"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}

}
