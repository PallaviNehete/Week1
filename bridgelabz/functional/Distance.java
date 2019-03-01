/**
 * created by: Pallavi Nehete.
 * Date: 18/02/2019.
 * Purpose: To print Euclidean distance from point (x,y) to the origin (0,0).
 */

package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class Distance 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.print("Enter the distance of x from Origin: ");
		double x = utility.inputDouble();
		System.out.print("Enter the distance of y from Origin: ");
		double y = utility.inputDouble();
		double euclideanDistance = utility.distance(x, y);
		System.out.println("\nEuclidean Distance from the point ("+x+","+y+") to origin (0,0) is: "+euclideanDistance);
	}
}
