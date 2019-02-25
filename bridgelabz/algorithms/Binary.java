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
		Utility u = new Utility();
		System.out.print("Enter the Number: ");
		int num = u.inputInteger();	
		String binary = toBinary(num);
		System.out.println("\nBinary Representation of "+num+" is "+binary);
	}
	public static String toBinary(int num)
	{
		String bin="";
		while(num>0)
		{
			bin = (num%2)+bin;
			num = num/2;
		}
		while(bin.length()<4)
		{
			bin = 0+bin;
		}
		return bin;	
	}
}
