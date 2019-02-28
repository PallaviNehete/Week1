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
		Utility utility = new Utility();
		PowOfTwo power = new PowOfTwo();
		System.out.print("Enter number which you want to find power of 2: ");
		int number = utility.inputInteger();
		power.powOfTwo(number);
	}
	
	/**
	 * method to find power of 2.
	 * @param number : number to find power of 2.
	 */
	public void powOfTwo(int number)
	{
		int power = 1;
		if((number < 31) && (number >= 0))
		{
			if(number == 0)
			{
				System.out.println("2 to the power "+number+" is: "+power);
			}
			else
			{
				for(int i=0; i<=number; i++)
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
