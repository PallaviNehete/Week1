/*	Sum of three Integer adds to ZERO
	Desc -> A program with cubic running time. Read in N integers and counts the   number of triples that sum to exactly 0.
	I/P -> N number of integer, and N integer input array
	Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
	O/P -> One Output is number of distinct triplets as well as the second output is to print the distinct triplets.
*/


package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class SumOfThree 
{
	public static void main(String[] args) 
	{
		Utility u=new Utility();
		System.out.print("Enter size of array: ");
		int size=u.inputInteger();
		int a[]=new int[size];
		System.out.println("Enter Elements of Array: ");
		for(int d=0;d<a.length;d++)
		{
			a[d]=u.inputInteger();
		}
		threeInteger(a,size);
	}
	public static void threeInteger(int arr[], int n)
	{
		boolean flag = false;
		System.out.print("Triplets Are: ");
		for(int i=0;i<=n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						System.out.print(arr[i]+" ");
						System.out.print(arr[j]+" ");
						System.out.print(arr[k]+" \n");
						flag=true;
					}
				}
			}
		}
		if(flag!=true)
		{
			System.out.println("Triplets Not Exist in Array");
		}
	}
}
