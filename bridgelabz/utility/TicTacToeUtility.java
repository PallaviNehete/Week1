/**
 * created by: Pallavi Nehete.
 * Date: 22/02/2019.
 * Purpose: Putting all the functions of Tic-Tac-Toe Game in single file.
 */

package com.bridgelabz.utility;
import java.util.Random;
public class TicTacToeUtility 
{
	Utility utility = new Utility();
	Random rd = new Random(3);
	final String Board[][] = new String [3][3];
	String check = "";
	
	/**
	 * method to start Tic Tac Toe Game. 
	 */
	public void play()
	{
		setBoard();
		displayBoard();
		do 
		{
			player();
			displayWinner();
			gameTie();
			computer();
			displayWinner();
			gameTie();
		}while(check!= "no");
	}

	/**
	 * method to set Tic Tac Toe Board.
	 */
	public void setBoard()
	{
		Board[0][0] = "1";
		Board[0][1] = "2";
		Board[0][2] = "3";
		Board[1][0] = "4";
		Board[1][1] = "5";
		Board[1][2] = "6";
		Board[2][0] = "7";
		Board[2][1] = "8";
		Board[2][2] = "9";
	}	
	
	/**
	 * method to display Tic Tac Toe Board.
	 * 		1	|	2	|	3
	 * 		------------------	
	 * 		4	|	5	|	6
	 * 		------------------
	 * 		7	|	8	|	9
	 */
	public void displayBoard()
	{
		System.out.println(Board[0][0]+" | "+Board[0][1]+" | "+Board[0][2]);
		System.out.println("----------");
		System.out.println(Board[1][0]+" | "+Board[1][1]+" | "+Board[1][2]);
		System.out.println("----------");
		System.out.println(Board[2][0]+" | "+Board[2][1]+" | "+Board[2][2]);
	}
	
	/**
	 * method to display winner.
	 * @return : return false for winning commuter as well as user, otherwise return true.
	 */
	public boolean displayWinner()
	{
		if((Board[0][0] == "X" && Board[0][1] == "X" && Board[0][2] == "X") ||
				(Board[1][0] == "X" && Board[1][1] == "X" && Board[1][2] == "X") ||
				(Board[2][0] == "X" && Board[2][1] == "X" && Board[2][2] == "X") ||
				(Board[0][0] == "X" && Board[1][0] == "X" && Board[2][0] == "X") ||
				(Board[0][1] == "X" && Board[1][1] == "X" && Board[2][1] == "X") ||
				(Board[0][2] == "X" && Board[1][2] == "X" && Board[2][2] == "X") ||
				(Board[0][0] == "X" && Board[1][1] == "X" && Board[2][2] == "X") ||
				(Board[2][0] == "X" && Board[1][1] == "X" && Board[0][2] == "X"))
		{
			System.out.println("\nWell Played\nComputer win...");
			System.out.println("\n*Do you want to play Again?");
			System.out.println("(Type yes if you want to play)");
			check = utility.inputString();
			if(check!= "no")
			{
				play();
			}
			return false;
		}
		else if((Board[0][0] == "O" && Board[0][1] == "O" && Board[0][2] == "O") ||
				(Board[1][0] == "O" && Board[1][1] == "O" && Board[1][2] == "O") ||
				(Board[2][0] == "O" && Board[2][1] == "O" && Board[2][2] == "O") ||
				(Board[0][0] == "O" && Board[1][0] == "O" && Board[2][0] == "O") ||
				(Board[0][1] == "O" && Board[1][1] == "O" && Board[2][1] == "O") ||
				(Board[0][2] == "O" && Board[1][2] == "O" && Board[2][2] == "O") ||
				(Board[0][0] == "O" && Board[1][1] == "O" && Board[2][2] == "O") ||
				(Board[2][0] == "O" && Board[1][1] == "O" && Board[0][2] == "O"))
		{
			System.out.println("\nWell Played\nCongratulations...You win...");
			System.out.println("\n*Do you want to play Again?");
			System.out.println("(Type yes if you want to play)");
			check= utility.inputString();
			if(check!= "no")
			{
				play();
			}
			return false;
		}
		return true;
	}
	
	/**
	 * method to check for draw condition.
	 */
	public void gameTie()
	{
		if(!displayWinner())
		{
			System.out.println("Game Tie...");
			System.out.println("*Do you want to play Again?");
			System.out.println("Type yes if you want to play otherwise no");
			check= utility.inputString();
			if(check!= "no")
			{
				play();
			}
		}
	}
	/**
	 * method for playing by user.
	 */
	public void player()
	{
		System.out.println("\nYour Turn");
		System.out.println("Enter X and Y Positions:");
		int x = utility.inputInteger();
		int y = utility.inputInteger();
		System.out.println("You choose "+x+" and "+y+" Positions.");
		if(x>=0 && y<3)
		{
			if((Board[x][y]!="X") && (Board[x][y]!="O"))
			{
				Board[x][y]="O";
				displayBoard();
				displayWinner();
			}
			else
			{
				System.out.println("Position "+x+" and "+y+" is Occupied... (try again)");
				player();
			}
		}
		else
		{
			System.out.println("*Invalid Positions\t(try again)");
			player();
		}
	}
	
	/**
	 * method for playing by computer.
	 */
	public void computer()
	{
		System.out.println("\nComputer Turn");
		int x = rd.nextInt(3);
		int y = rd.nextInt(3);
		System.out.println("Computers choose "+x+" and "+y+" Positions.");
		if((Board[x][y]!="X") && (Board[x][y]!="O"))
		{
			Board[x][y]="X";
			displayBoard();
			displayWinner();
		}
		else
		{
			System.out.println("Position "+x+" and "+y+" is Occupied...");
			computer();
		}
	}
}
