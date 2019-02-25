/**
 * created by: Pallavi Nehete.
 * Date: 21/02/2019.
 * Purpose: Convert temperature from Celsius to Fahrenheit or Fahrenheit to Celsius.
 */

package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class TemperatureConvertor 
{
	public static void main(String[] args) 
	{
		Utility u = new Utility();
		double cel1, fah1, cel2,fah2;
		System.out.println("TEMPERATURE CONVERTOR");
		System.out.println();
		System.out.println("1. Celsius to Fahrenheit");
		System.out.println("2. Fahrenheit to Celsius");
		System.out.println();
		System.out.print("Enter your choice: ");
		int ch = u.inputInteger();
		switch(ch)
		{
		case 1: 
			System.out.print("Enter temperature in calsius: ");
			cel1 = u.inputDouble();
			fah1 = (cel1*9/5)+32;
			System.out.println("Temperature in Fahrenheit is "+fah1);
			break;
		case 2:
			System.out.print("Enter temperature in Fahrenheit: ");
			fah2 = u.inputDouble();
			cel2 = (fah2-32)*5/9;
			System.out.println("Temperature inn Calsius is "+cel2);
			break;
		default:
			System.out.println("INVAILD CHOICE... Please Enter right choice");
			break;
		}
	}
}
