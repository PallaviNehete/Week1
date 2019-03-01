/**
 * created by: Pallavi Nehete.
 * Date: 21/02/2019.
 * Purpose: reads in three command-line arguments P, Y, and R and calculates the monthly payment. 
 */

package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class MonthlyPayment 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.print("Enter principal amount:");
		double payment = utility.inputDouble();
		System.out.print("Enter Year: ");
		double year = utility.inputDouble();
		System.out.print("Enter Rate: ");
		double rate = utility.inputDouble();
		System.out.print("Your Mothly Payment is: "+monthPayment(payment,year,rate));
	}
	
	/**
	 * method to calculate Monthly Payment that reads 3 command-line arguments P, Y & R and calculates the monthly payments.
	 * @param principalAmount : Principal loan amount. 
	 * @param year : Number of Years
	 * @param rate : Rate of Interest.
	 * @return : monthly payment.
	 */
	public static double monthPayment(double principalAmount, double year, double rate)
	{
		double n = 12*year;
		double r = rate/(12 * 100);
		double payment = principalAmount * r/(1-Math.pow((1 + r),-n));
		return payment;
	}
}
