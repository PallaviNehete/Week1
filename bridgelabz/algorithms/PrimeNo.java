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
		int num = 0;
		while(num < 1000)
		{
			int n = Utility.IsPrimeNumber(num);
			if(n!=0)
			{
				System.out.print(n+" ,");
			}
			num++;
		}
	}
}