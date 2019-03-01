/**
 * created by: Pallavi Nehete.
 * Date: 21/02/2019.
 * Purpose: To find binary representation of decimal number.
 */

package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class Binary 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.print("Enter the Number: ");
		int number = utility.inputInteger();	
		String binary = toBinary(number);
		System.out.println("\nBinary Representation of "+number+" is "+binary);
	}
	/**
	 * to find binary representation of a decimal number.
	 * @param number : number to find binary representation.
	 * @return : binary representation of a decimal number.
	 */
	public static String toBinary(int number)
	{
		String binary="";
		while(number > 0)
		{
			binary = (number%2) + binary;
			number = number/2;
		}
		while(binary.length()<4)
		{
			binary = 0+binary;
		}
		return binary;	
	}
}
