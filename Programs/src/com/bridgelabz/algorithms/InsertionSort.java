/*	Insertion Sort 
	Desc -> Reads in strings from standard input and prints them in sorted order.
	Uses insertion sort.
	I/P -> read in the list words
	Logic -> Use Insertion Sort to sort the words in the String array
	O/P -> Print the Sorted List	*/

package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class InsertionSort 
{
	public static void main(String[] args) 	
	{
		Utility u=new Utility();
		System.out.print("Enter Size of Array: ");
		int size=u.inputInteger();
		String array[]=new String[size];
		System.out.println("Enter Elements of Array: ");
		u.InsertInArrayString(array);
		u.InsertionSortString(array);
        System.out.println("\nSorted Array: ");
        u.printIntString(array);
	}	
}
