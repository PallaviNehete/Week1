package com.bridgelabz.datastructure;
public class Prime2D 
{
	public static void main(String[] args) 
	{
		Prime2D prime = new Prime2D();
		int primeMatrix[][]=new int[10][25];
		int temp[] = new int [250];
		int i = 0, j;
		int k = 1; 
		while(i < 250)
		{
			if(prime.isPrime(k)==true)
			{
				temp[i] = k;
				i++;
			}
			k++;
		}
		int x = 0;
		for(i=0; i<10; i++)
		{
			for(j=0; j<25; j++)
			{
				primeMatrix[i][j] = temp[x];
				x++;
			}
		}


		System.out.println("The Final Array is : ");

		for(i=0; i<10; i++)
		{
			for(j=0; j<25; j++)
			{
				while(primeMatrix[i][j] < 1000)
					System.out.print(primeMatrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
	boolean isPrime(int number) 
	{
		int count = 0;
		for(int i = 1; i<=number; i++)
		{
			if(number%i == 0)
				count++;
		}
		if(count == 2)
			return true;
		else
			return false;
	}
}
