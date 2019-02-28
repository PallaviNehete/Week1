/**
 * created by: Pallavi Nehete.
 * Date: 21/02/2019.
 * Purpose: To find prime numbers between 0 to 1000.
 */

package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class PrimeNo 
{
	public static void main(String[] args) 
	{
		int number = 0;
		while(number < 1000)
		{
			int primenumber = Utility.primeNumber(number);
			if(primenumber!=0)
			{
				System.out.print(primenumber+" ,");
			}
			number++;
		}
	}
}