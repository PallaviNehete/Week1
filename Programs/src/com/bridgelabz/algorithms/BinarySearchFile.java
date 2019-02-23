/*	Binary Search the Word from Word List
	Desc -> Read in a list of words from File. Then prompt the user to enter a word to search the list.
	The program reports if the search word is found in the list.
	I/P -> read in the list words comma separated from a File and then enter the word to be searched
	Logic -> Use Arrays to sort the word list and then do the binary search
	O/P -> Print the result if the word is found or not		*/

package com.bridgelabz.algorithms;
import java.io.FileInputStream;
import java.io.IOException;
import com.bridgelabz.utility.Utility;
public class BinarySearchFile 
{
	public static void main(String[] args) throws IOException 
	{
		String s="";
		StringBuffer sb=new StringBuffer();
		Utility u=new Utility();
		FileInputStream ip = new FileInputStream("/home/admin1/demo.txt");
		int i=0;
		while((i=ip.read())!=-1)
		{
			char ch=(char)i;
			s=Character.toString(ch);
			sb=sb.append(s);
		}
		System.out.println(sb);	
		String s1=sb.toString();
		String a[]=s1.split(",");
		u.InsertionSortString(a);
		System.out.println("Sorted Array: ");
		u.printIntString(a);
		System.out.print("Enter the word: ");
		String search=u.inputString();
		int k=u.BinarySearchString(a, search);
		if(k==0)
		{
			System.out.println("String not found");
		}
		else
		{
			System.out.println("String found at "+(k+1)+" position");
		}
	}
	int BinarySearchString(String a[], String search)
	{
		int low=0, high=a.length;
		while (low < high) 
		{
			int mid=(high-low)/2;
			if(search.compareToIgnoreCase(a[mid])<0)
			{
				high=mid;
			}
			else if(search.compareToIgnoreCase(a[mid])>0)
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
