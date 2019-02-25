/**
 * created by: Pallavi Nehete.
 * Date: 18/02/2019.
 * Purpose: Reads in N integers and counts the number of triples that sum to exactly 0.
 */

package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class SumOfThree 
{
	public static void main(String[] args) 
	{
		Utility u = new Utility();
		System.out.print("Enter size of array: ");
		int size = u.inputInteger();
		int a[] = new int[size];
		System.out.println("Enter Elements of Array: ");
		for(int d=0; d<a.length; d++)
		{
			a[d] = u.inputInteger();
		}
		int noOfTriplets = threeInteger(a,size);
		if(noOfTriplets > 0)
		{
			System.out.println("Number of Triplets: "+noOfTriplets);
		}
		else
		{
			System.out.println("Triplets Not Found");
		}
	}
	public static int threeInteger(int arr[], int n)
	{
		int count = 0;
		System.out.println("Triplets Are: ");
		for(int i=0; i<=n-2; i++)
		{
			for(int j=i+1; j<n-1; j++)
			{
				for(int k=j+1; k<n; k++)
				{
					if(arr[i]+arr[j]+arr[k] == 0)
					{
						System.out.print(arr[i]+" ");
						System.out.print(arr[j]+" ");
						System.out.print(arr[k]+" \n");
						count++;
					}
				}
			}
		}
		return count;
	}
}
