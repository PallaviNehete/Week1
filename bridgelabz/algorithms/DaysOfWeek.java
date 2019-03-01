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
		Utility utility = new Utility();
		int date,month,year;
		do
		{
			System.out.print("Enter Year: ");
			year = utility.inputInteger();
		}while(!(year>999 && year<9999));
		do
		{
			System.out.print("Enter Month: ");
			month = utility.inputInteger();
		}while(!(month>0 && month<13));
		do 
		{
			System.out.print("Enter Date: ");		
			date = utility.inputInteger();
		}while(!(date>0 && date<32));
		int day = utility.dayWeek(year, month, date);
		switch (day) 
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
