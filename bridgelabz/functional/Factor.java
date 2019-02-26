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
		System.out.println("Prime Factors is:- ");
		for(int i=2; i<=number; i++)
		{
			while(number%i == 0)
			{
				System.out.println(i);
				number = number/i;	
			}
		}
		if(number>2)
		{
			System.out.println(number);
		}
	}
}
