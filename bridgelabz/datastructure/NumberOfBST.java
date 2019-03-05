
/**
 * created by: Pallavi Nehete.
 * Date: 05/03/2019.
 * Purpose: To find number of binary search tree.
 * 			number of binary search tree = (2n)!/((n+1)!n!)
 */

package com.bridgelabz.datastructure;
import com.bridgelabz.utility.Utility;
public class NumberOfBST 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		NumberOfBST numberOfBST = new NumberOfBST();
		System.out.print("Enter Number of Nodes: ");
		int noOfnodes = utility.inputInteger();
		int nodes[] = new int[noOfnodes];
		int noOfBinaryTrees[] = new int[noOfnodes];
		for(int i=0; i<noOfnodes; i++)
		{
			System.out.print("Enter "+i+" node: ");
			nodes[i] = utility.inputInteger();
		}
		int noOfBinaryTree[] = new int[nodes.length];
		noOfBinaryTree = numberOfBST.noOfBST(nodes);
		//System.out.println(noOfBinaryTree);
	}

	/**
	 * Method to find number of binary search tree.
	 * @param nodes : Number of nodes entered by user.
	 * @return : returns number of binary search tree.
	 */
	public int[] noOfBST(int nodes[])
	{
		int numerator[] = new int[nodes.length];
		int denomenator[] = new int[nodes.length];
		int noOfBinaryTree[] = new int[nodes.length];
		for(int i=0 ;i<nodes.length; i++)
		{
			numerator[i] = factorial(2*nodes[i]);
			denomenator[i] = (factorial(nodes[i]+1))*(factorial(nodes[i]));
			noOfBinaryTree[i] = numerator[i]/denomenator[i];
			System.out.println(noOfBinaryTree[i]);
		}
		return noOfBinaryTree;
	}
	
	/**
	 * To find factorial of a given number.
	 * @param number : number
	 * @return : returns factorial of a number.
	 */
	public static int factorial(int number)
	{
		int factorial = 1;
		for(int i=1; i<=number; i++)
		{
			factorial = factorial*i;
		}
		return factorial;
	}
}
