/**
 * created by: Pallavi Nehete.
 * Date: 23/02/2019.
 * Purpose: To perform 
 * 			binarySearch method for integer
 *			binarySearch method for String
 *			insertionSort method for integer
 *			insertionSort method for String
 *			bubbleSort method for integer
 *			bubbleSort method for String
 */

package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class SearchSort 
{
	public static void main(String[] args) 
	{	
		Utility utility = new Utility();
		long start1 = 0, start2=0,start3=0,start4=0,start5=0,start6=0;
		System.out.println("~~~~~ SEARCH SORT ~~~~~\n");

		// Binary Search Method for Integer
		System.out.println("1. Binary Search Method for Integer");
		start1 = System.currentTimeMillis();
		System.out.print("Enter Size of Array: ");
		int size1 = utility.inputInteger();
		int array1[] = new int[size1];
		System.out.println("Enter Elements of Array (please enter integer values): ");
		utility.insertInArrayInt(array1);
		System.out.print("Enter the Number: ");
		int search1 = utility.inputInteger();
		utility.insertionSortInt(array1);
		System.out.println("Sorted List: ");
		utility.printIntArr(array1);
		utility.binarySearchInt(array1, search1);
		long stop1 = System.currentTimeMillis();
		long differnce1 = stop1-start1;
		System.out.println("Elapsed Time:"+differnce1+"\n");
		System.out.println("====================================================\n");

		// Binary Search Method for String
		System.out.println("2. Binary Search Method for String");
		start2 = System.currentTimeMillis();
		System.out.print("Enter Size of Array: ");
		int size2 = utility.inputInteger();
		String array2[] = new String[size2];
		System.out.println("Enter Elements of Array: ");
		utility.insertInArrayString(array2);
		System.out.print("Enter the word: ");
		String search2 = utility.inputString();
		utility.insertionSortString(array2);
		System.out.println("Sorted List: ");
		utility.printIntString(array2);
		utility.binarySearchString(array2, search2);
		long stop2 = System.currentTimeMillis();
		long differnce2 = stop2-start2;
		System.out.println("Elapsed Time:"+differnce2+"\n");
		System.out.println("====================================================\n");

		// Insertion Sort Method for Integer
		System.out.println("3. Insertion Sort Method for Integer");
		start3 = System.currentTimeMillis();
		System.out.print("Enter Size of Array: ");
		int size3 = utility.inputInteger();
		int array3[] = new int[size3];
		System.out.println("Enter Elements of Array: ");
		System.out.println("(please enter integer values)");
		utility.insertInArrayInt(array3);
		utility.insertionSortInt(array3);
		System.out.println("Sorted Array: ");
		utility.printIntArr(array3);
		long stop3 = System.currentTimeMillis();
		long differnce3 = stop3-start3;
		System.out.println("Elapsed Time:"+differnce3+"\n");
		System.out.println("====================================================\n");

		// Insertion Sort Method for String
		System.out.println("4. Insertion Sort Method for String");
		start4 = System.currentTimeMillis();
		System.out.print("Enter Size of Array: ");
		int size4 = utility.inputInteger();
		String array4[] = new String[size4];
		System.out.println("Enter Elements of Array: ");
		System.out.println("(please enter string element)");;
		utility.insertInArrayString(array4);
		utility.insertionSortString(array4);
		System.out.println("Sorted Array: ");
		utility.printIntString(array4);
		long stop4 = System.currentTimeMillis();
		long differnce4 = stop4-start4;
		System.out.println("Elapsed Time:"+differnce4+"\n");
		System.out.println("====================================================\n");

		// Bubble Sort Method for Integer
		System.out.println("5. Bubble Sort Method for Integer");
		start5 = System.currentTimeMillis();
		System.out.print("Enter Size of Array: ");
		int size5 = utility.inputInteger();
		int array5[] = new int[size5];
		System.out.println("Enter Elements of Array: ");
		System.out.println("(please enter integer values)");
		utility.insertInArrayInt(array5);
		utility.bubbleSortInt(array5);
		System.out.println("Sorted Array: ");
		utility.printIntArr(array5);
		long stop5 = System.currentTimeMillis();
		long differnce5 = stop5-start5;
		System.out.println("Elapsed Time:"+differnce5+"\n");
		System.out.println("====================================================\n");

		// Bubble Sort Method for String
		System.out.println("6. Bubble Sort Method for String");
		start6 = System.currentTimeMillis();
		System.out.print("Enter Size of Array: ");
		int size6 = utility.inputInteger();
		String array6[] = new String[size6];
		System.out.println("Enter Elements of Array: ");
		System.out.println("(please enter string element)");
		utility.insertInArrayString(array6);
		utility.bubbleSortString(array6);
		System.out.println("Sorted Array: ");
		utility.printIntString(array6);
		long stop6 = System.currentTimeMillis();
		long differnce6 = stop6-start6;
		System.out.println("Elapsed Time:"+differnce6+"\n");
		System.out.println("====================================================\n");
		long time[] = new long[6];
		time[0] = differnce1;
		time[1] = differnce2;
		time[2] = differnce3;
		time[3] = differnce4;
		time[4] = differnce5;
		time[5] = differnce6;	
		System.out.println("Elapsed Time for all methods: ");
		for(int j=0; j<time.length; j++)
		{
			System.out.print(time[j]+" \n");
		}
		long temp;
		for(int i=0; i<time.length; i++)
		{
			for(int j=i+1; j<time.length; j++)
			{
				if(time[i]<time[j])
				{
					temp = time[j];
					time[j] = time[i];
					time[i] = temp;
				}
			}
		}
		System.out.println("\nElapsed time in descending order: ");
		for(int j=0; j<time.length; j++)
		{
			System.out.print(time[j]+" \n");
		}
		System.out.println();
		System.out.println("**END**");
	}
}
