/*	Harmonic Number 
	Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N (http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
	I/P -> The Harmonic Value N. Ensure N != 0
	Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
	O/P -> Print the Nth Harmonic Value.	*/

package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class HarmonicNumber 
{
	public static void main(String[] args) 
	{
		Utility u=new Utility();
		System.out.print("Enter the number that you want to print harmonic series: ");
		int num= u.inputInteger();
		int temp=num;
		double hs=0;
		if(num>0)
		{
			while(num>0)
			{
				hs=hs+(double)1/num;
				num--;	
			}
			System.out.print("\n"+temp+"th Harmonic number is: "+hs);
		}
		else
		{
			System.out.println("\n*Please Enter Number Greater than zero");
		}
	}
}