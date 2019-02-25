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
		Utility u = new Utility();
		System.out.print("Enter principal amount:");
		double payment = u.inputDouble();
		System.out.print("Enter Year: ");
		double year = u.inputDouble();
		System.out.print("Enter Rate: ");
		double rate = u.inputDouble();
		System.out.print("Your Mothly Payment is: "+monthPayment(payment,year,rate));
	}
	public static double monthPayment(double p, double y, double r)
	{
		double n = 12*y;
		double r0 = r/(12 * 100);
		double payment = p*r0/(1-Math.pow((1 + r0),-n));
		return payment;
	}
}
