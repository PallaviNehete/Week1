package com.bridgelabz.datastructure;
import com.bridgelabz.utility.Utility;
public class PalindromeChecker 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter Size: ");
		int size = utility.inputInteger();
		PalindromeDequeClass dque = new PalindromeDequeClass(size);
		System.out.println("Enter a String: ");
		String input = utility.inputString();
		char arr[] = input.toCharArray();
		for(int i=0; i<arr.length; i++)
		{
			dque.insertRear(arr[i]);
						
		}
		dque.countPrint();
	}
	
}
