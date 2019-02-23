/*	Gambler
	Desc -> Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number of times he/she wins and the number of bets he/she makes. Run the experiment N times, averages the results, and prints them out.
	I/P -> $Stake, $Goal and Number of times
	Logic -> Play till the gambler is broke or has won
	O/P -> Print Number of Wins and Percentage of Win and Loss.		*/

package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class Gambler 
{
	public static void main(String[] args) 
	{
		Utility u=new Utility();
		int goal,stake,trials,bets=0,win=0;
		System.out.print("Enter no of stake: ");
		stake= u.inputInteger();
		System.out.print("Enter Excpecting goal: ");
		goal= u.inputInteger();
		System.out.print("Enter Number of Trails: ");
		trials= u.inputInteger();
		for (int i=0; i<trials; i++) 
		{
            int cash=stake;
            while (cash>0 && cash<goal) 
            {
                bets++;
                if (Math.random()<0.5)
                {
                	cash++;
                }
                else
                {
                	cash--;   
                }
            }
            if (cash==goal)
            {
            	win++;
           	}
        }
		double perc=100.0*win/trials;
        System.out.println(win+ " wins of "+trials+" trials");
        System.out.println("Percent of games won: " +perc);
        System.out.println("Percent of games loss: "+(100-perc));
	}
}
