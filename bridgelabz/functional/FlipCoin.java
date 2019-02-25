/**
 * created by: Pallavi Nehete.
 * Date: 18/02/2019.
 * Purpose: Flip Coin and prints percentage of Heads and Tails.
 */

package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class FlipCoin 
{
	public static void main(String[] args) 
	{
		Utility u = new Utility();
		System.out.print("Enter Number of Times You Want to Flip Coin: ");
		int noOfToss = u.inputInteger();
		double noOfHeads = Math.random();
		double noOfTails = Math.random();
		double percHead = 0,percTail=0;
		if(noOfToss > 0)
		{
			if(noOfTails < 0.5)
			{
				percHead = noOfHeads/noOfToss*100;
			}
			else
			{
				percTail = noOfTails/noOfToss*100;
			}
		}
		else
		{
			System.out.println("Please Enter valid number");
		}
		System.out.println("\nPercentage of Head: "+percHead);
		System.out.println("Percentage of Tail: "+percTail);
	}
}
