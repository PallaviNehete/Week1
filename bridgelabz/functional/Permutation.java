/**
 * created by: Pallavi Nehete.
 * Date: 19/02/2019.
 * Purpose: To find all the permutations of String.
 */

package com.bridgelabz.functional;
public class Permutation 
{
	public static void permutation(char ch[], int i)
	{
		char temp;
		if(i == ch.length)
		{
			int n = ch.length;
			for(int j=0; j<n; j++)
			{
				System.out.print(ch[j]);
			}
			System.out.println();
		}
		else
		{
			for(int j=i; j<ch.length; j++)
			{
				temp = ch[j];
				ch[j] = ch[i];
				ch[i] = temp;
				permutation(ch, i+1);
				temp = ch[j];
				ch[j] = ch[i];
				ch[i] = temp;
			}
		}
	}
	public static void main(String[] args) 
	{
		String str = "xyz"; 
		char ch[] = str.toCharArray();
		System.out.println("Permutations of String "+str+" are: ");
		permutation(ch, 0);
	}
}
