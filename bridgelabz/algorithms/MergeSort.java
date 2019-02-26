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
		System.out.print("Enter Size of Array: ");
		int size = utility.inputInteger();
		int arr[] = new int [size]; 
		utility.InsertInArrayInt(arr);
		MergeSort ms = new MergeSort(); 
		ms.sort(arr, 0, arr.length-1);
		System.out.println("\nSorted array: "); 
		utility.printIntArr(arr); 	
	}
	void merge(int arr[], int low, int mid, int high) 
	{  
		int n1 = mid-low+1; 
		int n2 = high-mid; 
		int L[] = new int [n1]; 
		int R[] = new int [n2]; 
		for (int i=0;i<n1;i++) 
		{
			L[i]= arr[low+i]; 
		}
		for (int j=0;j<n2;j++) 
		{	
			R[j]= arr[mid+1+j]; 
		}
		int i=0,j=0; 
		int k=low; 
		while (i<n1 && j<n2) 
		{ 
			if (L[i]<=R[j]) 
			{ 
				arr[k]=L[i]; 
				i++; 
			} 
			else
			{ 
				arr[k]= R[j]; 
				j++; 
			} 
			k++; 
		} 
		while (i<n1) 
		{ 
			arr[k]=L[i]; 
			i++; 
			k++; 
		} 
		while (j<n2) 
		{ 
			arr[k]=R[j]; 
			j++; 
			k++; 
		} 
	} 
	void sort(int arr[], int low, int high) 
	{ 
		if (low < high) 
		{ 
			int mid = (low+high)/2; 
			sort(arr, low, mid); 
			sort(arr , mid+1, high); 
			merge(arr, low, mid, high); 
		} 
	} 
}
