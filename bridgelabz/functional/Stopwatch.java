/**
 * created by: Pallavi Nehete.
 * Date: 18/02/2019.
 * Purpose: To measure the elapses between start and end clicks.
 */

package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class Stopwatch 
{
	public static void main(String[] args) 
	{
		Utility u = new Utility();
		long start = 0,stop = 0, diff = 0;
		System.out.print("Enter 1 if you want to start stopwatch: ");
		int srt = u.inputInteger();
		if(srt == 1)
		{
			start = System.currentTimeMillis();
			System.out.println("Starting Time: "+start);
		}
		else
		{
			System.out.println("Please Enter 1 if you want to start stopwatch:");
		
		}
		System.out.print("Enter 2 if you want to stop stopwatch: ");
		int stp = u.inputInteger();
		if(stp == 2)
		{
			stop = System.currentTimeMillis();
			System.out.println("Ending Time: "+stop);
		}
		diff = stop-start;
		System.out.println("\nElapsed Time:"+diff);
	} 
}
