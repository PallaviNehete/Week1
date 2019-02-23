
package com.bridgelabz.algorithms;
import java.util.ArrayList;
public class PrimePalindromAnagram
{
	public static void main(String[] args) 
	{
		int count=0;
		System.out.println("Prime Palindrom: ");
		while(count<1000)
		{
			PrimePalindromAnagram.IsPrimePlindrom(count);
			count++;
		}	
		System.out.println("\n\nPrime Anagram Numbers between 1 to 1000: " );
		PrimePalindromAnagram.primeAnagrams();
	}
	public static void IsPrimePlindrom(int num)
	{
		int count=0;
		if(num!=0 && num!=1)
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				int rev=0,temp,rem;
				temp=num;
				while(num>0)
				{
					rem=num%10;
					rev=rev*10+rem;
					num=num/10;
				}
				if(rev==temp)
				{
					System.out.print(temp+" ");
				}
			}
		}
	}
	public static void primeAnagrams() 
	{
		ArrayList<Integer> al= new ArrayList<Integer>();
		boolean b;
		for(int j=2; j<=1000; j++) 
		{
			b = true;
			for (int i=2; i<j/2; i++)
			{
				if (j%i == 0) 
				{
					b=false;
					break;
				}
			}
			if (b)
			{
				al.add(j);
			}
		}
		for (int i=0; i<al.size(); i++)
		{
			for (int j=i+1; j<al.size(); j++) 
			{
				if (anagram(al.get(i),al.get(j))) 
				{
					System.out.println(al.get(i)+"\t"+al.get(j));
				}
			}
		}
	}
	public static boolean anagram(int n1, int n2) 
	{
		int n1count[] = count(n1);
		int n2count[] = count(n2);
		for (int i=0; i<n2count.length; i++) 
		{
			if (n1count[i] != n2count[i]) 
			{
				return false;
			}
		}
		return true;
	}
	public static int[] count(int n) 
	{
		int[] count = new int[10];
		int temp = n;
		while (temp != 0) 
		{
			int r=temp%10;
			count[r]++;
			temp=temp/10;
		}
		return count;
	}
}
