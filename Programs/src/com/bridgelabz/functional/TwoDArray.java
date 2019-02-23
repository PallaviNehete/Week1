/*	 2D Array
	Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from standard input and printing them out to standard output.
	I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
	Logic -> create 2 dimensional array in memory to read in M rows and N cols 
	O/P -> Print function to print 2 Dimensional Array.
	In Java use PrintWriter with OutputStreamWriter to print the output to the screen.	*/


package com.bridgelabz.functional;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;
public class TwoDArray 
{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		TwoDArray arr=new TwoDArray();
		System.out.println("*2D Array of Integers*");	
		arr.Int2DArr();
		System.out.println();
		System.out.println("*2D Array of Doubles*");
		arr.Doub2DArr();
		System.out.println();
		System.out.println("*2D Array of Boolean*");
		arr.boll2DArr();
	}	
	public void Int2DArr()
	{
		Utility u=new Utility();
		System.out.print("Enter the number of rows: ");
		int row=u.inputInteger();
		System.out.print("Enter the number of columns: ");
		int column= u.inputInteger();
		int matrix[][]=new int[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print("Row ["+i+"] column ["+j+"] ");
				matrix [i][j]=sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("Your 2D Array of integer of "+row+" rows "+"and "+column+" is: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void Doub2DArr()
	{
		Utility u=new Utility();
		System.out.print("Enter the number of rows: ");
		int row= u.inputInteger();
		System.out.print("Enter the number of columns: ");
		int column= u.inputInteger();
		double matrix[][]=new double[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{

				System.out.print("Row ["+i+"] column ["+j+"] ");
				matrix [i][j]=sc.nextDouble();
			}
		}
		System.out.println();
		System.out.println("Your 2D Array of integer of "+row+" rows "+"and "+column+" is: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void boll2DArr()
	{
		Utility u=new Utility();
		System.out.print("Enter the number of rows: ");
		int row= u.inputInteger();
		System.out.print("Enter the number of columns: ");
		int column= u.inputInteger();
		System.out.println("(please enter only true or false)");
		boolean matrix[][]=new boolean[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print("Row ["+i+"] column ["+j+"] ");
				matrix[i][j]=sc.nextBoolean();
			}
		}
		System.out.println();
		System.out.println("Your 2D Array of integer of "+row+" rows "+"and "+column+" is: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
