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
		String binary = utility.toBinary(number);
		System.out.println("\nBinary Representation of "+number+" is "+binary);
	}
}
