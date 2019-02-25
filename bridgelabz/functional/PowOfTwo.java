/**
 * created by: Pallavi Nehete.
 * Date: 18/02/2019.
 * Purpose: This program takes a command-line argument N & prints table of the powers of 2 that are less than or equal to 2^N.
 */

package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class PowOfTwo 
{
	public static void main(String[] args) 
	{
		Utility u = new Utility();
		System.out.print("Enter number which you want to find power of 2: ");
		int num = u.inputInteger();
		int power = 1;
		if((num < 31) && (num >= 0))
		{
			if(num == 0)
			{
				System.out.println("2 to the power "+num+" is: "+power);
			}
			else
			{
				for(int i=0; i<=num; i++)
				{
					power= power*2;
					System.out.println("2 to the power "+i+" is: "+power);
				}
			}
		}
		else
		{
			System.out.println("Please enter number between 0 to 31");
		}
	}
}
