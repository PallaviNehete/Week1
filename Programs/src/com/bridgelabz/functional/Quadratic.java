/*	Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
 	Since the equation is x*x, hence there are 2 roots.
 	The 2 roots of the equation can be found using a formula 
	delta = b*b - 4*a*c
	Root 1 of x = (-b + sqrt(delta))/(2*a)
	Root 2 of x = (-b - sqrt(delta))/(2*a)
	Take a, b and c as input values to find the roots of x.		*/

package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class Quadratic 
{
	public static void main(String[] args) 
	{
		Utility u=new Utility();
		int a,b,c,delta;
		double rootX1,rootX2;
		System.out.println("To Finding Roots of Quadratic Equation (a*x*x+b*x+c=0)  ");
		System.out.print("Enter value of a: ");
		a= u.inputInteger();
		System.out.print("Enter value of b: ");
		b= u.inputInteger();
		System.out.print("Enter value of c: ");
		c= u.inputInteger();
		delta= b*b-4*a*c;
		System.out.println("Value of Delta: "+delta);
		if(delta>=0)
		{
			rootX1=(-b+ Math.sqrt(delta))/(2*a);
			rootX2=(-b- Math.sqrt(delta))/(2*a);
			System.out.println("\n1st Root of Quadratic Equation is: "+rootX1);
			System.out.println("2nd Root of Quadratic Equation is: "+rootX2);
		}
		else
		{
			System.out.println("\nRoots of Quadratic Equation are Imaginary");
		}
	}
}
