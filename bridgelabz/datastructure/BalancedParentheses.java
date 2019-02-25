
package com.bridgelabz.datastructure;
import com.bridgelabz.utility.Utility;
public class BalancedParentheses
{
	public static void main(String[] args) 
	{
		Utility u = new Utility();
		System.out.print("Enter Maximum Size: ");
		int size = u.inputInteger();
		StackClass stack = new StackClass(size); 
		int push = 0,pop = 0;
		System.out.println("Enter the Expression: ");
		String e = u.inputString();
		for(int i = 0; i < e.length(); i++)
		{
			char ch = e.charAt(i);
			if(ch =='(')
			{
				stack.push(i);
				System.out.println("'(' pushed at index ");
				push++;
			}
			else if(ch ==')')
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
