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
		int depo=0,bal=0;
		String check;
		Utility u=new Utility();
		QueueClass q=new QueueClass();
		do
		{
			System.out.println("\n\t~~~~~ BANKING CASH COUNTER ~~~~~");
			System.out.println("\t      ====================\n");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Number of people in the Queue ");
			System.out.println("4.Exit\n");
			System.out.print("Enter Your Choice: ");
			int ch=u.inputInteger();
			switch(ch)
			{
			case 1:
				System.out.print("Enter Amount you want to deposit: ");
				depo=u.inputInteger();
				if(depo>0)
				{
					q.Enqueue(depo);
					System.out.println("You deposeted "+depo+" in Bank");
				}
				else
				{
					System.out.println("*Please Enter valid Amount");
				}
				break;
			case 2:
				System.out.print("Enter Amount you want to withdraw: ");
				int withd=u.inputInteger();
				if(withd>0)
				{
					if(depo>=withd)
					{
						q.Dequeue(withd);
						System.out.println("You withdraw "+withd+" from Bank");
						bal=depo-withd;
						System.out.println("Your current balance is: "+bal);
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
				q.countPrint();
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
			check=u.inputString();
			System.out.println("\n============================================");
		}
		while(check.compareToIgnoreCase("yes")==0);
	}
}
