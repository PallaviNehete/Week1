/**
 * created by: Pallavi Nehete.
 * Date: 18/02/2019.
 * Purpose: Check whether it is a Leap Year or not.
 */

package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class LeapYear 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		boolean flag = false;
		System.out.print("Enter Year: ");
		int year = utility.inputInteger();
		if((year <= 9999) || (year > 999))
		{
			flag = utility.isLeapYear(year);
			if(flag)
				System.out.println(year+" is Leap Year");
			else
				System.out.println(year+" is not Leap Year");
		}
		else
			System.out.println("*Please Enter valid year");
	}
}
