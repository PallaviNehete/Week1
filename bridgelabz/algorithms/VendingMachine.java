/**
 * created by: Pallavi Nehete.
 * Date: 21/02/2019.
 * Purpose: Calculate minimum number of Notes as well as the Notes to be returned by Vending Machine as a Change
 * Calculating number of minimum Notes Return by Vending machine.
 */

package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class VendingMachine
{
	static int notes[] = {1000,500,100,50,10,5,2,1}; 
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.print("Enter The Amount: ");
		int amount = utility.inputInteger();
		int totalNotes[] = VendingMachine.countNotes(amount);
		int noOfNotes = 0;
		for (int i=0; i <totalNotes.length; i++) 
		{ 
			if (totalNotes[i] > 0) 
			{
				System.out.println(totalNotes[i]+" notes of "+notes[i]); 
				noOfNotes = noOfNotes + totalNotes[i];
			}
		}
		System.out.println("\n Total Number of Notes: "+noOfNotes);
	}
	
	/**
	 * method to count Fewest Notes to be returned for Vending Machine.
	 * @param amount : amount entered by user.
	 * @return : array of countNotes which includes count of all notes.
	 */
	public static int[] countNotes(int amount)
	{
		int countNotes[] = new int[9]; 
		for (int i=0; i<notes.length; i++)
		{ 
			if (amount >= notes[i]) 
			{ 
				countNotes[i] = amount/notes[i]; 
				amount = amount%notes[i];
				countNotes(amount);
			}
		}
		return countNotes;
	}
}
