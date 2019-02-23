/*	Write a Util Static Function to calculate monthlyPayment that reads in three command-line
  	arguments P, Y, and R and calculates the monthly payments you would have to make over Y years 
  	to pay off a P principal loan amount at R per cent interest compounded monthly. The formula is The formula is	*/

package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class MonthlyPayment 
{
	public static void main(String[] args) 
	{
		Utility u=new Utility();
		MonthlyPayment mp=new MonthlyPayment();
		System.out.print("Enter principal amount:");
		double payment = u.inputDouble();
		System.out.print("Enter Year: ");
		double year = u.inputDouble();
		System.out.print("Enter Rate: ");
		double rate = u.inputDouble();
		System.out.print("Your Mothly Payment is: "+mp.monthPayment(payment,year,rate));
	}
	public double monthPayment(double p, double y, double r)
	{
		double n = 12*y;
		double r0 = r/(12 * 100);
		double payment = p*r0/(1-Math.pow((1 + r0),-n));
		return payment;
	}
}
