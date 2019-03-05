/**
 * created by: Pallavi Nehete.
 * Date: 18/02/2019.
 * Purpose: Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke or reach $goal.
 * Keeps track of the number of times he/she wins and the number of bets he/she makes. Run the experiment N times, averages the results,
 * and prints them out.
 */

package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class Gambler 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		Gambler gambler = new Gambler();
		int goal, stake, trials;
		System.out.print("Enter no of stake: ");
		stake = utility.inputInteger();
		System.out.print("Enter Excpecting goal: ");
		goal = utility.inputInteger();
		System.out.print("Enter Number of Trails: ");
		trials = utility.inputInteger();
		double percentageWin = gambler.percentageWin(stake, goal, trials);
		System.out.println("Percent of games won: " +percentageWin);
		System.out.println("Percent of games loss: "+(100-percentageWin));
	}

	/**
	 * method to find percentage of win.
	 * @param stake : stack should be less than goal.
	 * @param goal : goal is a money wanted to win by gambler.
	 * @param trials : number of trials.
	 * @return : percentage of win.
	 */
	public double percentageWin(int stake, int goal, int trials)
	{
		int  win = 0;
		for (int i=0; i<trials; i++) 
		{
			int cash = stake;
			while (cash>0 && cash<goal) 
			{
				if (Math.random()<0.5)
					cash++;
				else
					cash--;   
			}
			if (cash == goal)
			{
				win++;
			}
		}
		double percentageWin = 100.0*win/trials;
		System.out.println(win+ " wins of "+trials+" trials");
		return percentageWin;
	}
}
