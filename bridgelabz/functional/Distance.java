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
		Distance distance = new Distance();
		System.out.print("Enter the distance of x from Origin: ");
		double x = utility.inputDouble();
		System.out.print("Enter the distance of y from Origin: ");
		double y = utility.inputDouble();
		double euclideandistance = distance.distance(x, y);
		System.out.println("\nEuclidean Distance from the point ("+x+","+y+") to origin (0,0) is: "+euclideandistance);
	}
	
	/**
	 * Method to find Euclidean distance from point (x,y) to the origin (0,0).
	 * @param x : distance of x from origin (0,0). 
	 * @param y : distance of y from origin (0,0).
	 * @return : distance from point (x,y) to the origin(0,0).
	 */
	public double distance(double x , double y)
	{
		double euclideandistance = Math.sqrt(x*x+y*y);
		return euclideandistance;
	}
}
