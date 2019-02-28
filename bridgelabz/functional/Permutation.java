/**
 * created by: Pallavi Nehete.
 * Date: 19/02/2019.
 * Purpose: To find all the permutations of String.
 */

package com.bridgelabz.functional;
public class Permutation 
{
	public static void main(String[] args) 
	{
		String string = "xyz"; 
		char array[] = string.toCharArray();
		System.out.println("Permutations of String "+string+" are: ");
		permutation(array, 0);
	}
	
	/**
	 * to find all the permutations of string.
	 * @param array : array of characters.
	 * @param i : index position.
	 */
	public static void permutation(char array[], int i)
	{
		char temp;
		if(i == array.length)
		{
			int n = array.length;
			for(int j=0; j<n; j++)
			{
				System.out.print(array[j]);
			}
			System.out.println();
		}
		else
		{
			for(int j=i; j<array.length; j++)
			{
				temp = array[j];
				array[j] = array[i];
				array[i] = temp;
				permutation(array, i+1);
				temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}
		}
	}
}
