/**
 * created by: Pallavi Nehete.
 * Date: 21/02/2019.
 * Purpose: Calculate the minimum number of Notes as well as the Notes to be returned by the Vending Machine as a Change
 * taking array for Notes using Recursion Calculating number of minimum Notes Return by Vending machine
 */

package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class VendingMachine
{
	public static void main(String[] args) 
	{
		Utility u = new Utility();
		System.out.print("Enter The Amount: ");
		int amount = u.inputInteger();
		VendingMachine.countNotes(amount);
	}
	public static void countNotes(int amount)
	{
		int total = 0;
		int notes[] = {1000,500,100,50,10,5,2,1}; 
		int noteCounter[] = new int[9]; 
		for (int i=0; i<notes.length;i++)
		{ 
			if (amount >= notes[i]) 
			{ 
				noteCounter[i] = amount/notes[i]; 
				amount = amount%notes[i];
			}
		}
		System.out.println(); 
		for (int i = 0; i <notes.length; i++) 
		{ 
			if (noteCounter[i] != 0) 
			{
				System.out.println(noteCounter[i]+" notes of "+notes[i]); 
				total = total+noteCounter[i];
			}
		}
		System.out.println("\nTotal Number of Notes: "+total);
	}
}
