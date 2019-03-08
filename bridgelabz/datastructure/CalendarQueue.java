/**
 * created by: Pallavi Nehete.
 * Date: 08/03/2019.
 * Purpose: Takes the month & year as a input from user and print the Calendar of the month using Queue.
 */

package com.bridgelabz.datastructure;
import com.bridgelabz.utility.Utility;
public class CalendarQueue 
{
	static Utility utility = new Utility();
	QueueLinkedList queueDay = new QueueLinkedList();
	QueueLinkedList queueDate = new QueueLinkedList();
	int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
	public static void main(String[] args) 
	{
		CalendarQueue calender = new CalendarQueue();
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
					calender.displayCalendar(month, year);
				}
				else
					System.out.println("*Please Enter valid Year");
			}
			else
				System.out.println("*Please Enter valid Month");
		}while((month<=0) || (month>12) || (year<=999) || (year>9999));
	}
	
	/**
	 * Method to initialize Dates and Days in Queue. 
	 */
	public void setDueueDayDate()
	{
		queueDay.enqueue("Sun");
		queueDay.enqueue("Mon");
		queueDay.enqueue("Tue");
		queueDay.enqueue("Wed");
		queueDay.enqueue("Thu");
		queueDay.enqueue("Fri");
		queueDay.enqueue("Sat");
		for(int i=1; i<32; i++)
		{
			queueDate.enqueue(i);
		}
		queueDay.display();
	}
	
	/**
	 * Method to display Calendar.
	 * @param month : Month entered by user.
	 * @param year : Year entered by user.
	 */
	public void displayCalendar(int month, int year)
	{
		System.out.println("\n# java Calender "+month+" "+year);
		System.out.println(months[month-1]+" "+year+"\n");
		setDueueDayDate();
		int startingDay = utility.dayOfWeek(month, year);
		setCalendar(month, startingDay, year);
	}
	
	/**
	 * Method to set Calendar according to user input.
	 * @param month : Month entered by user.
	 * @param startingDay : Starting day of Month.
	 * @param year : Year entered by user.
	 */
	public void setCalendar(int month, int startingDay, int year)
	{
		System.out.println();
		if(month == 2 && utility.isLeapYear(year))				// set 29 days for February for Leap year. 
		{	
			days[1] = 29;
		}
		for(int i=0; i<startingDay; i++)						// spacing for before starting days.
		{
			System.out.print("\t");
		}
		int day = 0;
		for(int i=0; i<queueDay.getListSize(); i++)
		{
			for(int j=0; j<queueDate.getListSize(); j++)
			{
				if(days[month-1] != day)
				{
					if((j+startingDay) % 7 == 0)
					{
						System.out.println();
					}
					System.out.print(queueDate.getObject(day)+"\t");
					day++;
				}	
			}
		}
	}
}
