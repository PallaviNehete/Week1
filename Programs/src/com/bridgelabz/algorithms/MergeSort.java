/*	Merge Sort  - Write a program with Static Functions to do Merge Sort of list of Strings. 
	Logic -> To Merge Sort an array, we divide it into two halves, sort the two halves independently,
	and then merge the results to sort the full array. To sort a[lo, hi), we use the following recursive strategy:
	Base case: If the subarray length is 0 or 1, it is already sorted.
	Reduction step: Otherwise, compute mid = lo + (hi - lo) / 2, recursively sort the two subarrays a[lo, mid) & a[mid, hi),
	and merge them to produce a sorted result.	 */


package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class MergeSort 
{
	public static void main(String[] args) 
	{
		Utility u=new Utility();
		System.out.print("Enter Size of Array: ");
		int size=u.inputInteger();
		int arr[] =new int [size]; 
		u.InsertInArrayInt(arr);
		MergeSort ms = new MergeSort(); 
		ms.sort(arr, 0, arr.length-1);
		System.out.println("\nSorted array: "); 
		u.printIntArr(arr); 	
	}
	void merge(int arr[], int low, int mid, int high) 
	{  
		int n1= mid-low+1; 
		int n2= high-mid; 
		int L[]= new int [n1]; 
		int R[]= new int [n2]; 
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
