/*	Write Binary.java to read an integer as an Input, convert to Binary using toBinary function
  	and perform the following functions.
	i. Swap nibbles and find the new number.
	ii. Find the resultant number is the number is a power of 2.
	A nibble is a four-bit aggregation, or half an octet. There are two nibbles in a byte.
	Given a byte, swap the two nibbles in it. For example 100 is to be represented as 01100100 in a byte (or 8 bits).
	The two nibbles are (0110) and (0100). If we swap the two nibbles, we get 01000110 which is 70 in decimal.	*/



package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class BinarySwapNibbles 
{
	public static void main(String[] args) 
	{
		Utility u=new Utility();
		System.out.print("Enter the Number: ");
		int num=u.inputInteger();
		String bin=Integer.toBinaryString(num);
		while(bin.length() < 8)
		{
			bin=0+bin;
		}
		System.out.println("Binary Number of "+num+" is: "+bin);
		char swapbinary[]=BinarySwapNibbles.swapNibbles(bin);
		System.out.print("After Swapping Nibbles: ");
		for(int k=0;k<swapbinary.length;k++)
		{
			System.out.print(swapbinary[k]);
		}
		System.out.println();
		int swapNo=Integer.parseInt(new String(swapbinary));
		int DecimalNo=binToDec(swapNo);
		System.out.print("\nDecimal of "+swapNo+" is: "+DecimalNo);
	}
	public static char[] swapNibbles(String bin)
	{
		int i=0;
		char temp;
		char ch[]=bin.toCharArray();
		int j=ch.length-4;
		for(i=0;i<4;i++)
		{
			temp=ch[j];
			ch[j]=ch[i];
			ch[i]=temp;
			j++;
		}
		return ch;
	}
	public static int binToDec(int swapNo)
	{
		int decimal=0, n=0;
		while(swapNo>=0)
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
