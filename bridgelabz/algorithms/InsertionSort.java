/**
 * created by: Pallavi Nehete.
 * Date: 23/02/2019.
 * Purpose: Reads a strings from standard input and prints them in sorted order using insertion sort.
 */

package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class InsertionSort 
{
	public static void main(String[] args) 	
	{
		Utility utility = new Utility();
		System.out.print("Enter Size of Array: ");
		int size = utility.inputInteger();
		String array[] = new String[size];
		System.out.println("Enter Elements of Array: ");
		utility.insertInArrayString(array);
		utility.insertionSortString(array);
        System.out.println("\nSorted Array: ");
        utility.printIntString(array);
	}	
}
