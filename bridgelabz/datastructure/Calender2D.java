/**
 * created by: Pallavi Nehete.
 * Date: 04/03/2019.
 * Purpose: Takes the month & year as a input from user and print the Calendar of the month using 2D array.
 */

package com.bridgelabz.datastructure;
import com.bridgelabz.utility.Utility;
public class Calender2D 
{
	static Utility utility = new Utility();
	int calendar[][] = new int[6][7];
	int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
	public static void main(String[] args) 
	{
		Calender2D calender = new Calender2D();
		int month = 0, year = 0;
		do 
		{
			System.out.print("Enter Month: ");
			month = utility.inputInteger();
			if(month>0 && month<13)
			{
				System.out.print("Enter Year: ");
				year = utility.inputInteger();
				if(year>999 && year<9999)
				{
					calender.dispCalendar(month, year);
				}
				else
					System.out.println("*Please Enter valid Year");
			}
			else
				System.out.println("*Please Enter valid Month");
		}while((month<=0) || (month>12) || (year<=999) || (year>9999));
	}

	/**
	 * method to display calendar.
	 * @param month : month entered by user.
	 * @param year : year entered by user.
	 */
	void dispCalendar(int month, int year) 
	{
		System.out.println("\n# java Calender "+month+" "+year);
		System.out.println(months[month-1]+" "+year);
		int startingDay = utility.dayOfWeek(month, year);
		displayCalendar(month, startingDay, year);
	}

	/**
	 * set calendar according to month & year entered by user.
	 * @param month : month entered by user.
	 * @param startingDay : starting day of user.
	 * @param year : year entered by user.
	 */
	void displayCalendar(int month, int startingDay, int year)
	{
		System.out.println("\nSun	Mon	Tue	Wed	Thu	Fri	Sat");
		if(month == 2 && utility.isLeapYear(year))				// set 29 days for February for Leap year. 
		{	
			days[1] = 29;
		}
		for(int i=0; i<startingDay; i++)						// spacing for before starting days.
		{
			System.out.print("\t");
		}
		int day = 0;											
		for(int i=0; i<calendar.length; i++)					// set calendar according to user input.
		{	
			for(int j=0; j<calendar[i].length; j++)
			{
				if(days[month-1] != day)
				{
					day++;
					calendar[i][j] = day;
					if((j+startingDay) % 7 == 0)				// to print next line.
					{
						System.out.println();
					}
					if(calendar[i][j] < 10)
					{
						System.out.print(" "+calendar[i][j]+"\t");
					}
					else
						System.out.print(calendar[i][j]+"\t");
				}
			}
		}
	}
}
