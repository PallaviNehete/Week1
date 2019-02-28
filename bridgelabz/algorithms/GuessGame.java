/**
 * created by: Pallavi Nehete.
 * Date: 21/02/2019.
 * Purpose: Takes a numbers(N), asks you to think of a number between 0 to N-1, where N = 2^n, and always guesses the answer with n questions.
 */

package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class GuessGame 
{
	static Utility utility = new Utility();
	public static void main(String[] args) 
	{
		System.out.print("Enter any Number: ");
		int number = utility.inputInteger();
		System.out.println();
		int position = GuessGame.guessNumber(number);
		if(position!= 0)
		{
			System.out.println("Your number is Found at "+position+" Position");
		}
		else
		{
			System.out.println("Number Not Found");
		}
	}
	/**
	 * Guesses the answer with n questions
	 * @param number : number to found between low to high.
	 * @return : position of a number
	 */
	public static int guessNumber(int number)
	{
		int N = (int) Math.pow(2, number);
		int low=0, high=N-1, mid=0;
		System.out.println("Your Number is present in Between "+low+" to "+high);
		
		while(low<high)
		{
			System.out.println("Is number is between "+low+" to "+high+"?");
			System.out.print("If yes then type TRUE otherwise FALSE :");
			String check = utility.inputString();
			System.out.println();
			if(check.equalsIgnoreCase("true"))
			{
				mid = low+(high-low)/2;
				if(number < mid)
				{
					high = mid;
				}
				else if(number > mid)
				{
					low = mid+1;	
				}
				else
				{
					return mid;
				}
			}
			else if(check.equalsIgnoreCase("false"))
			{
				System.out.println("*Please Check Once Again");
				System.out.println();
			}
			else
			{
				System.out.println("*Please only enter TRUE or FALSE");
				System.out.println();
			}
		}
		return 0;
	}
}
