/*	To the Util Class add dayOfWeek static function that takes a date as input and prints the day of the week that date falls on. 
 	Your program should take three command-line arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth.
 	For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas, for the Gregorian calendar (where / denotes integer division):
	y0 = y − (14 − m) / 12
	x = y0 + y0/4 − y0/100 + y0/400
	m0 = m + 12 × ((14 − m) / 12) − 2
	d0 = (d + x + 31m0 / 12) mod 7	*/


package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class DaysOfWeek 
{
	public static void main(String[] args) 
	{
		Utility u=new Utility();
		int date,month,year;
		do
		{
			System.out.print("Enter Year: ");
			year=u.inputInteger();
		}while(!(year>999 && year<9999));
		do
		{
			System.out.print("Enter Month: ");
			month=u.inputInteger();
		}while(!(month>0 && month<13));
		do 
		{
			System.out.print("Enter Date: ");		
			date=u.inputInteger();
		}while(!(date>0 && date<32));
		DaysOfWeek.Date(year, month, date);
	}
	public static void Date(int year, int month, int day)
	{
		int y0 = year - (14 - month) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = month + 12 * ((14 - month) / 12) - 2;
		int d0 = (day + x + (31 * m0) / 12) % 7;
		switch (d0) 
		{
		case 0:
			System.out.println("\nIt's Sunday");
			break;
		case 1:
			System.out.println("\nIt's Monday");
			break;
		case 2:
			System.out.println("\nIt's Tuesday");
			break;
		case 3:
			System.out.println("\nIt's Wednesday");
			break;
		case 4:
			System.out.println("\nIt's Thursday");
			break;
		case 5:
			System.out.println("\nIt's Friday");
			break;
		case 6:
			System.out.println("\nIt's Saturday");
			break;
		default:
			break;
		}
	}
}
