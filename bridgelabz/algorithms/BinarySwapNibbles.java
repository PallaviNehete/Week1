/**
 * created by: Pallavi Nehete.
 * Date: 22/02/2019.
 * Purpose: convert to Binary using toBinary function and perform the following functions.
 *	i. Swap nibbles and find the new number.
 *	ii. Find the resultant number is the number is a power of 2.
 */

package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class BinarySwapNibbles 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.print("Enter the Number: ");
		int number = utility.inputInteger();
		String binary = Integer.toBinaryString(number);
		while(binary.length() < 8)
		{
			binary = 0+binary;
		}
		System.out.println("Binary Number of "+number+" is: "+binary);
		char swapbinary[] = utility.swapNibbles(binary);
		System.out.print("After Swapping Nibbles: ");
		for(int i=0; i<swapbinary.length; i++)
		{
			System.out.print(swapbinary[i]);
		}
		System.out.println();
		int swapNo = Integer.parseInt(new String(swapbinary));
		int DecimalNo = utility.binaryToDecimal(swapNo);
		System.out.print("\nDecimal of "+swapNo+" is: "+DecimalNo);
	}
}
