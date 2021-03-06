/**
 * created by: Pallavi Nehete.
 * Date: 21/02/2019.
 * Purpose: Takes a numbers(N), asks you to think of a number between 0 to N-1, where N = 2^n, and always guesses the answer with n questions.
 */

package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class FindQuesNo 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.print("Enter any Number: ");
		int num = utility.inputInteger();
		int N = (int) Math.pow(2, num);
		int low=0, high=N-1, mid=0;
		System.out.println("Your Number is present in Between "+low+" to "+high);
		System.out.println();
		FindQuesNo q = new FindQuesNo();
		int k = q.QNo(num, low, high, mid);
		if(k!= 0)
		{
			System.out.println("Your number is Found at "+k+" Position");
		}
		else
		{
			System.out.println("Number Not Found");
		}
	}
	public int QNo(int num,int low,int high, int mid)
	{
		Utility utility = new Utility();
		while(low<high)
		{
			System.out.println("Is number is between "+low+" to "+high+"?");
			System.out.print("If yes then type TRUE otherwise FALSE :");
			String check = utility.inputString();
			System.out.println();
			if(check.equalsIgnoreCase("true"))
			{
				mid = low+(high-low)/2;
				if(num < mid)
				{
					high = mid;
				}
				else if(num > mid)
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
