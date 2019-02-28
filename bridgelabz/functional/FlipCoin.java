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
		Utility utility = new Utility();
		FlipCoin flip = new FlipCoin();
		System.out.print("Enter Number of Times You Want to Flip Coin: ");
		int noOfToss = utility.inputInteger();
		if(noOfToss>0)
		{
			double percentagHead = flip.percentageHead(noOfToss);
			System.out.println("Percentage of Head: "+percentagHead);
			System.out.println("Percentage of Tails: "+(100-percentagHead));
		}
		else
		{
			System.out.println("*Please Enter valid number");
		}
	}
	
	/**
	 * method to find percentage of head.
	 * @param noOfToss : number of times to Flip Coin.
	 * @return : percentage of head.
	 */
	public double percentageHead(double noOfToss)
	{
		double noOfHeads = Math.random();
		double noOfTails = Math.random();
		double percHead = 0, percTail=0;
		if(noOfToss > 0)
		{
			if(noOfTails < 0.5)
			{
				percHead = noOfHeads/noOfToss*100;
			}
		}
		else
		{
			System.out.println("Please Enter valid number");
		}
		return percHead;
	}
}
