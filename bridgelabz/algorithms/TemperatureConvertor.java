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
		double celsius1, fahrenheit1, celsius2, fahrenheit2;
		System.out.println("TEMPERATURE CONVERTOR\n");
		System.out.println("1. Celsius to Fahrenheit");
		System.out.println("2. Fahrenheit to Celsius\n");
		System.out.print("Enter your choice: ");
		int choice = u.inputInteger();
		switch(choice)
		{
		case 1: 
			System.out.print("\nEnter temperature in calsius: ");
			celsius1 = u.inputDouble();
			fahrenheit1 = TemperatureConvertor.celsiusToFahrenheit(celsius1);
			System.out.println("Temperature in Fahrenheit is "+fahrenheit1);
			break;
		case 2:
			System.out.print("\nEnter temperature in Fahrenheit: ");
			fahrenheit2 = u.inputDouble();
			celsius2 = TemperatureConvertor.fahrenheitToCelsius(fahrenheit2);
			System.out.println("Temperature inn Calsius is "+celsius2);
			break;
		default:
			System.out.println("INVAILD CHOICE... Please Enter right choice");
			break;
		}
	}
	/**
	 * method to Convert temperature from Celsius to Fahrenheit.
	 * @param celsius1 : temperature in celsius to convert in fahrenheit.
	 * @return :  temperature in fahrenheit.
	 */
	public static double celsiusToFahrenheit(double celsius1)
	{
		double	fahrenheit1 = (celsius1*9/5)+32;
		return fahrenheit1;
	}
	/**
	 * Convert temperature from  Fahrenheit to Celsius.
	 * @param fahrenheit2 :  temperature in fahrenheit to convert in celsius.
	 * @return :  temperature in celsius.
	 */
	public static double fahrenheitToCelsius (double fahrenheit2)
	{
		double	celsius2 = (fahrenheit2-32)*5/9;
		return celsius2;
	}
}
