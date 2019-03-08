/**
 * created by: Pallavi Nehete.
 * Date: 27/02/2019.
 * Purpose: Program which creates Banking Cash Counter where people come in to deposit Cash and withdraw Cash.
 */

package com.bridgelabz.datastructure;
import com.bridgelabz.utility.Utility;
public class Banking 
{
	public static void main(String[] args) 
	{
		int deposite = 0, balance = 0;
		String check;
		Utility utility = new Utility();
		BankingQueueClass queue = new BankingQueueClass();
		do
		{
			System.out.println("\n\t~~~~~ BANKING CASH COUNTER ~~~~~");
			System.out.println("\t      ====================\n");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Number of people in the Queue ");
			System.out.println("4. Exit\n");
			System.out.print("Enter Your Choice: ");
			int choice = utility.inputInteger();
			switch(choice)
			{
			case 1:
				System.out.print("Enter Amount you want to deposit: ");
				deposite = utility.inputInteger();
				if(deposite > 0)
				{
					queue.Enqueue(deposite);
					System.out.println("You deposeted "+deposite+" in Bank");
				}
				else
					System.out.println("\n*Please Enter valid Amount.");
				break;
			case 2:
				System.out.print("Enter Amount you want to withdraw: ");
				int withdraw = utility.inputInteger();
				if(withdraw > 0)
				{
					if(deposite >= withdraw)
					{
						queue.Dequeue();
						System.out.println("You withdraw "+withdraw+" from Bank");
						balance = deposite-withdraw;
						System.out.println("Your current balance is: "+balance);
					}
					else
						System.out.println("\n*Your Balance is less than Withdraw Amount");
				}
				else
					System.out.println("\n*Please Enter valid Amount.");
				break;
			case 3:
				int count = queue.count();
				if(count > 0)
					System.out.println(count+" Peoples are in queue.");
				else
					System.out.println("Queue is empty.");
				break;
			case 4:
				System.out.println("\nEXIT");
				System.exit(0);
				break;
			default:
				System.out.println("\n*Please Enter Valid Choice.");
				break;
			}
			System.out.println("\n*Do you want to continue? ");
			System.out.println("(type yes if you want to continue otherwise press any key to exit)");
			check = utility.inputString();
			System.out.println("\n============================================");
		}
		while(check.compareToIgnoreCase("yes") == 0);
	}
}
