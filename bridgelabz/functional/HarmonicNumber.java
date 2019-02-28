/**
 * created by: Pallavi Nehete.
 * Date: 18/02/2019.
 * Purpose: Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
 */

package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class HarmonicNumber 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		HarmonicNumber harmonic = new HarmonicNumber();
		System.out.print("Enter the number that you want to print harmonic series: ");
		int number = utility.inputInteger();
		harmonic.harmonic(number);
	}
	
	/**
	 * method to find n-th harmonic number.
	 * @param number : number to find harmonic number.
	 */
	public void harmonic(int number)
	{
		int temp = number;
		double harmonic = 0;
		if(number > 0)
		{
			while(number > 0)
			{
				harmonic = harmonic+(double)1/number;
				number--;	
			}
			System.out.println("\n"+temp+"th Harmonic number is: "+harmonic);
		}
		else
		{
			System.out.println("\n*Please Enter Number Greater than zero");
		}
	}
}