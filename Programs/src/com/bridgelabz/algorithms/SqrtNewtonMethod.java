/*	Write a static function sqrt  to compute the square root of a nonnegative number c given in the input using Newton's method:
	- initialize t = c
	- replace t with the average of c/t and t
	- repeat until desired accuracy reached using condition Math.abs(t - c/t) > epsilon*t where epsilon = 1e-15;	*/

package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class SqrtNewtonMethod 
{
	public static void main(String[] args) 
	{
		Utility u=new Utility();
		System.out.print("Enter Number to find square root: ");
		double c= u.inputDouble();
		if(c>=0)
		{
			double epsilon = 1e-15;   
			double t=c;            	
			while (Math.abs(t-c/t) > epsilon*t)
			{
				t= (c/t+t) /2;
			}
			System.out.println("\n Square Root of "+c+" is: "+t);
		}
		else
		{
			System.out.println("\n *Please Enter Non-Negative Number");
		}
	}
}
