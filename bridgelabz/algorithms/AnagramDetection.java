/**
 * created by: Pallavi Nehete.
 * Date: 21/02/2019.
 * Purpose: An Anagram Detection One string is an anagram of another if the second is simply a rearrangement of the first.
 */

package com.bridgelabz.algorithms;
import java.util.Arrays;
import java.util.Scanner;
public class AnagramDetection 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String string1,string2;
		AnagramDetection ad = new AnagramDetection();
		System.out.print("Enter First String: ");
		string1 = scanner.nextLine();
		string1 = string1.toLowerCase();
		string1 = string1.replace(" " ,"");
		System.out.print("Enter Second String: ");
		string2 = scanner.nextLine();
		string2 = string2.toLowerCase();
		string2 =string2.replace(" " ,"");
		ad.anagram(string1, string2);
	}
	
	/**
	 * to check two strings are in anagram or not.
	 * @param string1 : Input String 1.
	 * @param string2 : Input String 2.
	 */
	public void anagram(String string1, String string2)
	{
		if(string1.length() != string2.length())
			System.out.println("\n"+string1+" and "+string2+" are not an Anagram");
		else
		{
			char array1 [] = string1.toCharArray();
			char array2 [] = string2.toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			if(Arrays.equals(array1, array2))
				System.out.println("\n'"+string1+"' and '"+string2+"' are in Anagram");
			else
				System.out.println("\n'"+string1+"' and '"+string2+"' are not an Anagram");
		}
	}
}
