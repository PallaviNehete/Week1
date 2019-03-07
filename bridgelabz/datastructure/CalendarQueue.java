package com.bridgelabz.datastructure;
import com.bridgelabz.utility.Utility;
public class CalendarQueue 
{
	static Utility utility = new Utility();
	QueueLinkedList queueDay = new QueueLinkedList();
	QueueLinkedList queueDate = new QueueLinkedList();
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
					calender.dispCalender(month, year);
				}
				else
					System.out.println("*Please Enter valid Year");
			}
			else
				System.out.println("*Please Enter valid Month");
		}while((month<=0) || (month>12) || (year<=999) || (year>9999));
	}
	
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
	}
	
	public void setCalendar()
	{
		
	}
	public int dayOfWeek(int month, int year) 
	{
		int d = 1;
		int y0 = year - (14 - month) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = month + 12 * ((14 - month) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return d0;
	}
	
}
