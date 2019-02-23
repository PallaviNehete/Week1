/*	Write a program Distance.java that takes two integer command-line arguments x and y 
	and prints the Euclidean distance from the point (x, y) to the origin (0, 0). 
	The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function	*/

package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class Distance 
{
	public static void main(String[] args) 
	{
		Utility u=new Utility();
		System.out.print("Enter the distance of x from Origin: ");
		double x= u.inputDouble();
		System.out.print("Enter the distance of y from Origin: ");
		double y= u.inputDouble();
		double EucliDist=Math.sqrt(x*x+y*y);
		System.out.println("\nEuclidean Distance from the point ("+x+","+y+") to origin (0,0) is: "+EucliDist);
	}
}
