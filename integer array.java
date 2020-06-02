//Write a program in java, an array of integer data to be initialized. During the initialization, if a user enters a value other than integer value, then it will throw InputMismatchException exception. On the occurrence of such an exception, your program should print “You entered bad data.” 
//If there is no such exception it will print the total sum of the array
import java.util.*;
import java.util.Scanner;
public class ArrayInput {

	//Prefixed Fixed Code:
	
	
	  public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in); 
	      System.out.println("Enter the length of the array:");
	      int length = sc.nextInt(); 
	      // create an array to save user input 
	      System.out.println("enter the elements:");
	      int[] name = new int[length];
	      int sum=0;//save the total sum of the array.
	
	try{	
	  
	  for(int i = 0 ; i < name.length ; i++)
	  {  
	 	 name[i] = sc.nextInt();
		 sum += name[i];
	  } 
	  System.out.print(sum);
	}
	catch(InputMismatchException e){
	 
	  System.out.print("You entered bad data.");
	}

 }
 }
