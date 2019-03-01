/**
 * created by: Pallavi Nehete.
 * Date: 21/02/2019.
 * Purpose: To compute the square root of a nonnegative number c given in the input using Newton's method.
 */

package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class SqrtNewtonMethod 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.print("Enter Number to find square root: ");
		double number = utility.inputDouble();
		if(number >= 0)
		{
			double squareRoot = squareRoot(number);
			System.out.println("\n Square Root of "+number+" is: "+squareRoot);
		}
		else
			System.out.println("\n *Please Enter Non-Negative Number");
	}
	/**
	 * To compute square root of a nonnegative number c given in the input using Newton's method.
	 * @param number : number to find square root of nonnegative number c given in the input using Newton's method.
	 * @return : square root of a non negative number.
	 */
	public static double squareRoot(double number)
	{
		double epsilon = 1e-15;   
		double root = number;            	
		while (Math.abs(root-number/root) > epsilon*root)
		{
			root = (number/root+root) /2;
		}
		return root;
	}
}
