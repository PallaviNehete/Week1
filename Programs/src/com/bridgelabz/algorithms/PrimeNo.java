/*	Take a range of 0 - 1000 Numbers and find the Prime numbers in that range. 	*/

package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class PrimeNo 
{
	public static void main(String[] args) 
	{
		int num=0;
		while(num<1000)
		{
			int n=Utility.IsPrimeNumber(num);
			if(n!=0)
			{
				System.out.print(n+" ,");
			}
			num++;
		}
	}
}