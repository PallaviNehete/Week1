/*	Find the Fewest Notes to be returned for Vending Machine
	Desc -> There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be returned by Vending Machine.
	Write a Program to calculate the minimum number of Notes as well as the Notes to be returned by the Vending Machine as a Change
	I/P -> read the Change in Rs to be returned by the Vending Machine
	Logic -> Use Recursion and check for largest value of the Note to return change to get to minimum number of Notes. 
	O/P -> Two Outputs - one the number of minimum Note needed to give the change and 
	second list of Rs Notes that would given in the Change	*/

package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class VendingMachine
{
	public static void main(String[] args) 
	{
		Utility u=new Utility();
		System.out.print("Enter The Amount: ");
		int amount= u.inputInteger();
		VendingMachine.countNotes(amount);
	}
	public static void countNotes(int amount)
	{
		int total=0;
		int notes[] ={1000,500,100,50,10,5,2,1}; 
		int noteCounter[] = new int[9]; 
		for (int i=0; i<notes.length;i++)
		{ 
			if (amount >= notes[i]) 
			{ 
				noteCounter[i]=amount/notes[i]; 
				amount=amount%notes[i];
			}
		}
		System.out.println(); 
		for (int i = 0; i <notes.length; i++) 
		{ 
			if (noteCounter[i] != 0) 
			{
				System.out.println(noteCounter[i]+" notes of "+notes[i]); 
				total=total+noteCounter[i];
			}
		}
		System.out.println("\nTotal Number of Notes: "+total);
	}
}
