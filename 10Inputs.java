package pack1;

import java.util.Scanner;


public class UserIO {

      public static void main(String[] args){
     
            Scanner scan = new Scanner(System.in);
            
            int user_input;
            int odds=0;
            int evens;
            String evenList="";
            String oddList="";
            
            
            for(int i=0; i<10; i++)
            {
                System.out.println("Enter a number");
                user_input = Scan.nextInt();
                
                if(user_input%2>0)
                {
                  
                  odds+=user_input;
                  oddList+=user_input+" ";
                  
                }
            
            
            
                else 
                {
                   evens+=user_input;
                   evenList+=user_input+" ";
                    
                }
                
             System.out.Println("The Sum of Odd Numbers= "+odds);
             System.out.Println("The Sum of Even Numbers= "+evens);
             System.out.Println("The List of Odd Numbers= "+oddList);
             System.out.Println("The List of Even Numbers= "+evenList);
                
             }
          
             
          
          }

}
