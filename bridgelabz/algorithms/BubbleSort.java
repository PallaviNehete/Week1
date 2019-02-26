/**
 * created by: Pallavi Nehete.
 * Date: 23/02/2019.
 * Purpose: Reads in integers prints them in sorted order using Bubble Sort.
 */

package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class BubbleSort 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.print("Enter Size of Array: ");
		int size = utility.inputInteger();
		int array[] = new int[size];
		System.out.println("Enter Elements of Array: ");
		utility.InsertInArrayInt(array);
		utility.BubbleSortInt(array);
		System.out.println("\nSorted Array: ");
		utility.printIntArr(array);
	}
}
