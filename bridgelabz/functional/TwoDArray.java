/**
 * created by: Pallavi Nehete.
 * Date: 20/02/2019.
 * Purpose: A library for reading in 2D arrays of integers, doubles, or booleans from standard input
 * printing them out to standard output.
 */

package com.bridgelabz.functional;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;
public class TwoDArray 
{
	static Utility u = new Utility();
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		TwoDArray arr = new TwoDArray();
		System.out.println("*2D Array of Integers*");	
		arr.Int2DArr();
		System.out.println();
		System.out.println("*2D Array of Doubles*");
		arr.Doub2DArr();
		System.out.println();
		System.out.println("*2D Array of Boolean*");
		arr.boll2DArr();
	}	
	
	// Method to print 2D Array of Integers.
	public void Int2DArr()
	{
		Utility utility = new Utility();
		System.out.print("Enter the number of rows: ");
		int row = utility.inputInteger();
		System.out.print("Enter the number of columns: ");
		int column = utility.inputInteger();
		int matrix[][] = new int[row][column];
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				System.out.print("Row ["+i+"] column ["+j+"] ");
				matrix [i][j] = utility.inputInteger();
			}
		}
		System.out.println();
		System.out.println("Your 2D Array of integer of "+row+" rows "+"and "+column+" is: ");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	// Method to print 2D Array of Doubles.
	public void Doub2DArr()
	{
		System.out.print("Enter the number of rows: ");
		int row = u.inputInteger();
		System.out.print("Enter the number of columns: ");
		int column = u.inputInteger();
		double matrix[][] = new double[row][column];
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{

				System.out.print("Row ["+i+"] column ["+j+"] ");
				matrix [i][j] = u.inputInteger();
			}
		}
		System.out.println();
		System.out.println("Your 2D Array of integer of "+row+" rows "+"and "+column+" is: ");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	// Method to print 2D Array of Boolean.
	public void boll2DArr()
	{
		Utility u = new Utility();
		System.out.print("Enter the number of rows: ");
		int row = u.inputInteger();
		System.out.print("Enter the number of columns: ");
		int column = u.inputInteger();
		System.out.println("(please enter only true or false)");
		boolean matrix[][] = new boolean[row][column];
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				System.out.print("Row ["+i+"] column ["+j+"] ");
				matrix[i][j] = sc.nextBoolean();
			}
		}
		System.out.println();
		System.out.println("Your 2D Array of integer of "+row+" rows "+"and "+column+" is: ");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
