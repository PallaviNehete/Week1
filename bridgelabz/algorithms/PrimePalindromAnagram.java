/**
 * created by: Pallavi Nehete.
 * Date: 21/02/2019.
 * Purpose: To find the prime numbers that are Anagram and Palindrome.
 */

package com.bridgelabz.algorithms;
import java.util.ArrayList;
public class PrimePalindromAnagram
{
	public static void main(String[] args) 
	{
		int count = 0;
		System.out.println("Prime Palindrom: ");
		while(count<1000)
		{
			PrimePalindromAnagram.primePlindrom(count);
			count++;
		}	
		System.out.println("\n\nPrime Anagram Numbers between 1 to 1000: " );
		PrimePalindromAnagram.primeAnagrams();
	}
	
	/**
	 * method to find prime palindrome.
	 * @param number : number to check wheather it is prime palindrome or not.
	 */
	public static void primePlindrom(int number)
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
				int reverse = 0,temp,digit;
				temp = number;
				while(number > 0)
				{
					digit = number % 10;
					reverse = reverse*10+ digit;
					number = number/10;
				}
				if(reverse == temp)
				{
					System.out.print(temp+" ");
				}
			}
		}
	}
	/**
	 * method to find prime anagrams.
	 */
	public static void primeAnagrams() 
	{
		ArrayList<Integer> list= new ArrayList<Integer>();
		boolean check;
		for(int j=2; j<=1000; j++) 
		{
			check = true;
			for (int i=2; i<j/2; i++)
			{
				if (j%i == 0) 
				{
					check=false;
					break;
				}
			}
			if (check)
			{
				list.add(j);
			}
		}
		for (int i=0; i<list.size(); i++)
		{
			for (int j=i+1; j<list.size(); j++) 
			{
				if (anagram(list.get(i),list.get(j))) 
				{
					System.out.println(list.get(i)+"\t"+list.get(j));
				}
			}
		}
	}
	/**
	 * method to find to numbers are in anagram or not.
	 * @param number1 : 
	 * @param number2
	 * @return
	 */
	public static boolean anagram(int number1, int number2) 
	{
		int n1count[] = countDigits(number1);
		int n2count[] = countDigits(number2);
		for (int i=0; i<n2count.length; i++) 
		{
			if (n1count[i] != n2count[i]) 
			{
				return false;
			}
		}
		return true;
	}
	/**
	 * method to count digits of number.
	 * @param number : number to count digits.
	 * @return : digits of a number.
	 */
	public static int[] countDigits(int number) 
	{
		int count[] = new int[10];
		int temp = number;
		while (temp != 0) 
		{
			int r=temp%10;
			count[r]++;
			temp=temp/10;
		}
		return count;
	}
}
