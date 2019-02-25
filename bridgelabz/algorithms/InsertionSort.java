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
		Utility u = new Utility();
		System.out.print("Enter Size of Array: ");
		int size = u.inputInteger();
		String array[] = new String[size];
		System.out.println("Enter Elements of Array: ");
		u.InsertInArrayString(array);
		u.InsertionSortString(array);
        System.out.println("\nSorted Array: ");
        u.printIntString(array);
	}	
}
