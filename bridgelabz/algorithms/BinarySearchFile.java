/**
 * created by: Pallavi Nehete.
 * Date: 21/02/2019.
 * Purpose: Read in the list words comma separated from a File and then enter the word to be searched.
 * Print the result if the word is found or not
 */

package com.bridgelabz.algorithms;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import com.bridgelabz.utility.Utility;
public class BinarySearchFile 
{
	public static void main(String[] args) throws IOException 
	{
		String s = "";
		StringBuffer sb = new StringBuffer();
		Utility u = new Utility();
		FileInputStream ip = new FileInputStream("/home/admin1/demo.txt");
		int i = 0;
		while((i = ip.read())!=-1)
		{
			char ch = (char)i;
			s = Character.toString(ch);
			sb = sb.append(s);
		}
		System.out.println(sb);	
		String s1 = sb.toString();
		String a[] = s1.split(",");
		u.InsertionSortString(a);
		System.out.println("Sorted String: ");
		u.printIntString(a);
		System.out.print("Enter the word: ");
		String search = u.inputString();
		u.BinarySearchString(a, search);
	}
}
