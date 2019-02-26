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
		char swapbinary[] = BinarySwapNibbles.swapNibbles(binary);
		System.out.print("After Swapping Nibbles: ");
		for(int k=0; k<swapbinary.length; k++)
		{
			System.out.print(swapbinary[k]);
		}
		System.out.println();
		int swapNo = Integer.parseInt(new String(swapbinary));
		int DecimalNo = binToDec(swapNo);
		System.out.print("\nDecimal of "+swapNo+" is: "+DecimalNo);
	}
	public static char[] swapNibbles(String binary)
	{
		int i = 0;
		char temp;
		char ch[] = binary.toCharArray();
		int j = ch.length-4;
		for(i=0; i<4; i++)
		{
			temp = ch[j];
			ch[j] = ch[i];
			ch[i] = temp;
			j++;
		}
		return ch;
	}
	public static int binToDec(int swapNo)
	{
		int decimal=0, n=0;
		while(swapNo >= 0)
		{
			if(swapNo == 0)
			{  
				break;  
			}
			else
			{  
				int lastDig =swapNo%10;  
				decimal = (int)(decimal+ lastDig*Math.pow(2, n));  
				swapNo = swapNo/10;  
				n++;  
			}  
		}
		return decimal;
	}
}
