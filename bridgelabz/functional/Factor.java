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
		Factor factor = new Factor();
		System.out.print("Enter Number to find all Prime Factors: ");
		int number = utility.inputInteger();
		System.out.println("Prime Factors is:- ");
		int factors = factor.checkPrimeFactor(number);
		if(factors>1)
		{
			System.out.println(factors);
		}
	}
	
	/**
	 * method to check wheather it is prime factor or not.
	 * @param number
	 * @return prime numbers.
	 */
	public int checkPrimeFactor(int number)
	{
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
			return number;
		}
		return 0;
	}
}
