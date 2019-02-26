/**
 * created by: Pallavi Nehete.
 * Date: 18/02/2019.
 * Purpose: Takes two double command-line arguments t and v and prints the wind chill.
 */

package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class WindChill 
{
	public static void main(String[] args)
	{
		Utility utility = new Utility();
		int speed,temperature;
		System.out.println("ENTER TEMPERATURE: ");
		System.out.println("(please enter temperature in fahrenheit)");
		temperature = utility.inputInteger();
		System.out.println("ENTER WIND SPEED: ");
		System.out.println("(please enter wind speed in miles/hour)");
		speed = utility.inputInteger();
		if(temperature <= 50 && (speed <= 120 && speed >= 3))
		{
			double w = 35.74+0.6215*temperature+((0.4275*temperature)-35.75)*(Math.pow(speed, 0.16));
			System.out.println("\nWnid Chill: "+w);
		}
		else
		{
			System.out.println("Please Enter Temperature less than 50 or speed is between 3 to 120");
		}
	}
}

