/**
 * created by: Pallavi Nehete.
 * Date: 27/02/2019.
 * Purpose: Take an Arithmetic Expression as an input where parentheses are used to order the performance of operations.
 * 			Ensure parentheses must appear in a balanced fashion.
 */

package com.bridgelabz.datastructure;
import com.bridgelabz.utility.Utility;
public class BalancedParentheses
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.print("Enter the Expression: ");
		String expression = utility.inputString();
		BalancedParenthStack stack = new BalancedParenthStack(expression.length()); 
		int push = 0, pop = 0;
		for(int i=0; i<expression.length(); i++)
		{
			char character = expression.charAt(i);
			if(character =='(')
			{
				stack.push(i);
				System.out.println("'(' pushed at index ");
				push++;
			}
			else if(character ==')')
			{
				System.out.println("')' poped at index "+i);
				pop++;
			}
		}
		if(push == pop)
			System.out.println("\nExpression is balanced");
		else
			System.out.println("\nExpression is unbalanced");
	}
}
