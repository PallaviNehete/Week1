/*	Bubble Sort 
	Desc -> Reads in integers prints them in sorted order using Bubble Sort
	I/P -> read in the list ints
	O/P -> Print the Sorted List 	*/

package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class BubbleSort 
{
	public static void main(String[] args) 
	{
		Utility u= new Utility();
		System.out.print("Enter Size of Array: ");
		int size= u.inputInteger();
		int array[]= new int[size];
		System.out.println("Enter Elements of Array: ");
		u.InsertInArrayInt(array);
		u.BubbleSortInt(array);
		System.out.println("\nSorted Array: ");
		u.printIntArr(array);
	}
}
