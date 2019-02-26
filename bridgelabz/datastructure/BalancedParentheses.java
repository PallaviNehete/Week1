
package com.bridgelabz.datastructure;
import com.bridgelabz.utility.Utility;
public class BalancedParentheses
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.print("Enter Maximum Size: ");
		int size = utility.inputInteger();
		StackClass stack = new StackClass(size); 
		int push = 0, pop = 0;
		System.out.println("Enter the Expression: ");
		String expression = utility.inputString();
		for(int i = 0; i < expression.length(); i++)
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
				int p = stack.pop()+1;
				System.out.println("')' poped at index "+i);
				pop++;
			}
		}
		if(push == pop)
		{
			System.out.println("\nExpression is balanced");
		}
		else
		{
			System.out.println("\nExpression is unbalanced");
		}
	}
}
