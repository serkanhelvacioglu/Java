package pack1;

import java.util.Scanner;

public class UserIO   {

     public static void main(String[] args)  {
     
     int a,b,result;
     
     Scanner scan= new Scanner(System.in);
     
     System.out.println("Enter a number");
     
     a=scan.nextInt();
     
     System.out.println(Enter Second number");
     b=scan.nextInt();
     
     result=a+b;
     
     System.out.println("The sum of a+b = "+result)
     
     for(int i=0 ;i<5; i++){
     
            System.out.println("JAVA");
     }
     
     if(a>b){
     
            System.out.println("Bigger Number "+a);
     }
     else{
     
            System.out.println("Bigger Number "+b);
     }
