/**
 * created by: Pallavi Nehete.
 * Date: 04/03/2019.
 * Purpose: Take a String as an Input & check whether it is Palindrome or not using dequeue.
 */

package com.bridgelabz.datastructure;
import com.bridgelabz.utility.Utility;
public class PalindromeChecker 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		PalindromeChecker palindrome = new PalindromeChecker();
		System.out.print("Enter String: ");
		String input = utility.inputString();
		boolean isPalindrome = palindrome.checkPalindrome(input);
		if(isPalindrome)
			System.out.println("\n'"+input+"' is Palindrome");
		else
			System.out.println("\n'"+input+"' is not Palindrome");
	}
	
	/**
	 * method to check string is palindrome or not using dequeue.
	 * @param input : input string to check whether it is Palindrome or not.
	 * @return : return true if string is palindrome otherwise gives false.
	 */
	public boolean checkPalindrome(String input)
	{
		PalindromeDequeClass palindromeDeque = new PalindromeDequeClass(input.length());
		boolean isPalindrome = false;
		char array[] = input.toCharArray();
		for(int i=0; i<array.length; i++)
		{
			palindromeDeque.addRear(array[i]);
		}
		for(int i=0; i<array.length/2; i++)
		{
			if(palindromeDeque.removeFront() == palindromeDeque.removeRear())
			{
				isPalindrome = true;
				break;
			}
		}
		return isPalindrome;	
	}
}
