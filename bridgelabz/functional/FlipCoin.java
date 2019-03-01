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
			flip.percentageHead(noOfToss);
		}
		else
			System.out.println("*Please Enter valid number");
	}

	/**
	 * method to find percentage of head.
	 * @param noOfToss : number of times to Flip Coin.
	 */
	public void percentageHead(double noOfToss)
	{
		double ramdomNum = Math.random();
		int noOfTails = 0, noOfHeads = 0;
		double percTails=0;
		if(ramdomNum < 0.5)
			noOfTails++;
		else
			noOfHeads++;
		percTails = noOfTails/noOfToss*100;
		System.out.println("Percentage of Tail: "+percTails);
		System.out.println("Percentage of Head: "+(100 - percTails));
	}
}

