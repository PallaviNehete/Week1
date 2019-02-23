/*	Write a static function toBinary that outputs the binary (base 2) representation of the decimal number typed as the input. It is based on decomposing the number into a sum of powers of 2.
  	For example, the binary representation of 106 is 11010102,
  	which is the same as saying that 106 = 64 + 32 + 8 + 2. Ensure necessary padding to represent 4 Byte String.
	To compute the binary representation of n, we consider the powers of 2 less than or equal to n in decreasing order 
	to determine which belong in the binary decomposition (and therefore correspond to a 1 bit in the binary representation).
 */

package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class Binary 
{
	public static void main(String[] args) 
	{
		Utility u=new Utility();
		System.out.print("Enter the Number: ");
		int num=u.inputInteger();	
		String binary=toBinary(num);
		System.out.println("\nBinary Representation of "+num+" is "+binary);
	}
	public static String toBinary(int num)
	{
		String bin="";
		while(num>0)
		{
			bin=(num%2)+bin;
			num=num/2;
		}
		while(bin.length()<4)
		{
			bin=0+bin;
		}
		return bin;	
	}
}
