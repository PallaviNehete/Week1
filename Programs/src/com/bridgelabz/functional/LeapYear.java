/*	Leap Year
	I/P -> Year, ensure it is a 4 digit number.
	Logic -> Determine if it is a Leap Year.
	O/P -> Print the year is a Leap Year or not.	*/

package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class LeapYear 
{
	public static void main(String[] args) 
	{
		Utility u=new Utility();
		boolean flag=false;
		System.out.print("Enter Year: ");
		int year=u.inputInteger();
		if((year<=9999) || (year>999))
		{
			flag=u.isLeapYear(year);
			if(flag)
			{
				System.out.println(year+" is Leap Year");
			}
			else
			{
				System.out.println(year+" is not Leap Year");
			}
		}
		else
		{
			System.out.println("Please Enter right year");
		}
	}
}
