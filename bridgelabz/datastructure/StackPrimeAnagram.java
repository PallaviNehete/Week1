/**
 * created by: Pallavi Nehete.
 * Date: 05/03/2019.
 * Purpose: To find the Prime numbers that are Anagram in the range of 0 to 1000 and print it in reverse order using stack.
 */

package com.bridgelabz.datastructure;
import com.bridgelabz.utility.Utility;
public class StackPrimeAnagram 
{
	static StackLinkedList stackList = new StackLinkedList();
	public static void main(String[] args) 
	{
		StackPrimeAnagram primeAnagram = new StackPrimeAnagram();
		int number = 0;
		while(number < 1000)
		{
			int primenumber = Utility.primeNumber(number);
			if(primenumber!=0)
			{
				stackList.push(primenumber);
			}
			number++;
		}
		System.out.println("Prime Numbers Between 0 to 1000");
		stackList.display();
		System.out.println("\n\nPrime Anagram numbers between 0 to 1000: ");
		primeAnagram.primeAnagram();
	}
	
	/**
	 * To find Prime Anagram in range of 0 to 1000 using stack.
	 */
	public void primeAnagram()
	{
		for(int i=0; i<stackList.getListSize(); i++)
		{
			for(int j=i+1; j<stackList.getListSize(); j++) 
			{
				if(Utility.anagram(stackList.get(i), stackList.get(j))) 
				{
					System.out.println(stackList.get(i)+"\t"+stackList.get(j));
				}
			}
		}
	}
}
