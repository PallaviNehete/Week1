/**
 * created by: Pallavi Nehete.
 * Date: 21/02/2019.
 * Purpose: Takes a date as input and prints the day of the week that date falls on. 
 */

package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class DaysOfWeek 
{
	public static void main(String[] args) 
	{
		Utility u = new Utility();
		int date,month,year;
		do
		{
			System.out.print("Enter Year: ");
			year = u.inputInteger();
		}while(!(year>999 && year<9999));
		do
		{
			System.out.print("Enter Month: ");
			month = u.inputInteger();
		}while(!(month>0 && month<13));
		do 
		{
			System.out.print("Enter Date: ");		
			date = u.inputInteger();
		}while(!(date>0 && date<32));
		DaysOfWeek.dayWeek(year, month, date);
	}
	public static void dayWeek(int year, int month, int day)
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
