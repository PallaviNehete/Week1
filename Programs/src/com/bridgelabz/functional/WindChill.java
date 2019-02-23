/*	Write a program WindChill.java that takes two double command-line arguments t and v 
 	and prints the wind chill. Use Math.pow(a, b) to compute ab. 
	Given the temperature t (in Fahrenheit) and the wind speed v (in miles per hour), 
	the National Weather Service defines the effective temperature (the wind chill) to be:
				w=35.74+0.6215t+(0.4275t-35.75)v^0.16
	Note: the formula is not valid if t is larger than 50 in absolute value or
	if v is larger than 120 or less than 3 (you may assume that the values you get are in that range).
 */


package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class WindChill 
{
	public static void main(String[] args)
	{
		Utility u=new Utility();
		int speed,temp;
		System.out.println("ENTER TEMPERATURE: ");
		System.out.println("(please enter temperature in fahrenheit)");
		temp= u.inputInteger();
		System.out.println("ENTER WIND SPEED: ");
		System.out.println("(please enter wind speed in miles/hour)");
		speed= u.inputInteger();
		if(temp<=50 && (speed<=120 && speed>=3))
		{
			double w=35.74+0.6215*temp+((0.4275*temp)-35.75)*(Math.pow(speed, 0.16));
			System.out.println("\nWnid Chill: "+w);
		}
		else
		{
			System.out.println("Please Enter Temperature less than 50 or speed is between 3 to 120");
		}
	}
}

