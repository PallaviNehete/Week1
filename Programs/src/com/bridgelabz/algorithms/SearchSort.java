/*	To the Utility Class write the following static methods
	Desc -> Create Utility Class having following static methods
	binarySearch method for integer
	binarySearch method for String
	insertionSort method for integer
	insertionSort method for String
	bubbleSort method for integer
 	bubbleSort method for String
	I/P -> Write main function to call the utility function
	Logic -> Check using Stopwatch the Elapsed Time for every method call
 	O/P -> Output the Search and Sorted List. More importantly print elapsed time performance in descending order	*/


package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class SearchSort 
{
	public static void main(String[] args) 
	{
		Utility u=new Utility();
		long start1 = 0, start2=0,start3=0,start4=0,start5=0,start6=0;
		System.out.println("~~~~~ SEARCH SORT ~~~~~\n");
	
		// Binary Search Method for Integer
		System.out.println("1. Binary Search Method for Integer");
		start1=System.currentTimeMillis();
		System.out.print("Enter Size of Array: ");
		int size1=u.inputInteger();
		int array1[]=new int[size1];
		System.out.println("Enter Elements of Array: ");
		System.out.println("(please enter integer values)");
		u.InsertInArrayInt(array1);
		System.out.print("Enter the Number: ");
		int search1=u.inputInteger();
		u.InsertionSortInt(array1);
		System.out.println("Sorted List: ");
		u.printIntArr(array1);
		int k1=u.BinarySearchInt(array1, search1);
		if(k1==0)
		{
			System.out.println("not found");
		}
		else
		{
			System.out.println("String found at "+(k1+1)+" position");
		}
		long stop1=System.currentTimeMillis();
		long diff1=stop1-start1;
		System.out.println("Elapsed Time:"+diff1+"\n");
		System.out.println("====================================================\n");
		
		// Binary Search Method for String
		System.out.println("2. Binary Search Method for String");
		start2=System.currentTimeMillis();
		System.out.print("Enter Size of Array: ");
		int size2=u.inputInteger();
		String array2[]=new String[size2];
		System.out.println("Enter Elements of Array: ");
        u.InsertInArrayString(array2);
		System.out.print("Enter the word: ");
        String search2=u.inputString();
        u.InsertionSortString(array2);
        System.out.println("Sorted List: ");
        u.printIntString(array2);
        int k2=u.BinarySearchString(array2, search2);
        if(k2==0)
        {
        	System.out.println("not found");
        }
        else
        {
        	System.out.println("String found at "+(k2+1)+" position");
        }
		long stop2=System.currentTimeMillis();
		long diff2=stop2-start2;
		System.out.println("Elapsed Time:"+diff2+"\n");
		System.out.println("====================================================\n");
		
		// Insertion Sort Method for Integer
		System.out.println("3. Insertion Sort Method for Integer");
		start3=System.currentTimeMillis();
		System.out.print("Enter Size of Array: ");
		int size3=u.inputInteger();
		int array3[]=new int[size3];
		System.out.println("Enter Elements of Array: ");
		System.out.println("(please enter integer values)");
		u.InsertInArrayInt(array3);
		u.InsertionSortInt(array3);
		System.out.println("Sorted Array: ");
		u.printIntArr(array3);
		long stop3=System.currentTimeMillis();
		long diff3=stop3-start3;
		System.out.println("Elapsed Time:"+diff3+"\n");
		System.out.println("====================================================\n");
		
		// Insertion Sort Method for String
		System.out.println("4. Insertion Sort Method for String");
		start4=System.currentTimeMillis();
		System.out.print("Enter Size of Array: ");
		int size4=u.inputInteger();
		String array4[]=new String[size4];
		System.out.println("Enter Elements of Array: ");
		System.out.println("(please enter string element)");;
		u.InsertInArrayString(array4);
		u.InsertionSortString(array4);
		System.out.println("Sorted Array: ");
		u.printIntString(array4);
		long stop4=System.currentTimeMillis();
		long diff4=stop4-start4;
		System.out.println("Elapsed Time:"+diff4+"\n");
		System.out.println("====================================================\n");
		
		// Bubble Sort Method for Integer
		System.out.println("5. Bubble Sort Method for Integer");
		start5=System.currentTimeMillis();
		System.out.print("Enter Size of Array: ");
		int size5=u.inputInteger();
		int array5[]=new int[size5];
		System.out.println("Enter Elements of Array: ");
		System.out.println("(please enter integer values)");
		u.InsertInArrayInt(array5);
		u.BubbleSortInt(array5);
		System.out.println("Sorted Array: ");
		u.printIntArr(array5);
		long stop5=System.currentTimeMillis();
		long diff5=stop5-start5;
		System.out.println("Elapsed Time:"+diff5+"\n");
		System.out.println("====================================================\n");
		
		// Bubble Sort Method for String
		System.out.println("6. Bubble Sort Method for String");
		start6=System.currentTimeMillis();
		System.out.print("Enter Size of Array: ");
		int size6=u.inputInteger();
		String array6[]=new String[size6];
		System.out.println("Enter Elements of Array: ");
		System.out.println("(please enter string element)");
		u.InsertInArrayString(array6);
		u.BubbleSortString(array6);
		System.out.println("Sorted Array: ");
		u.printIntString(array6);
		long stop6=System.currentTimeMillis();
		long diff6=stop6-start6;
		System.out.println("Elapsed Time:"+diff6+"\n");
		System.out.println("====================================================\n");
		long time[]=new long[6];
		time[0]=diff1;
		time[1]=diff2;
		time[2]=diff3;
		time[3]=diff4;
		time[4]=diff5;
		time[5]=diff6;	
		System.out.println("Elapsed Time for all methods: ");
		for(int j=0;j<time.length;j++)
		{
			System.out.print(time[j]+" \n");
		}
		long temp;
		for(int i=0;i<time.length;i++)
		{
			for(int j=i+1;j<time.length;j++)
			{
				if(time[i]<time[j])
				{
					temp=time[j];
					time[j]=time[i];
					time[i]=temp;
				}
			}
		}
		System.out.println("\nElapsed time in descending order: ");
		for(int j=0;j<time.length;j++)
		{
			System.out.print(time[j]+" \n");
		}
		System.out.println();
		System.out.println("**END**");
	}
}
