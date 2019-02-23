/*	Flip Coin and print percentage of Heads and Tails
	I/P -> The number of times to Flip Coin. Ensure it is positive integer.
	Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
	O/P -> Percentage of Head vs Tails		*/

package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class FlipCoin 
{
	public static void main(String[] args) 
	{
		Utility u=new Utility();
		System.out.print("Enter Number of Times You Want to Flip Coin: ");
		int noOfToss=u.inputInteger();
		double noOfHeads=Math.random();
		double noOfTails=Math.random();
		double percHead=0,percTail=0;
		if(noOfToss>0)
		{
			if(noOfTails<0.5)
			{
				percHead=noOfHeads/noOfToss*100;
			}
			else
			{
				percTail=noOfTails/noOfToss*100;
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
