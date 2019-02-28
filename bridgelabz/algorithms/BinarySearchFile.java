/**
 * created by: Pallavi Nehete.
 * Date: 21/02/2019.
 * Purpose: Read in the list words comma separated from a File and then enter the word to be searched.
 * Print the result if the word is found or not
 */

package com.bridgelabz.algorithms;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import com.bridgelabz.utility.Utility;
public class BinarySearchFile 
{
	static StringBuffer stringbuffer = new StringBuffer();
	public static void main(String[] args)
	{
		Utility utility = new Utility();
		File file = new File("/home/admin1/ReadWrite/binarySearch.txt");
		System.out.println(stringbuffer);	
		String s1 = stringbuffer.toString();
		String array[] = s1.split(",");
		utility.insertionSortString(array);
		System.out.println("Sorted String: ");
		utility.printIntString(array);
		System.out.print("Enter the word: ");
		String search = utility.inputString();
		utility.binarySearchString(array, search);
	}
	/**
	 * method to read file.
	 * @param file : file name
	 * @throws : IOException
	 */
	public void readFile(File file) throws IOException
	{
		FileInputStream input = new FileInputStream(file);
		int i = 0;
		while((i = input.read())!=-1)
		{
			char word = (char)i;
			String string = Character.toString(word);
			stringbuffer = stringbuffer.append(string);
		}
	}
}
