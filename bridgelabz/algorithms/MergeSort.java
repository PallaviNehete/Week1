/**
 * created by: Pallavi Nehete.
 * Date: 23/02/2019.
 * Purpose: Reads String prints them in sorted order using Merge Sort
 */

package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class MergeSort 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		MergeSort mergsort = new MergeSort(); 
		System.out.print("Enter Size of Array: ");
		int size = utility.inputInteger();
		int array[] = new int [size]; 
		System.out.println("Enter Array Elements: ");
		utility.insertInArrayInt(array);
		mergsort.sort(array, 0, array.length-1);
		System.out.println("\nSorted array: "); 
		utility.printIntArr(array); 	
	}
	/**
	 * to merge arrays.
	 * @param array : array of Integers.
	 * @param low : low position of array.
	 * @param mid : mid position of array.
	 * @param high : high position of array.
	 */
	void merge(int array[], int low, int mid, int high) 
	{  
		int n1 = mid-low+1; 
		int n2 = high-mid; 
		int left[] = new int [n1]; 
		int right[] = new int [n2]; 
		for (int i=0;i<n1;i++) 
		{
			left[i]= array[low+i]; 
		}
		for (int j=0;j<n2;j++) 
		{	
			right[j]= array[mid+1+j]; 
		}
		int i=0,j=0; 
		int k=low; 
		while (i<n1 && j<n2) 
		{ 
			if (left[i] <= right[j]) 
			{ 
				array[k]= left[i]; 
				i++; 
			} 
			else
			{ 
				array[k]= right[j]; 
				j++; 
			} 
			k++; 
		} 
		while (i<n1) 
		{ 
			array[k] = left[i]; 
			i++; 
			k++; 
		} 
		while (j<n2) 
		{ 
			array[k] = right[j]; 
			j++; 
			k++; 
		} 
	} 
	/**
	 * to sort array.
	 * @param array : array of integers.
	 * @param low : low position of array.
	 * @param high : high position of array.
	 */
	void sort(int array[], int low, int high) 
	{ 
		if (low < high) 
		{ 
			int mid = (low+high)/2; 
			sort(array, low, mid); 
			sort(array , mid+1, high); 
			merge(array, low, mid, high); 
		} 
	} 
}
