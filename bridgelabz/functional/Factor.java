/**
 * created by: Pallavi Nehete.
 * Date: 18/02/2019.
 * Purpose: Print the prime factors of number N.
 */

package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class Factor 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.print("Enter Number to find all Prime Factors: ");
		int number = utility.inputInteger();
		if(number>1)
		{
			System.out.println("Prime Factors is:- ");
			int factors = utility.checkPrimeFactor(number);
			if(factors>1)
			{
				System.out.println(factors);
			}
		}
		else
			System.out.println("Please Enter number greater than 1.");
	}
}
