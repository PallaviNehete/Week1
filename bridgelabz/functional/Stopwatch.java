/**
 * created by: Pallavi Nehete.
 * Date: 18/02/2019.
 * Purpose: To measure the elapses between start and end clicks.
 */

package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class Stopwatch 
{
	Utility utility = new Utility();
	public static void main(String[] args) 
	{
		Stopwatch stopwatch = new Stopwatch();
		stopwatch.stopwatch();
	} 
	/**
	 * method or measuring the time that elapses between the start and end clicks.
	 */
	public void stopwatch()
	{
		long start = 0,stop = 0, difference = 0;
		System.out.print("Enter 1 if you want to start stopwatch: ");
		int startinput = utility.inputInteger();
		if(startinput == 1)
		{
			start = System.currentTimeMillis();
			System.out.println("Starting Time: "+start);
		}
		else
		{
			System.out.println("Please Enter 1 if you want to start stopwatch:");
		
		}
		System.out.print("Enter 2 if you want to stop stopwatch: ");
		int stopinput = utility.inputInteger();
		if(stopinput == 2)
		{
			stop = System.currentTimeMillis();
			System.out.println("Ending Time: "+stop);
		}
		difference = stop-start;
		System.out.println("\nElapsed Time:"+difference);
	}
}
