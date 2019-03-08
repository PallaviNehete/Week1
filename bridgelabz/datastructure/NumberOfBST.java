/**
 * created by: Pallavi Nehete.
 * Date: 06/03/2019.
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
		for(int i=0; i<noOfnodes; i++)
		{
			System.out.print("Enter "+(i+1)+" node: ");
			nodes[i] = utility.inputInteger();
		}
		long noOfBinaryTree[] = new long[nodes.length];
		noOfBinaryTree = numberOfBST.noOfBST(nodes);
		System.out.println("\nNumber of binary search tree for given nodes is as follows: \n");
		for(int i=0; i<noOfBinaryTree.length; i++)
		{
			System.out.println("Number of Binary Search tree for node "+nodes[i]+" is: "+noOfBinaryTree[i]);
		}
	}
	
	/**
	 * Method to find number of binary search tree.
	 * @param nodes : Number of nodes entered by user.
	 * @return : returns number of binary search tree.
	 */
	public long[] noOfBST(int nodes[])
	{
		long numerator[] = new long[nodes.length];
		long denomenator[] = new long[nodes.length];
		long noOfBinaryTree[] = new long[nodes.length];
		for(int i=0 ;i<nodes.length; i++)
		{
		
			numerator[i] = Utility.factorial(2*nodes[i]);
			denomenator[i] = (Utility.factorial(nodes[i]+1))*(Utility.factorial(nodes[i]));
			noOfBinaryTree[i] = numerator[i]/denomenator[i];
		}
		return noOfBinaryTree;
	}
}
