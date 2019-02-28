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
		Utility utility = new Utility();
		System.out.print("Enter size of array: ");
		int size = utility.inputInteger();
		int array[] = new int[size];
		System.out.println("Enter Elements of Array: ");
		utility.insertInArrayInt(array);
		int noOfTriplets = triplets(array,size);
		if(noOfTriplets > 0)
		{
			System.out.println("Number of Triplets: "+noOfTriplets);
		}
		else
		{
			System.out.println("Triplets Not Found");
		}
	}
	
	/**
	 * counts the number of triples that sum to exactly 0.
	 * @param array : array of Integers.
	 * @param size : size of an array.
	 * @return : number of triplets.
	 */
	public static int triplets(int array[], int size)
	{
		int count = 0;
		System.out.println("Triplets Are: ");
		for(int i=0; i<=size-2; i++)
		{
			for(int j=i+1; j<size-1; j++)
			{
				for(int k=j+1; k<size; k++)
				{
					if(array[i]+array[j]+array[k] == 0)
					{
						System.out.print(array[i]+" ");
						System.out.print(array[j]+" ");
						System.out.print(array[k]+" \n");
						count++;
					}
				}
			}
		}
		return count;
	}
}
