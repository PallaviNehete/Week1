/*	Simulate Stopwatch Program
	Desc -> Write a Stopwatch Program for measuring the time that elapses between the start and end clicks
	I/P -> Start the Stopwatch and End the Stopwatch
	Logic -> Measure the elapsed time between start and end
	O/P -> Print the elapsed time.	*/


package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class Stopwatch 
{
	public static void main(String[] args) 
	{
		Utility u=new Utility();
		long start=0,stop=0, diff=0;
		System.out.print("Enter 1 if you want to start stopwatch: ");
		int srt= u.inputInteger();
		if(srt==1)
		{
			start=System.currentTimeMillis();
			System.out.println("Starting Time: "+start);
		}
		else
		{
			System.out.println("Please Enter 1 if you want to start stopwatch:");
		
		}
		System.out.print("Enter 2 if you want to stop stopwatch: ");
		int stp= u.inputInteger();
		if(stp==2)
		{
			stop=System.currentTimeMillis();
			System.out.println("Ending Time: "+stop);
		}
		diff=stop-start;
		System.out.println("\nElapsed Time:"+diff);
	} 
}
