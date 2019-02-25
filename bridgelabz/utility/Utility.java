/**
 * created by: Pallavi Nehete.
 * Date: 22/02/2019.
 * Purpose: Putting Commonly used function in single file
 */

package com.bridgelabz.utility;
import java.util.Scanner;
public class Utility 
{
	static Scanner sc=new Scanner(System.in);
	// Method to take a Integer Input from user.
	public int inputInteger()
	{
		return (sc.nextInt());
	}
	
	// Method to take a String Input from user.
	public String inputString()
	{
		return (sc.next());
	}
	
	// Method to take a Double Input from user.
	public double inputDouble()
	{
		return (sc.nextDouble());
	}
	
	// Method to Insert in array Integer.
	public void InsertInArrayInt(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	
	// Method to Inser in array String.
	public void InsertInArrayString(String arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.next();
		}
	}
	
	// Method to print Integer type of Array.
	public void printIntArr(int arr[])
	{
		int n = arr.length;
		for(int j=0; j<n; j++)
		{
			System.out.println(arr[j]);
		}
	}
	
	// Method to print String type of Array.
	public void printIntString(String arr[])
	{
		int n = arr.length;
		for(int j=0; j<n; j++)
		{
			System.out.println(arr[j]);
		}
	}
	
	// Method to determine whether entered year is Leap year or not.
	public boolean isLeapYear(int year)
	{
		if((year%4 == 0) && (year%100!=0))
		{
			return true;
		}
		else if(year%400 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// Method to find Prime Numbers.
	public static int IsPrimeNumber(int num)
	{
		int count = 0;
		if(num!=0 && num!=1)
		{
			for(int i=2; i<num; i++)
			{
				if(num%i == 0)
				{
					count++;
					break;
				}
			}
			if(count == 0)
			{
				return num;
			}
		}
		return 0;
	}
	
	// Method to Sort Integers using Insertion sort.
	public void InsertionSortInt(int arr[])
	{
		int temp;
		int n = arr.length;
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	// Method to Sort String using Insertion sort.
	public void InsertionSortString(String arr[])
	{
		String temp;
		int n = arr.length;
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(arr[i].compareToIgnoreCase(arr[j])>0)
				{
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	// Method to Sort Integers using Bubble sort.
	public void BubbleSortInt(int arr[])
	{
		int temp;
		int n = arr.length;
		for(int i=0; i<n; i++)
		{
			for(int j=1; j<n-i; j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp = arr[j-1];  
					arr[j-1] = arr[j];  
					arr[j] = temp; 
				}
			}
		}
	}
	
	// Method to Sort String using Bubble sort.
	public void BubbleSortString(String arr[])
	{
		String temp;
		int n = arr.length;
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n-i; j++)
			{
				if(arr[j].compareToIgnoreCase(arr[j-1])>0)
				{
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}
	
	// Method to Search Integers using Binary search.
	public void BinarySearchInt(int arr[], int search)
	{
		int low = 0, high = arr.length-1;
		int mid = low+(high-low)/2;
		while (low <= high) 
		{
			mid = low+(high-low)/2;
			if(search>arr[mid])
			{
				low = mid+1;
			}
			else if(search == arr[mid])
			{
				System.out.println("Number found at "+(mid+1)+" position");
				break;
			}
			else
			{
				high = mid-1;
			}
			mid = (high+low)/2;
		}
		if(low>high)
		{
			System.out.println("Number not Found");
		}
	}
	
	// Method to Search Strings using Binary search.
	public void BinarySearchString(String arr[], String search)
	{
		int low = 0, high = arr.length-1;
		int mid = 0;
		mid = low+(high-low)/2;
		while (low <= high) 
		{
			
			if(search.compareToIgnoreCase(arr[mid])>0)
			{
				low = mid+1;
			}
			else if(search.compareToIgnoreCase(arr[mid])==0)
			{
				System.out.println("Word is found at "+(mid+1)+" position");
				break;
			}
			else
			{
				high = mid-1;
			}
			mid = (high+low)/2;
		}
		if(low>high)
		{
			System.out.println("String not found");
		}
	}
}
