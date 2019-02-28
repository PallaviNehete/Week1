package com.bridgelabz.datastructure;
import com.bridgelabz.utility.Utility;
public class PalindromeChecker 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter Size: ");
		int size = utility.inputInteger();
		PalindromeDequeClass dq = new PalindromeDequeClass(size);
		System.out.println("Enter a String: ");
		String input = utility.inputString();
		char[] arr = input.toCharArray();
		System.out.println(dq.isEmpty());
		for(int i=0; i<input.length(); i++)
		{
			dq.insertFront(arr[i]);
			
			
		}
		dq.insertRear(5);
		//dq.deleteRear();
		//dq.deleteFront();
		dq.countPrint();
	}
}
