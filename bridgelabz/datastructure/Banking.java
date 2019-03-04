/*	Simulate Banking Cash Counter
	Desc -> Create a Program which creates Banking Cash Counter where people come in to deposit Cash and withdraw Cash.
	Have an input panel to add people to Queue to either deposit or withdraw money and dequeue the people. Maintain the Cash Balance.
	I/P -> Panel to add People to Queue to Deposit or Withdraw Money and dequeue 
	Logic -> Write a Queue Class to enqueue and dequeue people to either deposit or withdraw money and maintain the cash balance
	O/P -> True or False to Show Arithmetic Expression is balanced or not.	*/

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
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Number of people in the Queue ");
			System.out.println("4.Exit\n");
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
				{
					System.out.println("*Please Enter valid Amount");
				}
				break;
			case 2:
				System.out.print("Enter Amount you want to withdraw: ");
				int withdraw = utility.inputInteger();
				if(withdraw > 0)
				{
					if(deposite >= withdraw)
					{
						queue.Dequeue(withdraw);
						System.out.println("You withdraw "+withdraw+" from Bank");
						balance = deposite-withdraw;
						System.out.println("Your current balance is: "+balance);
					}
					else
					{
						System.out.println("*Your Balance is less than Withdraw Amount");
					}
				}
				else
				{
					System.out.println("*Please Enter valid Amount");
				}
				break;
			case 3:
				queue.countPrint();
				break;
			case 4:
				System.out.println("EXIT");
				System.exit(0);
				break;
			default:
				System.out.println("\n*Please Enter Valid Choice");
				break;
			}
			System.out.println("\n*Do you want to continue? ");
			System.out.println("(type yes if you want to continue)");
			check = utility.inputString();
			System.out.println("\n============================================");
		}
		while(check.compareToIgnoreCase("yes") == 0);
	}
}
