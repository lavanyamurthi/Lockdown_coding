//Define a class Point with two fields x and y each of type double. Also , define a method distance(Point p1, Point p2) to calculate the distance between points p1 and p2 and return the value in double..
//Use Math.sqrt( ) to calculate the square root.
import java.lang.Math.*;
class DistanceBwPoint
{
	public static void main(String arg[])	
	{
            int x1,x2,y1,y2;
	    double dis;
	    x1=1;y1=1;x2=4;y2=4;
	    dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	 	    
            System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
	}
}
