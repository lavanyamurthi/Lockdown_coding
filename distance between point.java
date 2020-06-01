//Define a class Point with two fields x and y each of type double. Also , define a method distance(Point p1, Point p2) to calculate the distance between points p1 and p2 and return the value in double..
//Use Math.sqrt( ) to calculate the square root.
import java.util.*;
import java.util.Scanner;
public class distbtwpoints
{
	public static void main(String arg[])
	
	{
	
             int x1,x2,y1,y2;
 
	         double dis;
	
	         Scanner sc=new Scanner(System.in);
 
	         System.out.println("enter x1 point");
	   
                 x1=sc.nextInt();
	    
                 System.out.println("enter y1 point");
	   
                 y1=sc.nextInt();
 
	         System.out.println("enter x2point");
	   
                 x2=sc.nextInt();
 
	         System.out.println("enter y2 point");
	   
                 y2=sc.nextInt();
	  	    
		 dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
 	 	    	 	    
  	         System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
 
	}
 
}
