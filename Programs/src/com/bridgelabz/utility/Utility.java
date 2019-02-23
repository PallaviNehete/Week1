
package com.bridgelabz.utility;
import java.util.Scanner;
public class Utility 
{
	static Scanner sc=new Scanner(System.in);
	public int inputInteger()
	{
		return (sc.nextInt());
	}
	public String inputString()
	{
		return (sc.next());
	}
	public double inputDouble()
	{
		return (sc.nextDouble());
	}
	public void InsertInArrayInt(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	public void InsertInArrayString(String arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next();
		}
	}
	public void printIntArr(int arr[])
	{
		int n=arr.length;
		for(int j=0;j<n;j++)
		{
			System.out.println(arr[j]);
		}
	}
	public void printIntString(String arr[])
	{
		int n=arr.length;
		for(int j=0;j<n;j++)
		{
			System.out.println(arr[j]);
		}
	}
	public boolean isLeapYear(int year)
	{
		if((year%4==0) && (year%100!=0))
		{
			return true;
		}
		else if(year%400==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static int IsPrimeNumber(int num)
	{
		int count=0;
		if(num!=0 && num!=1)
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				return num;
			}
		}
		return 0;
	}
	public void InsertionSortInt(int arr[])
	{
		int temp;
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
	public void InsertionSortString(String arr[])
	{
		String temp;
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i].compareToIgnoreCase(arr[j])>0)
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
	public void BubbleSortInt(int arr[])
	{
		int temp;
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
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
	public void BubbleSortString(String arr[])
	{
		String temp;
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n-i;j++)
			{
				if(arr[j].compareToIgnoreCase(arr[j-1])>0)
				{
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}
	public int BinarySearchInt(int arr[], int search)
	{
		int low=0, high=arr.length;
		while (low < high) 
		{
			int mid=low+(high-low)/2;
			if(search<arr[mid])
			{
				high=mid;
			}
			else if(search>arr[mid])
			{
				low=mid+1;
			}
			else
			{
				return mid;
			}
		}
		return 0;
	}
	public int BinarySearchString(String arr[], String search)
	{
		int low=0, high=arr.length;
		while (low < high) 
		{
			int mid=low+(high-low)/2;
			if(search.compareToIgnoreCase(arr[mid])<0)
			{
				high=mid;
			}
			else if(search.compareToIgnoreCase(arr[mid])>0)
			{
				low=mid+1;
			}
			else
			{
				return mid;
			}
		}
		return 0;
	}
}
