/*	Write a program Calendar.java that takes the month and year as command-line arguments
 	and prints the Calendar of the month. Store the Calendar in an 2D Array,
 	the first dimension the week of the month and the second dimension stores the day of the week.
 	Print the result as following.	*/

package com.bridgelabz.datastructure;
import com.bridgelabz.utility.Utility;
public class Calender 
{
	Utility u=new Utility();
	public static void main(String[] args) 
	{
		Calender c=new Calender();
		c.calender();
	}
	public void calender()
	{
		Utility u=new Utility();
		System.out.print("Enter Year: ");
		int year= u.inputInteger();
		if(year>999 && year<10000)
		{
			System.out.print("Enter Month: ");
			int month= u.inputInteger();
			if(month>0 && month<13)
			{
				System.out.println();
				String months[]={"","January","February","March","April","May","June","July","August","September","October","November","December"};
				int days[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
				if(month==2 && u.isLeapYear(year))
				{	
					days[month]=29;
				}
				System.out.println("# java calendar "+month+" "+year);
				System.out.println("\n "+months[month]+" "+year);
				System.out.println(" S   M  Tu   W  Th   F   S");
				int day=countDay(year, month,1);
				for (int i=0; i<=day; i++)
				{
					System.out.print("   ");
				}
				for (int i=1; i<=days[month]; i++) 
				{
					if(i<10)
					{
						System.out.print(" "+i+"  ");
					}
					else
					{
						System.out.print(i+"  ");
					}
					if ((i+day)%7==0)
					{
						System.out.println();    	
					}
				}
			}
			else
			{
				System.out.println("*Please Enter Valid Month\n");
				calender();
			}
		}
		else
		{
			System.out.println("*Please Enter Valid Year\n");
			calender();
		}
	}
	public static int countDay(int year, int month, int date)
	{
		int y= year-(14-month)/12;
		int x= y+y/4-y/100+y/400;
		int m= month+12*((14-month)/12)-2;
		int d= (date+x+(31*m)/12)%7;
		return d;
	}
}
