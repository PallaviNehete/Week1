/**
 * created by: Pallavi Nehete.
 * Date: 18/02/2019.
 * Purpose: To find roots of the equation a*x*x + b*x + c.
 */

package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class Quadratic 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		int a, b, c;
		System.out.println("To Finding Roots of Quadratic Equation (a*x*x+b*x+c=0)  ");
		System.out.print("Enter value of a: ");
		a = utility.inputInteger();
		System.out.print("Enter value of b: ");
		b = utility.inputInteger();
		System.out.print("Enter value of c: ");
		c = utility.inputInteger();
		utility.quadratic(a, b, c);
	}
}
