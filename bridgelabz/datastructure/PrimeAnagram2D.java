/**
 * created by: Pallavi Nehete.
 * Date: 07/03/2019.
 * Purpose: To print all prime anagrams and without prime anagram numbers in 2D array.
 */

package com.bridgelabz.datastructure;
import java.util.ArrayList;
import com.bridgelabz.utility.Utility;
public class PrimeAnagram2D
{
	int anagramPrime[][] = new int[13][13];
	public ArrayList<Integer> primeList = new ArrayList<Integer>();				// all prime numbers.
	public ArrayList<Integer> primeAnagramList1 = new ArrayList<Integer>();		// 1st list of prime anagrams.
	public ArrayList<Integer> primeAnagramList2 = new ArrayList<Integer>();		// 2nd list of prime anagrams.
	Utility utility = new Utility();
	public static void main(String[] args)
	{
		PrimeAnagram2D primeAnagramNumber = new PrimeAnagram2D();
		System.out.print("Prime Anagram numbers between 1 and 1000");
		primeAnagramNumber.primeAnagrams();
		primeAnagramNumber.withoutAnagram();
		System.out.println("\nPrime Anagrams Numbers in 2D matrix: ");
		primeAnagramNumber.storeNPrint2DArray();
	}
	
	/**
	 * Method to find all Prime Numbers and Prime Anagram Numbers.
	 */
	public void primeAnagrams()
	{
		System.out.println();
		for(int i=2; i<=1000; i++)
		{
			boolean flag = true;
			for(int j=2; j<i; j++) 
			{
				if(i%j == 0) 
				{
					flag = false;
					break;
				}
			}
			if(flag)
				primeList.add(i);
		}
		System.out.println(primeList);								// all prime numbers.
		for(int i=0; i<primeList.size(); i++)
		{
			for(int j=i+1; j<primeList.size(); j++) 
			{
				if(Utility.anagram(primeList.get(i), primeList.get(j))) 
				{
					primeAnagramList1.add(primeList.get(i));
					primeAnagramList2.add(primeList.get(j));
				}
			}
		}
		primeAnagramList1.addAll(primeAnagramList2);				// primeAnagramList1 contains all prime anagram Numbers.
	}
	
	/**
	 * Method to find all prime anagram & without prime anagram numbers.
	 */
	public void withoutAnagram()
	{
		for(int j=0; j<primeList.size(); j++)
		{
			if(!(primeAnagramList1.contains(primeList.get(j))))
				primeAnagramList1.add(primeList.get(j));			// primeAnagramList1 contains all prime anagram & without prime anagram numbers.
		}
	}
	
	/**
	 * Method to store and print all prime anagram & without prime Anagram numbers in 2D array.
	 */
	public void storeNPrint2DArray() 
	{
		int count = 0;
		for(int i=0; i<13; i++)										// store in 2D array.
		{
			for(int j=0; j<13; j++)
			{
				if(count < primeAnagramList1.size())
					anagramPrime[i][j] = primeAnagramList1.get(count++);
			}
		}
		for(int i=0; i<13; i++)										// print 2D array.
		{
			for(int j=0; j<13; j++) 
			{
				System.out.print(anagramPrime[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
