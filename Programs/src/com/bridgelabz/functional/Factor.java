/*	Factors
	Desc -> Computes the prime factorization of N using brute force.
	I/P -> Number to find the prime factors
	Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
	O/P -> Print the prime factors of number N. 	*/


package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class Factor 
{
	public static void main(String[] args) 
	{
		Utility u=new Utility();
		System.out.print("Enter Number to find all Prime Factors: ");
		int num= u.inputInteger();
		System.out.println("Prime Factors is:- ");
		while(num%2==0)
		{
			System.out.println("2");
			num=num/2;
		}
		for(int i=3;i<=Math.sqrt(num);i++)
		{
			while(num%i==0)
			{
				System.out.print(i+",");
				num=num/i;
			}
		}
		if(num>2)
		{
			System.out.print(num);
		}
	}
}
