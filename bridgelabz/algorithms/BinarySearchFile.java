/**
 * created by: Pallavi Nehete.
 * Date: 21/02/2019.
 * Purpose: Read in the list words comma separated from a File and then enter the word to be searched.
 * Print the result if the word is found or not
 */

package com.bridgelabz.algorithms;
import java.io.FileInputStream;
import java.io.IOException;
import com.bridgelabz.utility.Utility;
public class BinarySearchFile 
{
	public static void main(String[] args) throws IOException 
	{
		String string = "";
		StringBuffer sb = new StringBuffer();
		Utility utility = new Utility();
		FileInputStream ip = new FileInputStream("/home/admin1/ReadWrite/demo.txt");
		int i = 0;
		while((i = ip.read())!=-1)
		{
			char ch = (char)i;
			string = Character.toString(ch);
			sb = sb.append(string);
		}
		System.out.println(sb);	
		String s1 = sb.toString();
		String array[] = s1.split(",");
		utility.InsertionSortString(array);
		System.out.println("Sorted String: ");
		utility.printIntString(array);
		System.out.print("Enter the word: ");
		String search = utility.inputString();
		utility.BinarySearchString(array, search);
	}
}
