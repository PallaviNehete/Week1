/**
 * created by: Pallavi Nehete.
 * Date: 22/02/2019.
 * Purpose: Putting Commonly used function in single file
 */

package com.bridgelabz.utility;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Utility 
{
	static Scanner scanner=new Scanner(System.in);
	/**
	 * Method to take a Integer Input from user.
	 * @return : integer value.
	 */
	public int inputInteger()
	{
		return (scanner.nextInt());
	}
	
	/**
	 * Method to take a String Input from user.
	 * @return : returns String value.
	 */
	public String inputString()
	{
		return (scanner.next());
	}
	
	/**
	 * Method to take a Double Input from user.
	 * @return : returns double value.
	 */
	public double inputDouble()
	{
		return (scanner.nextDouble());
	}
	
	/**
	 * Method to Insert in array Integer.
	 * @param array : array of integers.
	 */
	public void insertInArrayInt(int array[])
	{
		for(int i=0; i<array.length; i++)
		{
			array[i] = scanner.nextInt();
		}
	}
	
	/**
	 * Method to Insert in array String.
	 * @param array : array of Strings.
	 */
	public void insertInArrayString(String array[])
	{
		for(int i=0; i<array.length; i++)
		{
			array[i] = scanner.next();
		}
	}
	
	/**
	 * Method to print Integer type of Array.
	 * @param array : array of integers.
	 */
	public void printIntArr(int array[])
	{
		for(int j=0; j<array.length; j++)
		{
			System.out.println(array[j]+" ");
		}
	}
	
	/**
	 * Method to print String type of Array.
	 * @param array : array of string.
	 */
	public void printIntString(String array[])
	{
		for(int j=0; j<array.length; j++)
		{
			System.out.println(array[j]);
		}
	}
	
	/**
	 * Method to determine whether entered year is Leap year or not.
	 * @param year : it is a year.
	 * @return : returns true if it is a leap year otherwise returns false.
	 */
	public boolean isLeapYear(int year)
	{
		if((year%4 == 0) && (year%100!=0))
			return true;
		else if(year%400 == 0)
			return true;
		else
			return false;
	}
	
	/**
	 * Method to check for Prime Numbers.
	 * @param number : start position of prime numbers.
	 * @return : prime number
	 */
	public static int primeNumber(int number)
	{
		int count = 0;
		if(number!=0 && number!=1)
		{
			for(int i=2; i<number; i++)
			{
				if(number%i == 0)
				{
					count++;
					break;
				}
			}
			if(count == 0)
			{
				return number;
			}
		}
		return 0;
	}
	
	/**
	 * Method to Sort Integers using Insertion sort.
	 * @param array : array of integers.
	 */
	public void insertionSortInt(int array[])
	{
		int temp;
		for(int i=0; i<array.length; i++)
		{
			for(int j=i+1; j<array.length; j++)
			{
				if(array[i] > array[j])
				{
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
	}
	
	/**
	 * Method to Sort String using Insertion sort.
	 * @param array : array of String.
	 */
	public void insertionSortString(String array[])
	{
		String temp;
		for(int i=0; i<array.length; i++)
		{
			for(int j=i+1; j<array.length; j++)
			{
				if(array[i].compareToIgnoreCase(array[j])>0)
				{
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
	}
	
	/**
	 * Method to Sort Integers using Bubble sort.
	 * @param array : array of integers.
	 */
	public void bubbleSortInt(int array[])
	{
		int temp;
		for(int i=0; i<array.length; i++)
		{
			for(int j=1; j<array.length-i; j++)
			{
				if(array[j-1] > array[j])
				{
					temp = array[j-1];  
					array[j-1] = array[j];  
					array[j] = temp; 
				}
			}
		}
	}
	
	/**
	 * Method to Sort String using Bubble sort.
	 * @param array : array of String.
	 */
	public void bubbleSortString(String array[])
	{
		String temp;
		for(int i=0; i<array.length; i++)
		{
			for(int j=i+1; j<array.length-i; j++)
			{
				if(array[j].compareToIgnoreCase(array[j-1]) > 0)
				{
					temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
	}
	
	/**
	 * Method to Search Integers using Binary search.
	 * @param array : array of integers.
	 * @param search : element to search from array.
	 */
	public void binarySearchInt(int array[], int search)
	{
		int low = 0, high = array.length-1;
		int mid = low + (high-low)/2;
		while (low <= high) 
		{
			mid = low+(high-low)/2;
			if(search > array[mid])
			{
				low = mid+1;
			}
			else if(search == array[mid])
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
		if(low > high)
		{
			System.out.println("Number not Found");
		}
	}
	
	/**
	 * Method to Search Strings using Binary search.
	 * @param array : array of String.
	 * @param search : element to search from array.
	 */
	public void binarySearchString(String array[], String search)
	{
		int low = 0, high = array.length-1;
		int mid = 0;
		mid = low+(high-low)/2;
		while (low <= high) 
		{
			if(search.compareToIgnoreCase(array[mid])>0)
			{
				low = mid+1;
			}
			else if(search.compareToIgnoreCase(array[mid])==0)
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
