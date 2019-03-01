/**
 * created by: Pallavi Nehete.
 * Date: 21/02/2019.
 * Purpose: To find the prime numbers that are Anagram and Palindrome.
 */

package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class PrimePalindromAnagram
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		int count = 0;
		System.out.println("Prime Palindrom: ");
		while(count<1000)
		{
			utility.primePlindrom(count);
			count++;
		}	
		System.out.println("\n\nPrime Anagram Numbers between 1 to 1000: " );
		utility.primeAnagrams();
	}
}
