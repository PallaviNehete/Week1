/**
 * created by: Pallavi Nehete.
 * Date: 05/03/2019.
 * Purpose: To find the Prime numbers that are Anagram in the range of 0 to 1000 and print it in reverse order using Queue.
 */

package com.bridgelabz.datastructure;
import com.bridgelabz.utility.Utility;
public class QueuePrimeAnagram 
{
	static QueueLinkedList q = new QueueLinkedList();
	public static void main(String[] args) 
	{
		QueuePrimeAnagram primeAnagram = new QueuePrimeAnagram();
		int number = 0;
		while(number < 1000)
		{
			int primenumber = Utility.primeNumber(number);
			if(primenumber != 0)
			{
				q.enqueue(primenumber);
			}
			number++;
		}
		System.out.println("Prime Numbers Between 0 to 1000");
		q.display();
		System.out.println("\n\nPrime Anagram numbers between 0 to 1000: ");
		primeAnagram.primeAnagram();
	}
	
	/**
	 * To find Prime Anagram in range of 0 to 1000 using Queue.
	 */
	public void primeAnagram()
	{
		for(int i=0; i<q.getListSize(); i++)
		{
			for(int j=i+1; j<q.getListSize(); j++) 
			{
				if(Utility.anagram(q.get(i), q.get(j))) 
				{
					System.out.println(q.get(i)+"\t"+q.get(j));
				}
			}
		}
	}
}
